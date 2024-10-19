package PRAKTIKUM07;
import java.util.Scanner;
public class Bioskop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  hargaTiket = 50000, jumlahTiket = 0, totalTiketTerjual=0;
        double diskon, totalPendaptanSehari= 0, totalBayar;

        while (true) {
            System.out.println("Masukan jumlah tiket yang dibeli (masukan 0 untuk keluar)");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if(jumlahTiket < 0) {
                System.out.println("jumlah tiket yag dimasukan tidak valid");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
                totalBayar = (jumlahTiket * hargaTiket) - (diskon* (jumlahTiket * hargaTiket));
                System.out.println("diskon yang anda dapatkan: " + diskon * 100 + "%");
                System.out.println("Total Bayar: " + totalBayar);
            
            }else if (jumlahTiket > 4) {
                diskon = 0.10;
                totalBayar = (jumlahTiket * hargaTiket) - (diskon * (jumlahTiket * hargaTiket));
                System.out.println("diskon yang ada dapatkan " + diskon * 100 + "%");
                System.out.println("Total bayar: " + totalBayar);
            } else {
                totalBayar = (jumlahTiket * hargaTiket);
                System.out.println("Maaf anda tidak mendapatkan diskon");
                System.out.println("Totalbayar: " + totalBayar);
            }
            totalTiketTerjual += jumlahTiket;
            totalPendaptanSehari += totalBayar;  
        }
        System.out.println("total tiket penjualan hari ini: " + totalTiketTerjual);
        System.out.println("total pendapatan hari ini: " + totalPendaptanSehari);
    }
}
