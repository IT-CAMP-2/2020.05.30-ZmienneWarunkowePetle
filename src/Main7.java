public class Main7 {
    public static void main(String[] args) {
        int[] tab = {12,324,23,65};

        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }

        System.out.println(max);
    }
}
