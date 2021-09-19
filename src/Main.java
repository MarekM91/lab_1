import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //int zmiennaInt = 7;
        //System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        System.out.println("Zad 1 \n");

        String zmiennaString = "Ćwiczenie 2";
        System.out.println("Zmienna String = " + zmiennaString);

        byte zmiennaByte = 6;
        System.out.println("Zmienna byte = " + zmiennaByte);

        short zmiennaShort = 8;
        System.out.println("Zmienna short = " + zmiennaShort);

        int zmiennaInt = 1991;
        System.out.println("Zmienna int = " + zmiennaInt);

        long zmiennaLong = 123567L;
        System.out.println("Zmienna long = " + zmiennaLong);

        float zmiennaFloat = 36.66f;
        System.out.println("Zmienna float = " + zmiennaFloat);

        double zmiennaDouble = 13214.214412;
        System.out.println("Zmienna double = " + zmiennaDouble);

        boolean zmiennaBoolean = true;
        System.out.println("Zmienna boolean = " + zmiennaBoolean);

        char zmiennaChar = 'm';
        System.out.println("Zmienna char = " + zmiennaChar);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        System.out.println("\nzad 2 \n");
        System.out.println("Operacje na liczbach całkowitych\n");

        int liczbaA = 15;
        int liczbaB = 30;

        int wynikDodawania = liczbaA + liczbaB;
        System.out.println(liczbaA + " + " + liczbaB + " = " + wynikDodawania);

        int wynikOdejmowania = liczbaB - liczbaA;
        System.out.println(liczbaB + " - " + liczbaA + " = " + wynikOdejmowania);

        int wynikMnożenia = liczbaA * liczbaB;
        System.out.println(liczbaA + " * " + liczbaB + " = " + wynikMnożenia);

        int wynikDzielenia = liczbaB / liczbaA;
        System.out.println(liczbaB + " / " + liczbaA + " = " + wynikDzielenia);

        int wynikModulo = liczbaB % liczbaA;
        System.out.println(liczbaB + " % " + liczbaA + " = " + wynikModulo);

        System.out.println("\nOperacje na liczbach zmiennoprzecinkowych\n");

        double liczbaC = 12.5;
        double liczbaD = 17.75;

        double wynikDodawaniaDouble = liczbaC + liczbaD;
        System.out.println(liczbaC + " + " + liczbaD + " = " + wynikDodawaniaDouble);

        double wynikOdejmowaniaDouble = liczbaD - liczbaC;
        System.out.println(liczbaD + " - " + liczbaC + " = " + wynikOdejmowaniaDouble);

        double wynikMnożeniaDouble = liczbaC * liczbaD;
        System.out.println(liczbaC + " * " + liczbaD + " = " + wynikMnożeniaDouble);

        double wynikDzieleniaDouble = liczbaD / liczbaC;
        System.out.println(liczbaD + " / " + liczbaC + " = " + wynikDzieleniaDouble);

        double wynikModuloDouble = liczbaD % liczbaC;
        System.out.println(liczbaD + " % " + liczbaC + " = " + wynikModuloDouble);
    }
}
