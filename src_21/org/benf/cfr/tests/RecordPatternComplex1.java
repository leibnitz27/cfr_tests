package org.benf.cfr.tests;

public class RecordPatternComplex1 {
    sealed interface Json permits JNull, JBool, JNum, JStr, JArr, JObj {}
    record JNull() implements Json {}
    record JBool(boolean v) implements Json {}
    record JNum(double v) implements Json {}
    record JStr(String v) implements Json {}
    record JArr(java.util.List<Json> v) implements Json {}
    record JObj(java.util.Map<String, Json> v) implements Json {}

    record Pair(String key, Json value) {}

    static String render(Json j) {
        return switch (j) {
            case JNull() -> "null";
            case JBool(boolean b) -> b ? "true" : "false";
            case JNum(double n) when n == (long) n -> Long.toString((long) n);
            case JNum(double n) -> Double.toString(n);
            case JStr(String s) -> "\"" + s + "\"";
            case JArr(java.util.List<Json> xs) -> {
                StringBuilder sb = new StringBuilder("[");
                boolean first = true;
                for (Json x : xs) {
                    if (!first) sb.append(",");
                    sb.append(render(x));
                    first = false;
                }
                yield sb.append("]").toString();
            }
            case JObj(java.util.Map<String, Json> m) -> {
                StringBuilder sb = new StringBuilder("{");
                boolean first = true;
                for (java.util.Map.Entry<String, Json> e : m.entrySet()) {
                    if (!first) sb.append(",");
                    sb.append("\"").append(e.getKey()).append("\":").append(render(e.getValue()));
                    first = false;
                }
                yield sb.append("}").toString();
            }
        };
    }

    static int depth(Json j) {
        return switch (j) {
            case JArr(java.util.List<Json> xs) -> {
                int d = 0;
                for (Json x : xs) d = Math.max(d, depth(x));
                yield d + 1;
            }
            case JObj(java.util.Map<String, Json> m) -> {
                int d = 0;
                for (Json x : m.values()) d = Math.max(d, depth(x));
                yield d + 1;
            }
            default -> 0;
        };
    }

    static String describePair(Pair p) {
        return switch (p) {
            case Pair(String k, JNull()) -> k + "=null";
            case Pair(String k, JStr(String s)) -> k + "=str(" + s + ")";
            case Pair(String k, JNum(double n)) when n < 0 -> k + "=neg(" + n + ")";
            case Pair(String k, JNum(double n)) -> k + "=num(" + n + ")";
            case Pair(String k, Json v) -> k + "=other";
        };
    }

    public static void main(String[] args) {
        java.util.List<Json> arr = java.util.List.of(new JNum(1), new JNum(2.5), new JStr("hi"), new JNull());
        java.util.Map<String, Json> obj = new java.util.LinkedHashMap<>();
        obj.put("a", new JBool(true));
        obj.put("b", new JArr(arr));
        Json root = new JObj(obj);
        System.out.println(render(root));
        System.out.println(depth(root));
        System.out.println(describePair(new Pair("x", new JNull())));
        System.out.println(describePair(new Pair("y", new JStr("yo"))));
        System.out.println(describePair(new Pair("z", new JNum(-2))));
        System.out.println(describePair(new Pair("w", new JNum(5))));
        System.out.println(describePair(new Pair("v", new JBool(false))));
    }
}
