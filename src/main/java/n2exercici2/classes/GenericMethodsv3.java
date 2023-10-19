package n2exercici2.classes;

public class GenericMethodsv3 {
    public static <T> void genericPrint(T... varargs) {
        for (T t: varargs) {
            System.out.println(t);
        }
    }
}
