import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double Armut, Elma, Domates, Muz, Patlıcan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız? ");
        Armut = inp.nextInt();

        System.out.print("Kaç kilo elma aldınız? ");
        Elma = inp.nextInt();

        System.out.print("Kaç kilo domates aldınız? ");
        Domates = inp.nextInt();

        System.out.print("Kaç kilo muz aldınız? ");
        Muz = inp.nextInt();

        System.out.print("Kaç kilo patlıcan aldınız? ");
        Patlıcan = inp.nextInt();

        double toplam = (Armut * 2.14 + Elma * 3.67 + Domates * 1.11 + Muz * 0.95 + Patlıcan * 5);

        System.out.println("Toplam tutat: " + toplam);


    }
}

