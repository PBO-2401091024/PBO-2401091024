/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_20032025;

/**
 *
 * @author USER
 */
public class Latihan_842 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Silakan masukkan dua bilangan.");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2; 

            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);
        } catch (NumberFormatException e) {
            System.out.println("Silakan masukkan bilangan bulat");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

