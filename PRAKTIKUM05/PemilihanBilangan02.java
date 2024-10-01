package PRAKTIKUM05;

import java.util.Scanner;

public class PemilihanBilangan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan sebuah angka: ");
        int angka = 4;

        String hasil;

        if (angka > 4) 
        {
            hasil="Bilangan ganjil";
        }
        else
        {
            hasil=" Bilangan genap";
            System.out.println(angka+ " adalah" + hasil);

    }
    
    }   
}