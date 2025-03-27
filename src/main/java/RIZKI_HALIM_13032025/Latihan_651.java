/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_13032025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author USER
 */
public class Latihan_651 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan nilai ujian 1: ");
            double nilai1 = Double.parseDouble(reader.readLine());
            System.out.print("Masukkan nilai ujian 2: ");
            double nilai2 = Double.parseDouble(reader.readLine());
            System.out.print("Masukkan nilai ujian 3: ");
            double nilai3 = Double.parseDouble(reader.readLine());

            double rataRata = (nilai1 + nilai2 + nilai3) / 3;

            System.out.printf("Nilai rata-rata: %.2f\n", rataRata);
            if (rataRata >= 60) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }
        } catch (IOException e) {
            System.out.println("Error.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }
    }
}
