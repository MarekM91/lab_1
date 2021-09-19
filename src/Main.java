import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zad 1\n");

        System.out.println("Podaj imię:");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        System.out.println("Podaj wiek:");
        int wiek = scanner.nextInt();

        System.out.println("Podaj nr indeksu:");
        int nrIndeksu = scanner.nextInt();

        System.out.println(imie + " " + nazwisko + ", " + wiek + " lat, nr indeksu " + nrIndeksu + ".");
        System.out.printf("%s %s, %d lat, nr indeksu %d.", imie, nazwisko, wiek, nrIndeksu);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        System.out.println("\nZad 2\n");

        System.out.println("Podaj liczbę x:");
        int x = scanner.nextInt();

        System.out.println("Podaj liczbę y:");
        int y = scanner.nextInt();

        int dodawanie = x + y;
        System.out.println("Wynikiem dodawanie " + x + " + " + y + " = " + dodawanie);
        int odejmowanie = x - y;
        System.out.println("Wynikiem odejmowania " + x + " - " + y + " = " + odejmowanie);
        int mnożenie = x * y;
        System.out.println("Wynikiem mnożenia " + x + " * " + y + " = " + mnożenie);
        int dzielenie = x / y;
        System.out.println("Wynikiem dzielenia " + x + " / " + y + " = " + dzielenie);
        int modulo = x % y;
        System.out.println("Wynikiem modulo " + x + " % " + y + " = " + modulo);
    }
}
