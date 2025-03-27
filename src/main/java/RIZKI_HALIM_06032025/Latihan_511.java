/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_06032025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author USER
 */
public class Latihan_511 {
    public static void main( String[] args ){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("masukkan kata1: ");
            String kata1 = reader.readLine();
            
            System.out.print("masukkan kata2: ");
            String kata2 = reader.readLine();
            
            System.out.print("masukkan kata3: ");
            String kata3 = reader.readLine();
            
            System.out.println(kata1 + " " + kata2 + " " + kata3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
