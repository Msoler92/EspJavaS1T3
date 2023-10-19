package n2exercici2.classes;

public class GenericMethodsv3 {
    @SafeVarargs
    public static <T> void genericPrint(T... varargs) {
        for (T t: varargs) {
            System.out.println(t);
        }
    }
}
