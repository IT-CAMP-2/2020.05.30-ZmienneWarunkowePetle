public class Main12 {
    public static void main(String[] args) {
        int[] tablica = {2,65,3,6,24,7,24,15};

        /*for (int mojaKolejnaLiczba : tablica) {
            if(mojaKolejnaLiczba % 3 == 0 &&  mojaKolejnaLiczba % 5 == 0) {
                System.out.println(mojaKolejnaLiczba + " Fizz Buzz");
            } else if(mojaKolejnaLiczba % 3 == 0) {
                System.out.println(mojaKolejnaLiczba + " Fizz");
            } else if(mojaKolejnaLiczba % 5 == 0) {
                System.out.println(mojaKolejnaLiczba + " Buzz");
            }
        }*/

        for (int mojaKolejnaLiczba : tablica) {
            boolean flag = false;
            if(mojaKolejnaLiczba % 3 == 0) {
                System.out.print(mojaKolejnaLiczba + " Fizz");
                flag = true;
            }
            if(mojaKolejnaLiczba % 5 == 0) {
                if(flag) {
                    System.out.print(" Buzz");
                } else {
                    System.out.print(mojaKolejnaLiczba + " Buzz");
                }
                flag = true;
            }
            if(flag) {
                System.out.println();
            }
        }
    }
}
