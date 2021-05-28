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
public class StackCreation {
    int CAPACITY=5;
    int[] stackArray=new int[CAPACITY];
    int top=-1, countItem=0;
    
    public static void main(String args[]){
        StackCreation statck=new StackCreation();
        statck.push(20);
        statck.push(10);
        statck.push(11);
        statck.push(12);
        statck.push(13);
       //statck.push(17);
        
        
        statck.pop();
        statck.pop();
        statck.pop();
        statck.pop();
        statck.pop();
       statck.pop();
       statck.printArray();
        
        System.out.println("The top is"+statck.top);
    }
    
    void push(int value){
        if(countItem==CAPACITY){
            System.out.println("Stack overflow");
            return;
        }
       // topPosition=top+1;
        stackArray[top+1]=value;
        top++;
        countItem++;
    
    }
    
    void pop(){
        if(top<0){
           System.out.println("Stack is empty");
            return; 
        }
        int popValue=stackArray[top];
        stackArray[top]=0;
        System.out.println("The recent popvalue"+popValue);
        top--;
        countItem--;
    }
    
    void printArray(){
        for(int i=0;i<stackArray.length;i++){
            System.out.print(" "+stackArray[i]);
        }
        
    }
}
