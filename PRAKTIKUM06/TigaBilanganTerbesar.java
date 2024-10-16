package PRAKTIKUM06;
import java.util.Scanner;

public class TigaBilanganTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3;

        System.out.println("Masukan bilangan 1");
        bilangan1 = sc.nextInt();
        System.out.println("Masukan bilangan 2");
        bilangan2 = sc.nextInt();
        System.out.println("Masukan bilangan 3");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2 && bilangan1 > bilangan3) {
            System.out.println("Bilangan terbesar = " + bilangan1);    
        } else if (bilangan2 > bilangan3) {
            System.out.println("Bilangan terbesar = " + bilangan2);
        } else {
            System.out.println("Bilangan terbesar = " + bilangan3);      
        }
    }
}
