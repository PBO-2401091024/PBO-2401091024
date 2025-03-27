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
public class Array_Angka_Fibonaci {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) {
            return true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
    public static int[] getAngkaFibonacci(int[] data) {
        List<Integer> fibonacciList = new ArrayList<>();

        for (int num : data) {
            if (isFibonacci(num)) { 
                fibonacciList.add(num);
            }
        }
        int[] fibonacciArray = new int[fibonacciList.size()];
        for (int i = 0; i < fibonacciList.size(); i++) {
            fibonacciArray[i] = fibonacciList.get(i);
        }

        return fibonacciArray;
    }
    public static void main(String[] args) {
        int[] dataArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 13, 21, 34, 55, 89, 144, 200};

        int[] angkaFibonacci = getAngkaFibonacci(dataArray);

        System.out.println("Angka Fibonacci:");
        for (int num : angkaFibonacci) {
            System.out.print(num + " ");
        }
    }
} 

