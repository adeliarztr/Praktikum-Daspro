package PRAKTIKUM05;

import java.util.Scanner;
public class PemilihanHariDenganIf02 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nomor absen (1-7): ");
        int noAbsen = sc.nextInt();

        String hari = determineHari(noAbsen);

        if (hari != null) {
            System.out.println(hari);
        } else {
            System.out.println("Invalid Number");
        }

        sc.close(); 
    }

    private static String determineHari(int noAbsen) {
        switch (noAbsen) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "Weekday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return null; 
        }
    }
}
