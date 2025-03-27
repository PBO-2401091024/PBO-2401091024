/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_20032025;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class Array_Bilangan_Ganjil {
    public static int[] getBilanganGanjil(int[] data) {
        List<Integer> ganjilList = new ArrayList<>();

        for (int num : data) {
            if (num % 2 != 0) { 
                ganjilList.add(num);
            }
        }
        int[] ganjilArray = new int[ganjilList.size()];
        for (int i = 0; i < ganjilList.size(); i++) {
            ganjilArray[i] = ganjilList.get(i);
        }

        return ganjilArray;
    }
    public static void main(String[] args) {
        int[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] bilanganGanjil = getBilanganGanjil(dataArray);

        System.out.println("Bilangan Ganjil:");
        for (int num : bilanganGanjil) {
            System.out.print(num + " ");
        }
    }
}

