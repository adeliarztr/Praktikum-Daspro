package PRAKTIKUM08;
import java.util.Scanner;
public class Tugas202 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Scanner scanner = new Scanner(System.in);
    String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
    String[][] atlet = new String[cabangOlahraga.length][5];
    System.out.println("Masukkan nama atlet untuk setiap cabang olahraga");

        for (int i = 0; i < cabangOlahraga.length; i++) {
            String namaAtlet= "";
            System.out.println("Cabang: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Nama Atlet " + (j + 1) + ": ");
                namaAtlet += scanner.nextLine() + " ";
            }
            System.out.println(namaAtlet);
        }
        System.out.println("Daftar Atlet yang Terdaftar:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + atlet[i][j]);
            }
        }

    }
}
