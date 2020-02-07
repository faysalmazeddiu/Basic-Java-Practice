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
public class MUM3 {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        a3(arr, 0, 4);
        //System.out.println(a3(arr, 0, 4).toString());
        //System.out.println(returnCharecter(arr,0,4).toString());
    }

    static char[] returnCharecter(char[] a, int start, int len) {

        int index = 0;
        if (a == null) {
            return null;
        }
        if (0 > start && start > a.length) {
            return null;
        }
        if (len > a.length - start && len > a.length) {
            return null;
        }
        char[] newArray = new char[len];
        for (int i = start; i <= len; i++) {

            newArray[index] = a[i];
            index = index + 1;
        }
        if (newArray.length == len) {
            return newArray;
        }
        return null;

    }

    static char[] a3(char[] a, int start, int length) {
        if (length < 0 || start < 0 || start + length - 1 >= a.length) {
            return null;
        }

        char[] sub = new char[length];
        for (int i = start, j = 0; j < length; i++, j++) {
            sub[j] = a[i];
        }

        return sub;
    }

}
