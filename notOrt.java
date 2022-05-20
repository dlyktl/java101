import java.util.Scanner;

public class notOrt {
    public static void main(String[] args) {
        int matematik,muzik,turkce,kimya,fizik,ders = 0;
        double toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("HOŞGELDİNİZ :)");

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if (0<=fizik && 100>=fizik){
            toplam = toplam + fizik;
            ders = ders +1;
        }else {
            System.out.print("Lütfen 0 ve 100 arasında bir sayı giriniz.");
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        if (0<=kimya && 100>=kimya){
            toplam = toplam + kimya;
            ders = ders +1;
        }else {
            System.out.print("Lütfen 0 ve 100 arasında bir sayı giriniz.");
        }

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        if (matematik>= 0 && matematik<= 100){
            toplam = toplam + matematik;
            ders = ders +1;
        }else {
            System.out.print("Lütfen 0 ve 100 arasında bir sayı giriniz.");
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if (turkce>= 0 && turkce<= 100){
            toplam = toplam + turkce;
            ders = ders +1;
        }else {
            System.out.print("Lütfen 0 ve 100 arasında bir sayı giriniz.");
        }

        System.out.print("Müzik Notunuzu Griniz: ");
        muzik = input.nextInt();
        if (0<=muzik && 100>=muzik){
            toplam = toplam + muzik;
            ders = ders +1;
        }else {
            System.out.print("Lütfen 0 ve 100 arasında bir sayı giriniz.");
        }

        if (ders <1 ){
            System.out.print("Lütfen en az 1 geçerli not giriniz.");
        }else {
            double sonuc = toplam / ders;
        if(sonuc<55){
            System.out.print("Not Ortalamanız "+sonuc+" olduğundan sınıfı geçemediniz :( ");
        }else{
            System.out.print("Not ortalamanız "+sonuc+" sınıfı geçtiniz :)");
        }

        }

    }
}
