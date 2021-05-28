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
public class PrimeNumber {
    
    public static void main(String[] args){
        //checkPrimeNumber(5);
        //checkArrayElementForPrime(new int[]{12,34,11,23,16,3,5});
        System.out.println(PrimeChecker(5));
    }
    
   static  void checkPrimeNumber(int number){
        boolean isNumberPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isNumberPrime=false;
                break;
            }
        }
        if(isNumberPrime){
            System.out.println("the Number is  Prime");
        }else{
            System.out.println("the Number is not Prime");
        }
    }
    
    static void checkArrayElementForPrime(int[] array){
        
        for(int i=0;i<array.length;i++){
            boolean isNumberPrime=true;
            for(int j=2;j<array[i];j++){
                if(array[i]%j==0){
                    isNumberPrime=false;
                    break;
                }
            }
            if(isNumberPrime){
                System.out.print(array[i]+" ");
            }
           
        }
    
    }
    
    public static int PrimeChecker(int num) {
    // code goes here
    int count=0;
    for(int i=2;i<num;i++){
        if(num%i==0){
          count++;
          break;
        }
    }
    if(count==0){
       return 1;
    }  
    return 0;
  }
    
}
