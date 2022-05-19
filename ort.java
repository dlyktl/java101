import java.util.Scanner;

public class ort {
    public static void main(String[] args) {

        int mat, gida, istatistik, markor;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Gıda notunuzu giriniz: ");
        gida = inp.nextInt();

        System.out.print("İstatistik notunuzu giriniz: ");
        istatistik = inp.nextInt();

        System.out.print("Markör notunuzu giriniz: ");
        markor = inp.nextInt();

        int toplam = ( mat + gida + istatistik + markor );
         double sonuc = toplam / 4.0;

         boolean gec = sonuc >= 60;

         String kaldımMı = gec ? "Tebrikler Geçtiniz" : "Kaldınız :( ";

         System.out.println("Not ortalamanız: " + sonuc);

         System.out.print(kaldımMı);


    }
}
