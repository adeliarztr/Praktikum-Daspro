package PRAKTIKUM05;
import java.util.Scanner;
public class Usia02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usia = -1;

        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan usia Anda: ");

        // Validasi input
        if (sc.hasNextInt()) {
            usia = sc.nextInt();
            if (usia < 0) {
                System.out.println("Input tidak valid. Usia harus angka positif.");
                return;
            }
        } else {
            System.out.println("Input tidak valid. Mohon masukkan angka.");
            return;
        }

        // Menentukan kategori usia
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        // Menampilkan kategori
        System.out.println("Kategori usia Anda: " + kategori);
    }
}
