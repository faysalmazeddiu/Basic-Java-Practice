/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 *
 * @author BOSS
 */
public class MapPractice {
    public static void main(String[] args){
        
        /*
        
         -HaspMap is a class, which implement, Map interface  
         -HashMap contain data on the basis of (key,value) pair
         -no duplicate key is allowed. key should be always unique
         -it does not maintain any order
        - it can store one null key and multiple null value
        
           note : LinkedHashMap maintain order on the basis of Insertion
        
        
        */
         //HashMap<Integer,String> map=new HashMap<>();
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(12,"Abir");
        map.put(13, "Sazed");
       
        map.put(14, "SHohil");
        map.put(15, "Hemel");
        map.put(16, "Palash");
        map.put(17, "Shaid");
        map.put(18, "Sazed");
        
        // System.out.println(map.get(15)); // geting value by specific key
       // System.out.println(map.size()); // getting map size
       // map.remove(12);
        //System.out.println(map.size());
        //map.replace(17,"Shipon");
        //System.out.println(map.get(17));
        //System.out.println(map.containsKey(14));
        //System.out.println(map.containsValue("Mukul"));
        //System.out.println(map.isEmpty());
        
        System.out.println("\n\n");
        for(String name:map.values()){
            System.out.println(name);
        }
        
        System.out.println("\n\n");
        for(int id:map.keySet()){
            System.out.println(id);
        }
        
        System.out.println("\n\n");
        Iterator keyIterate=map.keySet().iterator();
        while(keyIterate.hasNext()){
            System.out.println(keyIterate.next());
        }
        
        System.out.println("\n\n");
         Iterator ValueIterate=map.values().iterator();
         while(ValueIterate.hasNext()){
            System.out.println(ValueIterate.next());
        }
         System.out.println("\n\n");
        for(Entry<Integer,String> KeyMapValue:map.entrySet()){
             System.out.println("Id "+KeyMapValue.getKey()+" Name "+KeyMapValue.getValue());
        }
        
       
        Student s1=new Student(101,"Md Faysal Hossain Mazed","CSE");
        Student s2=new Student(102,"Md FAhad Hossain Sazed","BBA");
        Student s3=new Student(103,"Md Mahir Hossain","Science");
        
        HashMap<Integer,Student> studentMap=new HashMap<Integer,Student>();
        studentMap.put(1,s1);
        studentMap.put(2,s2);
        studentMap.put(3,s3);
        for(Entry<Integer,Student> student:studentMap.entrySet()){
            if(student.getKey()==2){
              map.remove(student.getKey());
              continue;
            }
             System.out.println(student.getKey()+" "+" student Name "+student.getValue().studentName+" "+" student id "+student.getValue().studenId+" department "+student.getValue().dept);
            
            }
        
        
       
        
    } 
    
}

class Student{
    
        int studenId;
        String studentName;
        String dept;
        
        Student(){
        
        }
        Student(int studentId,String studentName,String dept){
            this.studenId=studentId;
            this.studentName=studentName;
            this.dept=dept;
        }
    
    }
