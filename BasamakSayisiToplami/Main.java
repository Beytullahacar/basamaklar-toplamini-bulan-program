package BasamakSayisiToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = scan.nextInt();

        while(sayi != 0){
            toplam += (sayi%10);
            sayi /= 10;
        }
        System.out.println("Basamaklar toplamı : " + toplam);
    }
}
