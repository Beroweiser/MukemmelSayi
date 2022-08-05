import java.util.Scanner;

/**
 * MukemmelSayi
 */
public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.print("Bir Sayı giriniz : ");
            int sayi = inp.nextInt();
            int k = 1,toplam = 0; 
            while (k < sayi) {

                if (sayi % k == 0) {
                    
                    toplam += k;
                }
                k++;
            }
            

            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " mukemmel sayı değildir.");
            }
            

        }
        inp.close();
    }
}