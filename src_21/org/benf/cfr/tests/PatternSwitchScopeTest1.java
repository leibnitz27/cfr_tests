package org.benf.cfr.tests;

import java.util.List;

/*
 * Compact stress test for decompiling a large Java 21 pattern-switch
 * EXPRESSION. Structurally modelled on jdk-24 java.base
 * jdk.internal.classfile.impl.verifier.ParserVerifier.verifyAttribute
 */
public class PatternSwitchScopeTest1 {
    sealed interface Attr permits AnnotationDefault, BootstrapMethods, CharacterRangeTable,
            Code, CompilationID, ConstantValue, Deprecated, EnclosingMethod, Exceptions,
            InnerClasses, LineNumberTable, LocalVariableTable, LocalVariableTypeTable,
            MethodParameters, Module, ModuleHashes, ModuleMainClass, ModulePackages,
            ModuleResolution, ModuleTarget, NestHost, NestMembers, PermittedSubclasses,
            Record, RtVisAnn, RtInvisAnn, RtVisTypeAnn, RtInvisTypeAnn, RtVisParamAnn,
            RtInvisParamAnn, Signature, SourceDebugExtension, SourceFile, SourceID,
            StackMapTable, Synthetic, Unknown, Custom {}
    record AnnotationDefault(int v) implements Attr {}
    record BootstrapMethods(int v) implements Attr {}
    record CharacterRangeTable(int v) implements Attr {}
    record Code(int v) implements Attr {}
    record CompilationID(int v) implements Attr {}
    record ConstantValue(int v) implements Attr {}
    record Deprecated(int v) implements Attr {}
    record EnclosingMethod(int v) implements Attr {}
    record Exceptions(int v) implements Attr {}
    record InnerClasses(List<Integer> v) implements Attr {}
    record LineNumberTable(int v) implements Attr {}
    record LocalVariableTable(int v) implements Attr {}
    record LocalVariableTypeTable(int v) implements Attr {}
    record MethodParameters(int v) implements Attr {}
    record Module(int v) implements Attr {}
    record ModuleHashes(int v) implements Attr {}
    record ModuleMainClass(int v) implements Attr {}
    record ModulePackages(int v) implements Attr {}
    record ModuleResolution(int v) implements Attr {}
    record ModuleTarget(int v) implements Attr {}
    record NestHost(int v) implements Attr {}
    record NestMembers(int v) implements Attr {}
    record PermittedSubclasses(int v) implements Attr {}
    record Record(int v) implements Attr {}
    record RtVisAnn(int v) implements Attr {}
    record RtInvisAnn(int v) implements Attr {}
    record RtVisTypeAnn(int v) implements Attr {}
    record RtInvisTypeAnn(int v) implements Attr {}
    record RtVisParamAnn(int v) implements Attr {}
    record RtInvisParamAnn(int v) implements Attr {}
    record Signature(int v) implements Attr {}
    record SourceDebugExtension(byte[] v) implements Attr {}
    record SourceFile(int v) implements Attr {}
    record SourceID(int v) implements Attr {}
    record StackMapTable(int v) implements Attr {}
    record Synthetic(int v) implements Attr {}
    record Unknown(int v) implements Attr {}
    record Custom(int v) implements Attr {}

    enum TK { BOOLEAN, BYTE, CHAR, INT, SHORT, DOUBLE, FLOAT, LONG, REFERENCE, VOID }

    static TK tk(int x) { return TK.values()[Math.floorMod(x, TK.values().length)]; }
    static int payload(Attr a) { return 7; }

    void verifyAttribute(Attr a, List<String> errors) {
        int size = switch (a) {
            case AnnotationDefault aa -> aa.v();
            case BootstrapMethods bma -> 2 + bma.v();
            case CharacterRangeTable cra -> 2 + 14 * cra.v();
            case Code ca -> {
                if (ca.v() < 0) {
                    errors.add("Code attribute in native or abstract");
                }
                if (ca.v() > 100) {
                    errors.add("Arguments can't fit into locals");
                }
                yield 10 + ca.v();
            }
            case CompilationID cida -> {
                cida.v();
                yield 2;
            }
            case ConstantValue cva -> {
                int t = cva.v();
                if (!switch (tk(t)) {
                    case BOOLEAN, BYTE, CHAR, INT, SHORT -> t > 0;
                    case DOUBLE -> t == 2;
                    case FLOAT -> t == 3;
                    case LONG -> t == 4;
                    case REFERENCE -> t == 5;
                    case VOID -> false;
                }) {
                    errors.add("Bad constant value type");
                }
                yield 2;
            }
            case Deprecated _ -> 0;
            case EnclosingMethod ema -> {
                ema.v();
                yield 4;
            }
            case Exceptions ea -> 2 + 2 * ea.v();
            case InnerClasses ica -> {
                for (Integer ici : ica.v()) {
                    if (ici < 0) {
                        errors.add("Class is both outer and inner class");
                    }
                }
                yield 2 + 8 * ica.v().size();
            }
            case LineNumberTable lta -> 2 + 4 * lta.v();
            case LocalVariableTable lvta -> 2 + 10 * lvta.v();
            case LocalVariableTypeTable lvta -> 2 + 10 * lvta.v();
            case MethodParameters mpa -> 1 + 4 * mpa.v();
            case Module ma -> 16 + ma.v();
            case ModuleHashes mha -> 2 + mha.v();
            case ModuleMainClass mmca -> {
                mmca.v();
                yield 2;
            }
            case ModulePackages mpa -> 2 + 2 * mpa.v();
            case ModuleResolution mra -> 2;
            case ModuleTarget mta -> {
                mta.v();
                yield 2;
            }
            case NestHost nha -> {
                nha.v();
                yield 2;
            }
            case NestMembers nma -> {
                if (nma.v() < 0) {
                    errors.add("Conflicting NestHost and NestMembers");
                }
                yield 2 + 2 * nma.v();
            }
            case PermittedSubclasses psa -> {
                if (psa.v() < 0) {
                    errors.add("PermittedSubclasses attribute in final");
                }
                yield 2 + 2 * psa.v();
            }
            case Record ra -> ra.v();
            case RtVisAnn aa -> aa.v();
            case RtInvisAnn aa -> aa.v();
            case RtVisTypeAnn aa -> aa.v();
            case RtInvisTypeAnn aa -> aa.v();
            case RtVisParamAnn aa -> aa.v();
            case RtInvisParamAnn aa -> aa.v();
            case Signature sa -> {
                sa.v();
                yield 2;
            }
            case SourceDebugExtension sda -> sda.v().length;
            case SourceFile sfa -> {
                sfa.v();
                yield 2;
            }
            case SourceID sida -> {
                sida.v();
                yield 2;
            }
            case StackMapTable smta -> 2 + smta.v();
            case Synthetic _ -> 0;
            case Unknown _ -> -1;
            case Custom _ -> -1;
            default -> throw new AssertionError(a);
        };
        if (size >= 0 && size != payload(a)) {
            errors.add("Wrong attribute length");
        }
    }
}
