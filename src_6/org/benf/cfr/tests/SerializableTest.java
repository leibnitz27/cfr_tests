package org.benf.cfr.tests;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable {

    private static final long serialVersionUID = 0xDEADBEEFL;

    private final String name;
    private final int value;
    private transient String derived;

    public SerializableTest(String name, int value) {
        this.name = name;
        this.value = value;
        this.derived = name + ":" + value;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(derived);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.derived = in.readUTF();
    }

    private Object readResolve() {
        return this;
    }
}
