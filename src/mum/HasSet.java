/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.HashSet;

/**
 *
 * @author BOSS
 */
public class HasSet {
    // does not maintain any order
    // it contain unique value. can not hold any duplicate value
   // it can also contain null value
    public static void main(String args[]){
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mazed");
        hashSet.add("Sazed");
        hashSet.add("Sajib");
        hashSet.add("Himmot");
        hashSet.add("Mazed");
        
        System.out.println("\n\n");
        for(String s:hashSet){
            System.out.println(s);
        }
        System.out.println("\n\n");
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("Mazed"));
        hashSet.remove("Sajib");
        System.out.println("\n\n");
        for(String s:hashSet){
            System.out.println(s);
        }
        System.out.println("\n\n");
         HashSet hashSet2=new HashSet();
         hashSet2.add("Mazed");
         hashSet2.add(1);
       System.out.println(hashSet2);
    }
    
}
