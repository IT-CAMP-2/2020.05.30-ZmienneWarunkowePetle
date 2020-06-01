public class Main5 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Pętla się kręci !! " + i);
        }*/

        int[] tab1 = new int[10];

        //pętla uzupełniająca tablicę
        /*for (int i = 0; i < 10; i++) {
            tab1[i] = i*2;
        }*/

        for (int i = 0; i < 20; i = i +2) {
            tab1[i/2] = i;
        }

        //pętla wyświetlająca tablicę
        for (int i = 0; i < 10; i++) {
            System.out.println(tab1[i]);
        }
    }
}
