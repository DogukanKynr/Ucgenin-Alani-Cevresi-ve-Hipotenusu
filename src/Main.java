import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner girdi = new Scanner(System.in);

        System.out.print("İlk kenarı girniz : ");
        a = girdi.nextInt();

        System.out.print("İkinci kenarı giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs : " + c);


        System.out.print("\nAlan : " + (a*b)/2);
        System.out.println("\nÇevre : " + (a+b+c));



    }
}