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
public class MUM6 {
    
    public static void main(String[] args){
        int[] array={1, 8, 3, 7, 10, 2};
        System.out.println(POE(array));
    }
    
    public static int POE(int[] array){
             int leftSum;
             int rightSum;
        for(int i=0;i<array.length;i++){
            leftSum=0;
            rightSum=0;
            for(int j=0;j<i;j++){
                leftSum=leftSum+array[i];
            }
            for(int j=i+1;j<array.length;j++){
                rightSum=rightSum+array[j];
            }
            
            if(leftSum==rightSum){
                
                return i;
        
             }
        
        }
        
    
       return -1;
    }
    
}
