package PRAKTIKUM09;

import java.util.Scanner;

public class ArayNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukan nilai akhir ke-" + i + ":");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int j = 0; j < nilaiAkhir.length; j++) {
            if (nilaiAkhir[j] > 70) {
                System.out.println("Mahasiswa ke-" + j + "lulus!"); 
            }else{ 
                System.out.println("Mahasiswa ke-" + j + "Tidak Lulus");
            }
            
        }

    }
}
