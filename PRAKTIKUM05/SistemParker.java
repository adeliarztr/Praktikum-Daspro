package PRAKTIKUM05;
import java.util.Scanner;
public class SistemParker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = sc.nextLine().toLowerCase(); 
        
       
        int biayaParkir = 0;

       
        switch (jenisKendaraan) {
            case "mobil":
                biayaParkir = 5000; 
                break;
            case "motor":
                biayaParkir = 3000; 
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 'mobil' atau 'motor'.");
                sc.close();
                return;
        }

        
        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp" + biayaParkir);

        sc.close(); 
    }
}

    
