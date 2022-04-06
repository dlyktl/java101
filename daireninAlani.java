import java.util.Scanner;

public class daireninAlani {
    public static void main(String[] args){
        int cap, macı;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        cap = input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz: ");
        macı = input.nextInt();

        double dairealan;
        dairealan = (3.14 * Math.pow(cap, 2) * macı )/360;

        System.out.print("Dairenin alanı: " + dairealan);
    }
}
