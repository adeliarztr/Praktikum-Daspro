import java.util.Scanner;
public class Bank02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;
        persentaseBunga = 0.0002;
        System.out.print("Masukan jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.print("Masukan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();
        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;
        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir:" + tabunganAkhir);


    }
    
}
