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
public class ArrayPractice {
    public static void main(String[] args){
        
        /*
        
        int[][] integerArray=new int[3][3];
        Scanner s=new Scanner(System.in);
        insertArrayElement(s,integerArray);
        printArrayElement(integerArray);
        System.out.println();
        sumOfDiagonalElement(integerArray);
        sumOfUpperlTriagleElement(integerArray);
        sumOfLowerTriagleElement(integerArray);
        
        */
        int[] array={10,2,34,1,20,0,100};
        findingMinimumElement(array);
        findingMaximumElement(array);
        
    }
    
    static void findingMinimumElement(int[] arr){
        int minValue=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                minValue=arr[i+1];
            }else{
                minValue=arr[i];
            }
        }
        System.out.println("Minimum Element is "+minValue);
    }
    
    static void findingMaximumElement(int[] arr){
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println("Maximum Element is "+maxValue);
    }
    
    static void sumOfDiagonalElement(int[][] integerArray){
        int sum=0;
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row==col){
                    sum=sum+integerArray[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal Element ="+sum);
        
    }
    static void sumOfUpperlTriagleElement(int[][] integerArray){
        int sum=0;
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row<col){
                    sum=sum+integerArray[row][col];
                }
            }
        }
         System.out.println("Sum of Upper Element ="+sum);
    }
    
    static void sumOfLowerTriagleElement(int[][] integerArray){
        int sum=0;
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row>col){
                    sum=sum+integerArray[row][col];
                }
            }
        }
        System.out.println("Sum of Lower Element ="+sum);
    }
    
    static void insertArrayElement(Scanner s, int[][] integerArray){
        for(int row=0;row<3;row++){
            System.out.println("Enter element for row ="+(row+1));
            for(int col=0;col<3;col++){
                integerArray[row][col]=s.nextInt();
            }
        }
    }
    
    static void printArrayElement(int[][] integerArray){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(integerArray[row][col]+" ");
            }
            
            System.out.println();
        }
    }
}
