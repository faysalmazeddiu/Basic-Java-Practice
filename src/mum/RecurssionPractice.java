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
public class RecurssionPractice {

    public static void main(String args[]) {
        //System.out.println(findPactorial(5));
        // System.out.println(findSum(5));
        // fibonacciSeries(1,0,1);

        printNumber(1, 10);
    }

    static void fibonacciSeries(int upperLimit, int firstNumber, int secondNumber) {
        if (upperLimit <= 10) {

            if (firstNumber == 0) {
                System.out.print(firstNumber + " " + secondNumber);
            }

            int result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
            System.out.print(" " + result);
            //upperLimit++;
            fibonacciSeries(upperLimit + 1, firstNumber, secondNumber);

        }

    }

    static int findPactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findPactorial(n - 1);
    }

    static int findSum(int value) {
        if (value == 1) {
            return 1;
        }
        return value + (findSum(value - 1));
    }

    //static void printNumber(int initialization,int limit){
    static void printNumber(int initialization, int limit) {

        if (initialization <= limit) {
            System.out.println(initialization);
            initialization++;
            printNumber(initialization, limit);
        }
 
    }

}
