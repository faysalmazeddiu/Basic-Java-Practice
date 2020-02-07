/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class MUM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_1=null;  //{};    //{1, 2};   //{1, 3, 7, 9};    //{1, 8, 3, 2, 6};//{1, 8, 3, 2};
        int[] array_2= null;  //{1, 2, 3};    //{3, 4};  //{7, 1, 9, 3};    //{2, 6, 1};     //{4, 2, 6, 1};
        System.out.println(Arrays.toString(function(array_1,array_2)));
        
    }
    
    public static int[] function(int[] array_1, int[] array_2){
        
        if(array_1==null || array_2==null){
            return null;
        }
        if(array_1.length==0 || array_2.length==0){
            return (array_1.length==0)?array_1:array_2;
        }
        
        int[] sarray=new int[array_1.length+array_2.length];
        int index=0;
        for(int i=0;i<array_1.length;i++){
            
            for(int j=0;j<array_2.length;j++){
                    if(array_1[i]==array_2[j]){
                        sarray[index]=array_2[j];
                        index++;
                    }
            
            }
        
        }
        int[] newArray=new int[index];
        int index2=0;
        for(int k=0;k<sarray.length;k++){
                    if(sarray[k]!=0){
                        newArray[index2]=sarray[k];
                        index2++;
                    }
            
            }
        
        
        
        return newArray;
    
    }
    
}
