/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class MUM1 {
    
    public static void main(String[] args){
    
        int[] arr={10};
        System.out.println(centeredArray(arr));
    }
    
    public static int centeredArray(int[] arr){
        
        int length=arr.length;
        int midIndex=length/2;
        if(length%2==0 || arr==null){
            return 0;
        }
        for(int i =0;i<length;i++){
            if(midIndex!=i && arr[i]<=arr[midIndex]){
                return 0;
            }
            
        }
        return 1;
       }
    
    
    
    
    
    
    
    static int a1(int[] a)
        {
        if (a == null || a.length % 2 == 0) return 0;
       int midIndex = a.length / 2 ;
       int middleItem = a[midIndex];
       for (int i=0; i<a.length; i++)
        {
        if (i != midIndex && middleItem >= a[i])
        return 0;
       }
       return 1;
        }
    
}
