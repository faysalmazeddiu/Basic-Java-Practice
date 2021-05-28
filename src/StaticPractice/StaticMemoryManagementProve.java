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
public class StaticMemoryManagementProve {
    public static void main(String[] args){
        Professor professor=new Professor();
        professor.id=101;
        professor.name="Heron";
        professor.professorType="Professor";
        professor.printallCount();
        
        
        Professor professor2=new Professor();
        professor2.id=102;
        professor2.name="Koushik ";
        professor2.professorType="Associate Professor";
        professor2.printallCount();
        
        
        Professor professor3=new Professor();
        professor3.id=101;
        professor3.name="Momin";
        professor3.professorType="Assistent Professor";
        professor3.printallCount();
        
        /*
            ==> static variable always refer class area at the time of objects creation, it  not allowcate Heap memory
                as like as non-static variable. that's why the value of static variable "count" is 
                increasing with each object creation. but "secondCount" is not increasing as it is non-static.
        
                
        
        */
                
    }
    
}

class Professor{
    int id;
    String name;
    String professorType;
    static int count=0;
    int secondCount=0;
    public Professor(){
        ++count;
       ++ secondCount;
    }
    
    void printallCount(){
        System.out.println("The static count = "+count+" The non static count = "+secondCount);
        
    }
}
