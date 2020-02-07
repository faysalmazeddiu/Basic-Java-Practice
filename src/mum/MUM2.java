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
public class MUM2 {
    public static void main(String[] args){
        int[] array={1, 2, 3};
        System.out.println(sumOfElement(array));
    }
    
    static int sumOfElement(int[] arr){
        int X=0;
        int Y=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2==0){
               Y=Y+arr[i];
            }else{
                
                 X=X+arr[i];
            }
        
        }
        
        return X-Y;
    
    }
}
