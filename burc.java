import java.util.Scanner;

public class burc {
    public static void main(String[] arg){
        int ay,gun;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Doğduğunuz ayı sayı olarak giriniz: ");
        ay = input.nextInt();

        System.out.print("Lütfen Doğduğunuz Günü giriniz");
        gun = input.nextInt();

        if( ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Oğlak Burcusunuz");
            } else {
                System.out.print("Kova Burcusunuz");
            }
            else if (ay == 3) {
                if (gun >= 1 && gun <= 21) {
                    System.out.print("Balık Burcusunuz.");
                } else {
                    System.out.print("Koç Burcusunuz");
                }
            } else if (ay == 4) {
                if (gun >= 1 && gun <= 20) {
                    System.out.print("Koç Burcusunuz.");
                } else {
                    System.out.print("Nisan Burcusunuz");
                }
            } else if (ay == 5) {
                if (gun >= 1 && gun <= 21) {
                    System.out.print("Boğa Burcusunuz.");
                } else {
                    System.out.print("İkizler Burcusunuz");
                }
            } else if (ay == 6) {
                if (gun >= 1 && gun <= 22) {
                    System.out.print("İkizler Burcusunuz.");
                } else {
                    System.out.print("Yengeç Burcusunuz");
                }
            } else if (ay == 7) {
                if (gun >= 1 && gun <= 22) {
                    System.out.print("Yengeç Burcusunuz.");
                } else {
                    System.out.print("Aslan Burcusunuz");
                }
            } else if (ay == 8) {
                if (gun >= 1 && gun <= 22) {
                    System.out.print("Aslan Burcusunuz.");
                } else {
                    System.out.print("Başak Burcusunuz");
                }
            } else if (ay == 9) {
                if (gun >= 1 && gun <= 22) {
                    System.out.print("Başak Burcusunuz.");
                } else {
                    System.out.print("Terazi Burcusunuz");
                }
            } else if (ay == 10) {
                if (gun >= 1 && gun <= 22) {
                }
                System.out.print("Terazi Burcusunuz.");
            } else {
                System.out.print("Akrep Burcusunuz");
                }
            }
            else if (ay == 11 ) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Akrep Burcusunuz.");
            } else {

                System.out.print("Yay Burcusunuz");
            }
            }
            else if (ay == 12 ) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Yay Burcusunuz.");
            } else {
                System.out.print("Oğlak Burcusunuz");
            }
            }

        else{
            System.out.print("Lütfen geçerli bir tarih giriniz!!");
        }
        }

    }
}
