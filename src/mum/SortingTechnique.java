/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.Arrays;

/**
 *
 * @author BOSS
 */
public class SortingTechnique {

    static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i, count = 0, interation = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                    count++;
                }
                interation++;
            }
            // int[] array={3,1,10,4,0,11,2};
            //System.out.println("Minindex "+minIndex+" iteration"+interation);
            if (count > 0) {
                int swap = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = swap;
            }
        }

        return arr;
    }

    static void insertionSort(int[] arr) {
        
            //int[] array = {3, 1, 10, 4, 0, 11, 2};
            //   1 3 10 4
            for(int i=1;i<arr.length;i++){
               int value=arr[i];
               int index=i;
               //int hole=0;
               while(index>0 && value<arr[index-1]){
                       arr[index]=arr[index-1];
                       index--; 
               }
               arr[index]=value;
               
            }
            
            printArray(arr);
       
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 10, 4, 0, 11, 2};
        int[] array2 = {3, 1, 10, 4, 0, 11, 2};
        insertionSort(array);
        //bubbleSort(array);
        //System.out.println(Arrays.toString(bubbleSort(array)));
        //selectionSort(array);
        //System.out.println(Arrays.toString(selectionSort(array)));

    }

}
