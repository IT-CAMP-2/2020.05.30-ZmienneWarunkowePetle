public class Main3 {
    public static void main(String[] args) {
        String[] tab = new String[5];
        tab[1] = "Mateusz";
        System.out.println(tab[1]);

        System.out.println(tab[0]);

        int[] tablicaIntow = new int[5];

        tablicaIntow[0] = 4;

        System.out.println(tablicaIntow[0]);
        System.out.println(tablicaIntow[1]);

        char[] tablicaCharow = new char[5];
        System.out.println(tablicaCharow);

        int[][] twoDementionalTab = new int[3][3];

        twoDementionalTab[0][0] = 5;
        System.out.println(twoDementionalTab[0][0]);

        int[] test = {1,2,3,4,5};
        int[][] test2 = {{1,2,3}, {2,3,4}, {3,4,5}};
    }
}
