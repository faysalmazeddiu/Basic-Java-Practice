/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author BOSS
 */
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        System.out.println(arrayList.size());
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(40);
        System.out.println();
        System.out.println();
        
        for(int number:arrayList){
           System.out.println(number); 
        }
        System.out.println();
        System.out.println(arrayList.size());
        System.out.println();
        arrayList.add(2,3);
        for(int number:arrayList){
           System.out.println(number); 
        }
         System.out.println();
        System.out.println(arrayList.size());
        System.out.println();
        
        arrayList.remove(1); // by index
        Iterator number=arrayList.iterator();
        while(number.hasNext()){
            System.out.println(number.next());
        }
        System.out.println();
        System.out.println();
       // arrayList.clear();
        //arrayList.removeAll(arrayList); // remove all
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty()); // check the arrayList is empty or not
        
        System.out.println();
        System.out.println();
        
        System.out.println(arrayList.contains(20)); // check a value available in arrayList
        System.out.println();
        System.out.println(arrayList.indexOf(40));
        System.out.println();
        arrayList.set(3,100); // to replace a exited value
        Iterator number3=arrayList.iterator();
        while(number3.hasNext()){
            System.out.println(number3.next());
        }
         System.out.println();
        System.out.println(arrayList.get(2)); // get a specific indexed value
        
        System.out.println();
        System.out.println();
        System.out.println(arrayList);
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        arrayList2.add(11);
        arrayList2.add(12);
        arrayList2.add(13);
        arrayList2.add(14);
        arrayList2.add(15);
        System.out.println(arrayList2);
        
        arrayList.addAll(arrayList2); // to combine two arrayList
        System.out.println(arrayList);
        ArrayList<Integer> arrayList3=new ArrayList<Integer>();
        arrayList3.add(11);
        arrayList3.add(10);
        arrayList3.add(13);
        arrayList3.add(4);
        arrayList3.add(1);
         System.out.println();
        System.out.print(arrayList3.equals(arrayList2));
        System.out.println();
        Collections.sort(arrayList3);
         System.out.println(arrayList3);
         Collections.sort(arrayList3, Collections.reverseOrder());
         System.out.println(arrayList3);
    }
}
