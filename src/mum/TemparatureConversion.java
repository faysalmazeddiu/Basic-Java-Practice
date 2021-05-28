/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

/**
 *
 * @author BOSS
 */
public class TemparatureConversion {
     public static void main(String[] args){
         convertToFerenhight(30);
        convertToCelcious(86);
     }
     
     static void convertToFerenhight(int c){
        // int f=(9/5)*temparature+32;
         double f=1.8*c+32;
         System.out.println(f);
     }
     
     static void convertToCelcious(int f){
         double c =((f-32))/1.8;
         System.out.println(c);
     }
}


