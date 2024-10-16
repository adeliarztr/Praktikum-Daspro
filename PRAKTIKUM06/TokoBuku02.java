package PRAKTIKUM06;
import java.util.Scanner;

public class TokoBuku02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah_buku;
        String jenis_buku, hari;
        double diskon = 0;

        System.out.println("Masukan Hari");
        hari = sc.nextLine();
        System.out.println("Masukan jenis buku");
        jenis_buku = sc.nextLine();
        System.out.println("Masukan jumlah buku");
        jumlah_buku = sc.nextInt();



        if (hari.equalsIgnoreCase("rabu")) {
            if (jenis_buku.equalsIgnoreCase("Kamus")) {
                diskon = 0.1;
                if (jumlah_buku > 2) {
                    diskon += 0.02;          
                } 
                System.out.println("Jumlah diskon anda : " + diskon);
            } else if  (jenis_buku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
                if (jumlah_buku > 3) {
                    diskon += 0.02;
                } else {
                diskon += 0.01;
            }
        } else {
            if (jumlah_buku > 3) {
                diskon = 0.05;
            } 
                 
        }
    }
    System.out.println("Jumlah diskon anda : " + String.format("%.2F", diskon));
    System.out.println("Jumlah diskon anda : " + diskon);
    }
}
