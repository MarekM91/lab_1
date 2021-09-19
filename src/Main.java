import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        System.out.println("Operatory arytmetyczne");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        System.out.println("Iloczyn logiczny - AND");
        System.out.println("(a && b) : " + (a && b));
        System.out.println("(a && c) : " + (a && c));
        System.out.println("(c && b) : " + (c && b));

        System.out.println("Różnica logiczna - OR");
        System.out.println("(a || b) : " + (a || b));
        System.out.println("(a || c) : " + (a || c));
        System.out.println("(c || b) : " + (c || b));

        System.out.println("Zaprzeczenie - NOT");
        System.out.println("!a : " + !a);
        System.out.println("!b : " + !b);
        System.out.println("!c : " + !c);

        System.out.println("Operatory logiczne");
        int x = 3;
        int y = 5;
        int z = 7;

        System.out.println("Porównanie");

        System.out.println("(x == y) : " + (x == y));
        System.out.println("(x == z) : " + (x == z));
        System.out.println("(z == y) : " + (z == y));

        System.out.println("Nierówne");

        System.out.println("(x != y) : " + (x != y));
        System.out.println("(x != z) : " + (x != z));
        System.out.println("(z != y) : " + (z != y));

        System.out.println("Większe");

        System.out.println("(x > y) : " + (x > y));
        System.out.println("(x > z) : " + (x > z));
        System.out.println("(z > y) : " + (z > y));

        System.out.println("Mniejsze");

        System.out.println("(x < y) : " + (x < y));
        System.out.println("(x < z) : " + (x < z));
        System.out.println("(z < y) : " + (z < y));

        System.out.println("Większe bądź równe");

        System.out.println("(x >= y) : " + (x >= y));
        System.out.println("(x >= z) : " + (x >= z));
        System.out.println("(z >= y) : " + (z >= y));

        System.out.println("Mniejsze bądź równe");

        System.out.println("(x <= y) : " + (x <= y));
        System.out.println("(x <= z) : " + (x <= z));
        System.out.println("(z <= y) : " + (z <= y));

    }
}
