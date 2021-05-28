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
public class QueueCreation {
    int CAPACITY=5;
    int[] queueArray=new int[CAPACITY];
    int countItem=0,front=0,rearItem=-1;
    public static void main(String[] args){
        QueueCreation queue=new QueueCreation();
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Enqueue(60);
//       queue.printArray();
       //queue.Enqueue(70);
        
        queue.Dequeue();
        
        //queue.Dequeue();
//        queue.Dequeue();
        queue.Enqueue(70);
        //queue.Enqueue(90);
        queue.Dequeue();
        queue.printArray();
    }
    
//    boolean isArrayEmpty(){
//        if(countItem<CAPACITY)
//            return true;
//    }
    
    void Enqueue(int number){
        if(countItem==CAPACITY){
           System.out.println("Array out of Bound");
           return; 
        }
        rearItem=(rearItem+1)%CAPACITY;
        queueArray[rearItem]=number;
        countItem++;  
    }
    
    void Dequeue(){
        //if(rearItem<0 && countItem==0){
        if(countItem==0){
            System.out.println("Array is Empty");
            return;
        }
        int fontItem=queueArray[front];
        queueArray[front]=0;
        System.out.println("The Value is removed from queue"+fontItem);
        countItem--;
        front=(front+1)%CAPACITY;
    }
    
    void printArray(){
        for(int i=0;i<queueArray.length;i++){
            System.out.print(" "+queueArray[i]);
        }
         System.out.print("\n");
        
    }
    
}
