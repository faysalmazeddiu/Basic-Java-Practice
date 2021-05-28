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
public class FibonacciSeries {
    
    public static void main(String args[]){
        fibonacciSerise();
    }
    
    static void fibonacciSerise(){
        int firstNumber=0,secondNumber=1,result=0;
        System.out.print(firstNumber+" "+secondNumber);
        for(int i=1;i<=10;i++){
           result= firstNumber+secondNumber;
           firstNumber=secondNumber;
           secondNumber=result;
           System.out.print(" "+result);
        }
    }
    
}
