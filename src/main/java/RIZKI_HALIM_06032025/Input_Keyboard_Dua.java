/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIZKI_HALIM_06032025;

import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Input_Keyboard_Dua {
   public static void main( String[] args ){
  String name = "";
  name = JOptionPane.showInputDialog("Please enter your name");
  String msg = "Hello " + name + "!";
  JOptionPane.showMessageDialog(null, msg);
  
 } 
}
