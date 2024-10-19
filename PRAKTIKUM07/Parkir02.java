package PRAKTIKUM07;
import java.util.Scanner;
public class Parkir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasi, total=0;

        do {
            System.out.println("Masukan Jenis Kendaraan (1 = mobil, 2= motor, 0= keluar) : ");
            
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0){
                break;
            }
            else if (jenisKendaraan == 1 || jenisKendaraan ==2) {
                System.out.println("masukan durasi parkir: ");
                durasi = sc.nextInt();
                
                if (durasi >5) {
                    total += 12500;
                } else if (jenisKendaraan == 1){
                    total += durasi *3000;  
                } else if (jenisKendaraan == 2){
                    total += durasi *2000;
                }
            } else {
                System.out.println("input tidak valid");
            }

        } while (jenisKendaraan != 0);
        System.out.println("harga yang harus dibyar: "+ total);
    }
}
