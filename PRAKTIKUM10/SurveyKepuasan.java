package PRAKTIKUM10;
import java.util.Scanner;
public class SurveyKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvey = new int[10][6];
        
        // a. Menyimpan hasil survei
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Input Responden ke-" + (i + 1));
            double totalPerResponden = 0;
            
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print("Jawaban survey " + (j + 1) + ": ");
                hasilSurvey[i][j] = sc.nextInt();
                totalPerResponden += hasilSurvey[i][j];
            }
        }
        
        // b. Menampilkan nilai rata-rata untuk setiap responden
        for (int i = 0; i < hasilSurvey.length; i++) {
            double totalPerResponden = 0;
            
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + (totalPerResponden / 6));
        }
        
        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("Rata-rata nilai setiap pertanyaan:");
        
        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;
            
            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            
            System.out.println("Pertanyaan " + (j + 1) + ": " + (totalPerPertanyaan / 10));
        }
        
        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalKeseluruhan = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        
        double rataRataKeseluruhan = totalKeseluruhan / 60.0;
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);
        
        sc.close();
    


    }
}
