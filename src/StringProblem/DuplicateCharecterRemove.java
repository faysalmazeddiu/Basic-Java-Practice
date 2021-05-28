/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblem;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 *
 * @author BOSS
 */
public class DuplicateCharecterRemove {
    
    public static void main(String args[]){
        
        duplicateCharecterRemove();
        //duplicateCharacterRemoveWithEfficient();
    }
    
    static void duplicateCharacterRemoveWithEfficient(){
        String string="Mazeed Hoessain".replace(" ","");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<string.length();i++){
            char stringChar=string.charAt(i);
            int index=string.indexOf(stringChar,i+1);
            if(index==-1){
                str.append(stringChar);
            }
        }
        
        System.out.println(str);
    }
    
    static void duplicateCharecterRemove(){
        String string="Mazeed Hoessain";
        char[] stringArray=string.replace(" ","").toCharArray();
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<stringArray.length;i++){
            int count=0;
            for(int k=i+1;k<stringArray.length;k++){
                if(stringArray[i]==stringArray[k]) {
                    count++;
                    break;
                }
            }
            if(count==0){
                sbr.append(stringArray[i]);
            }
        }
        
        System.out.println(sbr);
    }
    
}
