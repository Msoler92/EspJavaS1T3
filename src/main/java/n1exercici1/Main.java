package n1exercici1;

import n1exercici1.classes.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods testObj1 = new NoGenericMethods("A", "B", "C");
        NoGenericMethods testObj2 = new NoGenericMethods("B", "C", "A");
        System.out.println("Objecte 1: " + testObj1);
        System.out.println("Objecte 2: " + testObj2);
    }

}
