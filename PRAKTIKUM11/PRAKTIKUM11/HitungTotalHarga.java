package PRAKTIKUM11;

import java.util.Scanner;

public class HitungTotalHarga {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%");
        } else {
            System.out.println("Kode invalid");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappuccino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakar - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 50 / 100;
            System.out.println("Selamat, Anda mendapat diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
            System.out.println("Selamat, Anda mendapat diskon 30%");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada pengurangan harga");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = 0;
        boolean tambahPesanan = true;

        while (tambahPesanan) {
            System.out.print("Masukkan nomor menu yang Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak valid. Silakan masukkan nomor menu yang tersedia.");
                continue;
            }

            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

            System.out.print("Apakah Anda ingin menambah menu lain? (y/n): ");
            char pilih = sc.next().toLowerCase().charAt(0);
            tambahPesanan = (pilih == 'y');
        }

        System.out.println("Total harga untuk seluruh pesanan Anda: Rp " + totalHarga);
    }
}
