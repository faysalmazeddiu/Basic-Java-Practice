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
public class PracticeWithDigit {
    
    public static void main(String args[]){
        int number=153;
        int temp=number,sum=0;
        
        //sum of degit  seperation
        /*
            while(temp!=0){
                int reminder=temp%10;
                sum=sum+reminder;
                //System.out.println(reminder);
                temp=temp/10;
            }
            System.out.println(sum);
        
        */
        
       /*
        // making reverse and check palindrom
        
             while(temp!=0){
                int reminder=temp%10;
                sum=sum*10+reminder;
                temp=temp/10;
             }
             if(sum==number){
                 System.out.println("Number is palindrom");
             }
       
        
        //
        */
        
            // check the number is Armostring
             while(temp!=0){
                int reminder=temp%10;
                sum=sum+reminder*reminder*reminder;
                temp=temp/10;
             }
             if(sum==number){
                 System.out.println("Number is Armostring");
             }else{
                 System.out.println("Number is not Armostring");
             }
           
        
    }
    
}
