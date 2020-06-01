public class Main6 {
    public static void main(String[] args) {
        int[][] tab1 = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                tab1[i][j] = i*j;
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
