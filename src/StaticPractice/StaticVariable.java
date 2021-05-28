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
public class StaticVariable {
    public static void main(String[] args){
        /*
            ==> to access any non-static property from a class, user should create 
                an object for that specific class
                    for instace :::
                                 Employee employee=new Employee();
                                 System.out.println(employee.id);
        
        
            ==> to access any static property from a class, user don't need to create 
                any object for that specific class. 
                        
                        ##way to call a static property :::
                        e.g: Employee.EMPLOYEE_ORGANIZATION  // call static variable
                             Employee.printStaticProperty();  // call static method 
        
        
            ==> any non-static property or member can not be used inside an static method.
                for Example : in Employee class , there are two non-static properties(id, name) can 
                not be used  inside printStaticProperty() method.
        
        
            ==> any static property or member can  be used inside an non-static method.
            
        */
        Employee employee=new Employee();
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.salary);
        System.out.println(Employee.EMPLOYEE_ORGANIZATION);
        Employee.printStaticProperty();
        
    }
}

class Employee{
    int id=101;
    String name="Mahir";
    double salary=100000;
    
    static String ADDRESS="8/2 nur House";
    static String EMPLOYEE_ORGANIZATION="LEADS SOFTWARE SOLUTION";
    
    public static void printStaticProperty(){
       // printAddress(); // not possible to call because it is non-static method
        System.out.println("The oranization name "+EMPLOYEE_ORGANIZATION);
    }
    
    public void printAddress(){
        // printStaticProperty(); any static property can be invoked inside non-static method 
        System.out.println("The oranization name "+ADDRESS);
    }
    
}
