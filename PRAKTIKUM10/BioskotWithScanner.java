package PRAKTIKUM10;
import java.util.Scanner;
public class BioskotWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        
        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("=========Menu=========");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1: 
                    System.out.println("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.println("Masukan baris: ");
                    baris = sc.nextInt();
                    System.out.println("Masukan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input tidak valid! Baris harus antara 1-4 dan kolom antara 1-2.");
                    } else {
                        if (penonton[baris - 1][kolom - 1] != null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("data penonton berasil disimpan");  
                            break;  
                        }else{
                            System.out.println("Tempat telah terisi, silahkan pilih tempat lain");
                        }

                    }
                    break;

                case 2: 
                    System.out.println("=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }else{
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Keluar dari menu");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang benar.");
                    break;
            }
        }

        







    }
}
