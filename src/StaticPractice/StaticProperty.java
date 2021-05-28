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
public class StaticProperty {
    
    public static void main(String[] args){
        /*
        
        ==> static keyword are used for memory management.
        ==> when static keyword is used before a variable name , then that variable is called static 
            variable.
        ==> static property is related with class not with object. that's why static variable is also known as 
            class variable.
        
      ==> (1) when student object will be created that time a block of memory(Heap memory) will be allocated 
              for "name" and "id" not for "UNIVERSITY_NAME" since it was diclared as static property. 
              static property(UNIVERSITY_NAME) will be refered from the class area. No memory will be allocated for
              static property(UNIVERSITY_NAME).
    
          Ex-    Student student1=new Student("Shohel",101);
                 Student student2=new Student("Mazed",102);
    
      ==> (2) while two objects(student1, student2) were created for student class. two blocks of memory(Heap memory) 
              were allowcated for two seperate object's id and name. but both objects are refered to same class area for
              static property(UNIVERSITY_NAME). No memory will be allocated for static property(UNIVERSITY_NAME) in case of
              both object creation.
    */
        
        
        
        Student student1=new Student("Shohel",101);
        Student student2=new Student("Mazed",102);
        student1.printStudentInfo();
        student2.printStudentInfo();
        
    } 
    
}

class Student{
    String name;  // instace variable as it is located in inside a specific class
    int id;
    static String UNIVERSITY_NAME="Wuhan University";
    
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    
    public void printStudentInfo(){
        System.out.println("student name = "+name+" student id = "+id+" University = "+UNIVERSITY_NAME);
    }
    
    
}
