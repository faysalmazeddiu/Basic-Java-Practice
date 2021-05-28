/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.Random;

/**
 *
 * @author BOSS
 */
public class RandomNumber {
    public  static void main(String[] args){
        System.out.println(random_8());
    }
    
    static int random_8(){
       int number=(random_5()+random_5())%9;
       return number;
    }
    
    static int random_5(){
        Random random=new Random();
        int randomNumber=random.nextInt(6);
        return randomNumber;
    } 
    
}
