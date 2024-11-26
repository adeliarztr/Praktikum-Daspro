package PRAKTIKUM11;
import java.util.Scanner;;
public class Kafe02 {

        public static void Menu(String namaPelanggan, boolean isMember, String kodePromo ) { // modifikasi kode promo
            System.out.println("Selamat Datang," + namaPelanggan + "!");
            if (isMember) {
                System.out.println("Ada adalah Member, dapatkan diskon 10% untuk setiap pembelian!");
            } // modifikasi 
            if (kodePromo. equalsIgnoreCase("DISKON50")) {
                System.out.println("Anda Mendapat diskon 50%");
            }else if (kodePromo. equalsIgnoreCase("DISKON30")) {
                System.out.println("Anda mendapat Diskon 30 %");
            }else{
                System.out.println("kode promo tidak valid");
            }

            
            
            System.out.println("=======MENU RESTO KAFE======");
            System.out.println(" 1. Kopi Hitam   - Rp 15,000");
            System.out.println(" 2. Cappucino    - Rp 15,000");
            System.out.println(" 3. Latte        - Rp 15,000");
            System.out.println(" 4. Teh Tarik    - Rp 15,000");
            System.out.println(" 5. Roti Bakar   - Rp 15,000");
            System.out.println(" 6. Mie Goreng   - Rp 15,000");
            System.out.println(" ============================");
            System.out.println("Silahkan pilih menu yang Anda inginkan :)");
        }
        public static void main(String[] args) {
            Menu("Andi", true, "DISKON50");
        }

    }


