import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifListrik, penggunaanListrik, tagihan, listrikLebih;

        listrikLebih = 500;
        tarifListrik = 1500;

        int a=10;
        int b=5;
        a=b;

        System.out.print("Masukan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = sc.nextDouble();

        tagihan = penggunaanListrik * tarifListrik;
        System.out.println("Berikut merupakan tagihan listrik anda : "+tagihan);

        System.out.println("Apakah listrik lebih dari 500 kWh?:" +(listrikLebih < penggunaanListrik));



        
    }
}
