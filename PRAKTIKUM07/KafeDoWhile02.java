package PRAKTIKUM07;
import java.util.Scanner;
public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanngan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        
        do{
            System.out.println("Masukan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanngan = sc.nextLine();
            if (namaPelanngan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai. ");

    }
}
