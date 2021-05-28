/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class VowelConsonent {
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter your Charecter = ");
        char c=s.next().charAt(0);
        if(c=='a' || c=='A'){
            System.out.println("The chareter is vowel");
        }
        else if(c=='e' || c=='E'){
            System.out.println("The chareter is vowel");
        }
        else if(c=='i' || c=='I'){
            System.out.println("The chareter is vowel");
        }
       else if(c=='0' || c=='O'){
            System.out.println("The chareter is vowel");
        }
        else if(c=='u' || c=='U'){
            System.out.println("The chareter is vowel");
        }else{
            System.out.println("The chareter is consonent");
        }
    }
    
}
