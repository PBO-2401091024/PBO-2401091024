/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_13032025;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Latihan_654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();
        
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        
        double hasil = 1;
        int i = 0;

        while (i < pangkat) {
            hasil *= angka;
            i++;
        }

        System.out.printf("%.2f pangkat %d = %.2f\n", angka, pangkat, hasil);
        scanner.close();
    }
}
