/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

/**
 *
 * @author faysalmazed
 */
public class MUM4 {
    public static void main(String[] args){
        int m=1000;
        System.out.println(reverseFunction(m));
    }
    
    static int reverseFunction(int number){
       int sum=0;
       int temp=number;
           while(temp!=0) {
              int r=temp%10;
              sum=sum*10+r;
              temp=temp/10;
           }
           
           return sum;
        
    
    }
    
    
    
}
