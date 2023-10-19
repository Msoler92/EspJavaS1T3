package n1exercici2;

import n1exercici2.classes.*;

public class Main {
    public static void main (String[] args) {
        Persona persona = new Persona("Manel", "Sole", 30);
        String s = "Abracadabra";
        int i = 1900;


        GenericMethods.genericPrint(persona, s, i);
        System.out.println();
        GenericMethods.genericPrint(i, persona, s);
    }
}
