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
public class SeriesPractice {
    // 2+4+5+6+.....n
    // 1+3+5+7+.....n
    // 1.5+2.5+3.5+....n
    public static void main(String[] args){
           Scanner s=new Scanner(System.in);
           System.out.print("Please Enter Range =");
           int number=s.nextInt();
           sumOfEvenSeries(number);
           sumOfOddSeries(number);
           sumOfFractionSeries(number);
    }
    
    // 2+4+6+8+.....n
    static void sumOfEvenSeries(int length){
        int sum=0;
        for(int i=2;i<=length;i=i+2){
           sum=sum+i;
           if(i<length && length%2==0){
               System.out.print(i+"+");
           }
           else if(i<length-1){
               System.out.print(i+"+");
           }else{
               System.out.print(i+"=");
           }
           
        }
        System.out.print(sum+"\n");
    }
    
    
      // 1+3+5+7+.....n
    static void sumOfOddSeries(int length){
        int sum=0;
        for(int i=1;i<=length;i=i+2){
           sum=sum+i;
           if(i<length-1){//9
               System.out.print(i+"+");
           }else{
               System.out.print(i+"=");
           }
           
        }
        System.out.print(sum+"\n");
    }
    
    // 1.5+2.5+3.5+....n
    
    static void sumOfFractionSeries(int length){
        double sum=0;
        double fraction=0.5;
        for(int i=1;i<=length;i=i+1){
           
           sum=sum+(fraction+i);
           if(i<length && length%2==0){//9
               System.out.print((fraction+i)+"+");
           }else if(i<length){
               System.out.print((fraction+i)+"+");
           }else{
               System.out.print((fraction+i)+"=");
           }
           
        }
        System.out.print(sum+"\n");
    }
    
    
}
