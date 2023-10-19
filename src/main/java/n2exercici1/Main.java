package n2exercici1;


import n2exercici1.classes.*;

public class Main {
    public static void main (String[] args) {
        Persona persona = new Persona("Manel", "Sole", 30);
        String s = "Abracadabra";
        int i = 1900;

        //El primer argument ha de ser de tipus int, degut a la signatura del métode GenericMethodsv2
        //GenericMethods.genericPrint(persona, s, i); No funcionaria
        GenericMethodsv2.genericPrint(i, s, persona);
        System.out.println();
        GenericMethodsv2.genericPrint(i, persona, s);
    }
}
