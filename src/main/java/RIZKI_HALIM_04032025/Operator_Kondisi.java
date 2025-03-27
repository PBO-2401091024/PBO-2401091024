/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_04032025;

/**
 *
 * @author USER
 */
public class Operator_Kondisi {
    public static void main( String[] args ){
 
  String  status = "";
  int grade = 80;
   
  //mendapatkan status pelajar
  status = (grade >= 60)?"Passed":"Fail";

  //print status 
  System.out.println( status );
    }
}
