/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticPractice;

/**
 *
 * @author BOSS
 */
public class StaticBlock {
   static int a;
    
    /*
           static{} block are invoked before main() method by JVM.
           static{} block is used for initializing for static variable
    
    */
    
    public static void main(String[] args){
        System.out.println("This is main method");
        System.out.println(a);
    }
    
    static{
        a=11;
        System.out.println("this is static block");
    }
    
    
    
}


