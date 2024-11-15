package PRAKTIKUM08;
import java.util.Scanner;
public class Perulangan2B {
    public static void main(String[] args) {
        int i = 1;

            do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < i); // inner loop

            System.out.println();
            i++;
            } while (i <= 10); // outer loop


    }
}
