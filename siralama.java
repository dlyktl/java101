import java.util.Scanner;

public class siralama {
    public static void main(String[] args){
        int sayi1,sayi2,sayi3;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz.");
        sayi1 = input.nextInt();

        System.out.print("Lütfen bir sayı giriniz");
        sayi2 = input.nextInt();

        System.out.print("Lütfen bir sayı giriniz");
        sayi3 = input.nextInt();

        if(sayi1<sayi2 && sayi2<sayi3) {
            System.out.print("" + sayi1 + "<" + sayi2 + "<" + sayi3 + "");
        }else if(sayi1<sayi3 && sayi3<sayi2) {
            System.out.print("" + sayi1 + "<" + sayi3 + "<" + sayi2 + "");
        }else if(sayi2<sayi1 && sayi1<sayi3) {
            System.out.print("" + sayi2 + "<" + sayi1 + "<" + sayi3 + "");
        }else if(sayi2<sayi3 && sayi3<sayi1) {
            System.out.print("" + sayi2 + "<" + sayi3 + "<" + sayi1+"");
        }else if(sayi3<sayi2 && sayi2<sayi1){
            System.out.print(""+sayi3+ "<" +sayi2+ "<" +sayi1+"");
        }
        else{
            System.out.print("" +sayi3+ "<" +sayi1+ "<" +sayi2+"");
        }
    }
}
