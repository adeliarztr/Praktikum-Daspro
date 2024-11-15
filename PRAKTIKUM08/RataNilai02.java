package PRAKTIKUM08;
import java.util.Scanner;
public class RataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai, nilaiMhs;

        i=1;
        while (i<=5) {
            System.out.println("input nilai Mhasiswa ke" +i);
            totalNilai=0;
            for (j=1; j<=5; j++) {
                System.out.println("Nilai Mahasiswa ke-" + j + "=");
                nilaiMhs=sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai= totalNilai/5;
            System.out.println("rata rata nilai Mahasiswa ke-" + i +  ":"  + rataNilai);
            
            
        }

    }
}
