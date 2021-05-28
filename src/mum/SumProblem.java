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
public class SumProblem {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.print(Arrays.toString(twoSum(array, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] newArr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    newArr[0] = i;
                    newArr[1] =j;
                    return newArr;
                }

            }
            
        }
        return newArr;
    }
    
}
