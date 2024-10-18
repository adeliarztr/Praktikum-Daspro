package PRAKTIKUM07;
import java.util.Scanner;
public class SiakadFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertiggi =0, terendah =100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertiggi) {
                tertiggi = nilai;     
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahLulus++;
            } else 
                jumlahTidakLulus++;
        }    

        System.out.println("Nilai tertinggi: " + tertiggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: "+ jumlahLulus);
        System.out.println("jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

    }
    
}
