package PRAKTIKUM06;
import java.util.Scanner;
public class Pemilihan2Percobaan102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tahun;

        System.out.println("Masukan Tahun");
        tahun = sc.nextInt();

        if (tahun % 4 ==0 ) {
            System.out.println("Tahun kabisat");
            if (tahun % 100 == 0)  {
                if (tahun % 400 != 0) {
                    System.out.println("Bukan tahun kabisat");
                }
            }    
        } else {
            System.out.println(" Bukan tahun kabisat");
        }
        sc.close();
    }
}