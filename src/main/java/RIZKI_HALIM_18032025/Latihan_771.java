/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_18032025;

/**
 *
 * @author USER
 */
public class Latihan_771 {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Menggunakan while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
        System.out.println("\nMenggunakan do-while:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
        System.out.println("\nMenggunakan for-loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}

