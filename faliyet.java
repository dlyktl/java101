import java.util.Scanner;

public class faliyet {
    public static void main(String[] args){
        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik < 5){
            System.out.print("Bugün Kayak Yapabilirsiniz.");
        }else if (sicaklik>= 5 && sicaklik<= 15 ) {
            System.out.print("Bugün Sinemaya Gidebilirsiniz.");
            if (sicaklik> 15 && sicaklik<= 25) {
                System.out.print("Bugün Piknik Yapabilirsiniz.");
            }
        }else{
            System.out.print("Bugün yüzmeye gidebilirsiniz.");
        }
    }
}
