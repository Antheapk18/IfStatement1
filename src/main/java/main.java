/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author anthe
 */
public class main {
   
   public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Enter a number between 1 and 10");
    int number = Integer.parseInt(input); // converting string to integer
    
    if (number < 5) {
        System.out.println("SUCH A SMOL NUMBER");
    } else {
        System.out.println("WOW BIG NUMBER");
    }
    
    }
}
