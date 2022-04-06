import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double ufiyat, kdvfiyat, kdvtutari, kdv;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz: ");
        ufiyat =inp.nextInt();

        kdv = (ufiyat > 1000) ? 0.08 : 0.18;
        kdvtutari = ufiyat * kdv;
        kdvfiyat = ufiyat + kdvtutari;

        System.out.println("KDV'siz Ürün fiyatı:" +ufiyat);
        System.out.println("KDV tutarı: " + kdvtutari);
        System.out.println("KDV'li ürün fiyatı: " +kdvfiyat);

    }
}
