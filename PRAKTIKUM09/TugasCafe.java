package PRAKTIKUM09;
import java.util.Scanner;
public class TugasCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("======MENU KAFE======");
        System.out.println("---------------------");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Roti Bakar");
        System.out.println("4. Kentang Goreng");
        System.out.println("5. Teh Tarik");
        System.out.println("6. Cappucino");
        System.out.println("7. Chocolate Ice");
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] daftarPesanan = new int[daftarMenu.length];
        
        String pilihMenu;
        int jumlahPesanan;
        double totalHarga = 0;

        while (true) {
            System.out.print("Masukkan nama menu (atau ketik 'selesai' untuk menyelesaikan pesanan): ");
            pilihMenu = sc.nextLine();

            if (pilihMenu.equalsIgnoreCase("selesai")) {
                break;
            }

            int indeksMenu = -1;
            for (int i = 0; i < daftarMenu.length; i++) {
                if (daftarMenu[i].equalsIgnoreCase(pilihMenu)) {
                    indeksMenu = i;
                    break;
                }
            }

            if (indeksMenu != -1) {
                System.out.print("Masukkan jumlah pesanan untuk " + pilihMenu + ": ");
                jumlahPesanan = sc.nextInt();
                sc.nextLine(); 

                daftarPesanan[indeksMenu] += jumlahPesanan;

                totalHarga += daftarHarga[indeksMenu] * jumlahPesanan;

                System.out.println("Pesanan " + pilihMenu + " sebanyak " + jumlahPesanan + " berhasil ditambahkan.");
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia. Silakan pilih menu lain.");
            }
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + " = " + (daftarHarga[i] * daftarPesanan[i]));
            }
        }
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);

    

    }
}
