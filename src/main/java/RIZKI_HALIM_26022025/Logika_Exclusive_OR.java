/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_26022025;

/**
 *
 * @author USER
 */
public class Logika_Exclusive_OR {
   public static void main( String[] args ){
  
  boolean val1 = true;
  boolean val2 = true;
  System.out.println(val1 ^ val2);

  val1 = false;
  val2 = true;
  System.out.println(val1 ^ val2);
  
  val1 = false;
  val2 = false;
  System.out.println(val1 ^ val2);

  val1 = true;
  val2 = false;
  System.out.println(val1 ^ val2);
    } 
}
