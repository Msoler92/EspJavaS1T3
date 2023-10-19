package n2exercici2;


import n2exercici2.classes.*;

public class Main {
    public static void main (String[] args) {
        Persona persona1 = new Persona("Manel", "Sole", 30);
        Persona persona2 = new Persona("Clara", "Sole", 26);
        String s = "Abracadabra";
        int i = 1900;

        GenericMethodsv3.genericPrint(i, s, persona1);
        System.out.println();
        GenericMethodsv3.genericPrint(i, persona1, s, persona2);
    }
}
