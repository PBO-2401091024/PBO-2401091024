/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_18032025;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author USER
 */
public class Latihan_772 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
            try {
                numbers[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid. Silakan masukkan angka.");
                i--; 
            }
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + maxNumber);
    }
}  

