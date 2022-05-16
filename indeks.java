import java.util.Scanner;

public class indeks {
    public static void main(String[] args){
        double kilo, boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu metre cindinden giriniz: ");
        boy = input.nextDouble();

        double indeks;
        indeks = kilo / (boy * boy);

        System.out.print("Vucüt kitle indeksiniz: " + indeks);

    }
}