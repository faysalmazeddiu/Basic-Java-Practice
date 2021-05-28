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
public class EvenOddIdentify {
    
    public static void main(String args[]){
        int[] array={12,23,22,34,1,5,6};
        printOddEven(array);
    }
    
    static void printOddEven(int[] arr){
        int totalEven=0,totalOdd=0;
        for(int number:arr){
            if(number%2==0){
                System.out.println("Even number ="+number);
                totalEven++;
            }else{
                System.out.println("odd number ="+number);
                totalOdd++;
            }
        }
        
        System.out.println("Total even numbber ="+totalEven+"\n Total Odd Number ="+totalOdd);
    
    }
    
}
