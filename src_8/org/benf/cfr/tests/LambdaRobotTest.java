package org.benf.cfr.tests;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 21/08/2013
 * Time: 13:59
 */
@FunctionalInterface
public interface LambdaRobotTest extends Consumer<Collection<Consumer<Robot>>> {
    public static LambdaRobotTest new_() {
        return keyEvents ->
                SwingUtilities.invokeLater(() ->
                        LambdaUtilities.andThen(
                                frame -> frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE),
                                frame -> frame.addKeyListener((LambdaFunctionalKeyListener.Pressed) keyEvent ->
                                        keyEvents.add(robot -> robot.keyPress(keyEvent.getKeyCode()))
                                ),
                                frame -> frame.addKeyListener((LambdaFunctionalKeyListener.Released) keyEvent ->
                                        keyEvents.add(robot -> robot.keyRelease(keyEvent.getKeyCode()))
                                ),
                                frame -> frame.addWindowListener((LambdaFunctionalWindowListener.Closing) event ->
                                        LambdaUtilities.delayedConsumer(3, TimeUnit.SECONDS, Robot.class)
                                                .andThen(
                                                        keyEvents.stream()
                                                                .parallel()
                                                                .reduce(Consumer::andThen)
                                                                .orElse(LambdaUtilities.nullConsumer())
                                                )
                                                .accept(
                                                        LambdaUtilities.andThenReturn(
                                                                (Robot robot) -> robot.setAutoDelay(1)
                                                        ).apply(LambdaUtilities.supplier(Robot::new).get())
                                                )
                                ),
                                JFrame::pack,
                                frame -> frame.setVisible(true)
                        ).accept(new JFrame("RobotTest"))
                )
                ;
    }

    public static void main(String... arguments) {
        new_().accept(new ArrayList<>());
    }
}
