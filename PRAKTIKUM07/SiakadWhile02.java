package PRAKTIKUM07;
import java.util.Scanner;
public class SiakadWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, jml;
        System.out.println("Masukan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("Masukan nilai Mahasiswa ke-" + (i + 1) + ":");
            int nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukan nilai yang valid");
                continue;
            }
            

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus pertahankan lagi nilainya");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + " adalah C+");
            } else if (nilai > 50 && nilai <=60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <=50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + " adalah E ");
            }
            i ++;

        }

    }
}
