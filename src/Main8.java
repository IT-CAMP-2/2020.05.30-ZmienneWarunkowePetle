public class Main8 {
    public static void main(String[] args) {
        int[] tab = {239,3,5,56,234,65};

        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 == 0) {
                System.out.println(tab[i]);
                break;
            }
        }
    }
}
