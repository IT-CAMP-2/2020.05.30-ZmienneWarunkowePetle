public class Main11 {
    public static void main(String[] args) {
        int[] tab = {213,54,76,34,6,57};
        int i = -1;
        while (true) {
            i++;
            if(i >= tab.length) {
                break;
            }

            if(tab[i]%2 == 1) {
                continue;
            }

            System.out.println(tab[i]*100);
        }
    }
}
