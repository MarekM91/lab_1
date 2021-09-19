import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */
        Scanner scanner = new Scanner(System.in);
        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        System.out.println("Zad 1");

        System.out.println("Podaj swój wiek:");
        int wiek = scanner.nextInt();
        if (wiek % 3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Nieppodzielny przez 3");
        }
        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("Zad 2");

        System.out.println("Podaj nr indeksu:");
        int nrIndeksu = scanner.nextInt();
        System.out.println(((nrIndeksu % 2) == 0) ? "Nr indeksu jest parzysty" : "Nr indeksu nie jest parzysty");

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("Zad 3");

        System.out.println("Podaj liczbę zmiennoprzecinkową:");
        double liczba = scanner.nextDouble();
        if (liczba < 5){
            System.out.println(liczba + " jest mniejsza niż 5.");
        }else if (liczba > 30){
            System.out.println(liczba + " jest większa niż 30.");
        }else if (liczba == 15){
            System.out.println(liczba + " jest równa 15.");
        }else {
            System.out.println(liczba + " jest większa niż 5, mniejsza niż 30 i nie jest równa 15");
        }
    }
}
