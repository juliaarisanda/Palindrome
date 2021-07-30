/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits.pkg5;

import java.util.Scanner;

/**
 *
 * @author ZULIA ARISANDA
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String kata, balikkata = "";
        
        System.out.print("Masukan Kata : ");
        kata = input.nextLine();
        int panjang = kata.length();
        
        for(int i=panjang-1; i>=0; i--){
            balikkata = balikkata + kata.charAt(i);
        }
        if (kata.equals(balikkata)){
            System.out.println("Kata termasuk Palindrome");
        }
        else{
            System.out.println("Kata bukan termasuk Palindrome");
        }
    }
    
}
