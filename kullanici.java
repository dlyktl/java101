import java.util.Scanner;

public class kullanici {
    public static void main(String[] args) {
        String kullaniciAdi,sifre,yeni;
        int secim,tsifre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        sifre = inp.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
            System.out.print("Başarılı Giriş!");
        }else {
            System.out.println("Başarısız Giriş!");
            System.out.println("1-Şifremi değiştimrek istiyorum\n2-Şifremi Değimek istemiyorum");
            System.out.print("Seçiminiz: ");
            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    Scanner kk = new Scanner(System.in);
                    System.out.println("Yeni Şifrenizi Giriniz:");
                    yeni = kk.nextLine();
                    if (yeni.equals("java123")) {
                        System.out.println("Yeni Şifre oluşturulamadı");
                    } else {
                        System.out.print("Yeni Şifre Oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.print("Yeniden Giriş Yapınız");
                    break;
                default:
                    System.out.print("Lütfen 1. veya 2. komutlardan birni seçiniz");

            }
        }
    }
}
