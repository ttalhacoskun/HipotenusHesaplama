import java.util.Scanner;
public class HipotenüsHesaplama {
    public static void main(String[] args) {
        int a,b;
        double c, u, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a= input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b= input.nextInt();


        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs : " + c);

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println(" Alan : " + alan);
    }
}
