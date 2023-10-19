package n3exercici1.classes;

public class Generica {
    public static <T extends Telefon> void trucar(T telefon) {
        telefon.trucar();
        //No es pot cridar telefon.ferFotos(), un métode de la classe Smartphone, ja que <T extends Telefon> no implica que <T extends Smartphone>
    }

    public static <T extends Smartphone> void ferFotos(T smartphone) {
        smartphone.ferFotos();
    }
}
