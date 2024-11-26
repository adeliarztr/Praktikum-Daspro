package PRAKTIKUM10;
import java.util.Scanner;
public class SiAkad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.println("Masukan jumlah Mata Kuliah");
        int jumlahMatakuliah = sc.nextInt();



        int [][] nilai = new int [4][3];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("input nilai mahasiswa ke-" + (i+ 1));
            double totalPersiswa = 0;

            for (int j=0; j< nilai.length; j++){
                System.out.println("Nilai mata kuliah " + (j+1) + ":" );
                nilai [i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("nilai rata-rata: " + totalPersiswa/3);
        }
        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j= 0; j<3; j++){
            double totalPerMatkul = 0;

            for (int i=0; i < 4; i++ ){
                totalPerMatkul += nilai [i][j];
            }
            System.out.println("Mata Kuliah" + (j+ 1) + ":" + totalPerMatkul/4);

        }

    }
}
