import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja;
        double bonus, pajak, upah, upahkotor, upahbonus, upahPajak, gajiAkhir;
        bonus =0.10;
        pajak = 0.05;
        upah =100000;

        System.out.print("Masukan jumlah jam kerja anda");
        jamKerja = sc.nextInt();

        upahkotor = jamKerja * upah;
        upahbonus =(bonus * upahkotor);
        System.out.println("upah anda sebelum bonus: " + upahkotor);
        System.out.println("upah anda setelah bonus 10% : Rp. " +(upahkotor + upahbonus));


        upahPajak = (pajak * (upahkotor));
        System.out.println("upah anda setelah pajak 5%:Rp." + (upahbonus + upahkotor - upahPajak));



    }
    
}

