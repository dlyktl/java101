import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int n1, n2, mod;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkartma\n3-Bölme\n4-Çarpma");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:");
        mod = input.nextInt();

        switch (mod){
            case 1:
                System.out.println("İşleminiz sonucu: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("İşleminiz sonucu: "+(n1 - n2));
                break;
            case 3:
                if(n2!=0){
                    System.out.print("İşleminizin sonucu: "+(n1/n2));
                }else {
                    System.out.print("Bir sayı sıfıra bölünemez.");
                }
                break;
            case 4:
                System.out.println("İşleminiz sonucu: "+ (n1 * n2));

            default:
                System.out.println("Hatalı komut girdiniz");
        }
    }
}

