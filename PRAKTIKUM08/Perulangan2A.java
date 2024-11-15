package PRAKTIKUM08;
import java.util.Scanner;
public class Perulangan2A { public static void main(String[] args) {
    int i = 10;

        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < i); // inner loop

            System.out.println();
            i--;
        } while (i > 0); //outer

}
    
}
