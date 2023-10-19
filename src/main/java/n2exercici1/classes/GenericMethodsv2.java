package n2exercici1.classes;

public class GenericMethodsv2 {
    public static <T2, T3> void genericPrint(int s1, T2 t2, T3 t3) {
        System.out.println("Argument 1 (not generic): " + s1);
        System.out.println("Argument 2 (generic): " + t2);
        System.out.println("Argument 3 (generic): " + t3);
    }
}
