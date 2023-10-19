package n1exercici2.classes;

public class GenericMethods {
    public static <T1, T2, T3> void genericPrint(T1 t1, T2 t2, T3 t3) {
        System.out.println("Argument 1: " + t1);
        System.out.println("Argument 2: " + t2);
        System.out.println("Argument 3: " + t3);
    }
}
