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
public class BinarySearch {
    
    public static void main(String args[]){
        int[] array={12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        binarySearch(array,17);
        
       
    }
    
    static void binarySearch(int[] arr,int finder){
        int left=0,right=arr.length-1;
        boolean isValueFound=false;
        
        while(left<=right){
            int median=(left+right)/2;
            System.out.println("Median="+median);
             if(arr[median]==finder){
              isValueFound=true;
              break;
             }
            if(arr[median]>finder){
                right=median-1;
                System.out.println("right="+right);
            }else{
                left=median+1;
                System.out.println("left="+left);
            }
        }
        if(isValueFound){
              System.out.println("Finder has been founded");
        }else{
            System.out.println("Finder has not been founded");
        }
    }
    
}
