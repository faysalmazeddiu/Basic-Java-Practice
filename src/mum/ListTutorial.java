/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.LinkedList;

/**
 *
 * @author BOSS
 */
public class ListTutorial {
    public static void main(String args[]){
        /*
            // LinkedList store value based on index position
        
        */
        LinkedList<Integer> linkList=new LinkedList<Integer>();
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);
        linkList.add(60);
        System.out.println(linkList);
        System.out.println(linkList.size());
        linkList.add(2,30);
        System.out.println(linkList);
        linkList.addFirst(12);
        linkList.addLast(15);
        System.out.println(linkList);
        linkList.remove(2);
        System.out.println(linkList);
        linkList.removeFirst();
        linkList.removeLast();
        System.out.println(linkList);
        System.out.println(linkList.get(3));
        linkList.set(3,100);
        System.out.println(linkList);
        System.out.println(linkList.contains(40));
        
        LinkedList<Integer> linkList2=new LinkedList<Integer>();
        linkList2.add(11);
        linkList2.add(12);
        linkList2.add(13);
        linkList2.add(14);
        linkList2.add(15);
        linkList2.add(15);
        linkList2.addAll(linkList);
        System.out.println(linkList2);
        
        LinkedList linkedList3=new LinkedList();
        linkedList3.add("Mazed");
        linkedList3.add(12);
        linkedList3.add(1.5);
        System.out.println(linkedList3);
    }
    
}
