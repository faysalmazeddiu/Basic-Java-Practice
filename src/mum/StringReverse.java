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
public class StringReverse {
    public static void main(String[] args){
        String name="mum";
        String name2="mummun";
//        System.out.println("length of string "+name.length());
//        System.out.println("Uppper "+name.toUpperCase());
//        System.out.println("lower case "+name.toLowerCase());
         System.out.println("concate "+name.concat(name2));
         String name3=" @#Faysal([$ hosain@@@ mazed %^&*]";
         System.out.println("string contain  "+name3.contains("hosain"));
         System.out.println("string empty checking  "+name3.isEmpty());
         System.out.println("remove space from first side and last side"+name3.trim());
         System.out.println("remove special charecter "+name3.replaceAll("([$@#%^&*])",""));
         
         String name4="mazed_hossain";
         String[] s=name4.split("_");
         for(String n:s){
             System.out.println(n);
         }
        //stringEfficientReverse();
        
        String reverseString= stringEfficientReverse(name);
        //System.out.println(reverseString);
        if(name.equals(reverseString)){
            System.out.println("String is Palindrom");
        }else{
            System.out.println("String is not Palindrom");
        }
        
        //stringReverse();
        FirstReverse("I love you");
        
    }
    
    static void stringReverse(){
        String name="mazed";
        char[] s=name.toCharArray();
        String concate="";
        for(int i=s.length-1;i>=0;i--){
            //System.out.print(s[i]);
            concate=concate+s[i];
        }
        System.out.print(concate);
    }
    
    static String stringEfficientReverse(String name){
        //String name="abcdefgh";
        char[] s=name.toCharArray();
        //int lastCharIndex=s.length-1;
        for(int i=0;i<s.length-1-i;i++){
            char swap=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=swap;
        }
        String string=new String(s);
        return string;
    }
    
    static void printArray(char[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static String FirstReverse(String str) {
    // code goes here 
    char[] stringArray=str.toCharArray();
    for(int i=0;i<stringArray.length-1-i;i++){
       if(stringArray[i]==' '){continue;}
        char swap=stringArray[i];
        stringArray[i]=stringArray[stringArray.length-1-i];
        stringArray[stringArray.length-1-i]=swap;
    } 
    String string=new String(stringArray);
    return str;
  }
    
    
}
