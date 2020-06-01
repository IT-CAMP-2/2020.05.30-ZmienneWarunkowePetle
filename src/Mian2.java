public class Mian2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean wynik = a == b;

        System.out.println(wynik);

        int liczba1 = 5;
        int liczba2 = 5;

        boolean wynikLiczb = liczba1 == liczba2;

        System.out.println(wynikLiczb);

        String s1 = "a";
        String s2 = "a";

        System.out.println(s1 == s2);

        boolean negacja = false;

        System.out.println(!negacja);

        /*int i = 0;
        i = i + 1;
        System.out.println(i);*/

        int i = 0;
        System.out.println(i++);
        System.out.println(++i);

        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

    }
}
