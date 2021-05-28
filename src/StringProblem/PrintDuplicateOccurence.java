/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 *
 * @author BOSS
 */
public class PrintDuplicateOccurence {

    public static void main(String args[]) {
        //wordCountNotEfficient();
        wordCountEfficientMethod();
    }

    static void wordCountEfficientMethod() {
        String sentence = "I am learning learning java and Java Fremwork java";
        String[] stringArray = sentence.toUpperCase().split(" ");
        LinkedHashMap<String, Integer> stringHashMap = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < stringArray.length; i++) {
            //int value=stringHashMap.get(stringArray[i])+1;
            if (!stringHashMap.containsKey(stringArray[i])) {
                stringHashMap.put(stringArray[i], 1);
            } else {
                    int value=stringHashMap.get(stringArray[i])+1;
                    stringHashMap.put(stringArray[i], value);
               
            }
        }
        for (Entry<String, Integer> data : stringHashMap.entrySet()) {
            //System.out.println("(" + data.getKey() + "," + data.getValue() + ")");
            if(data.getValue()>1){
                System.out.println("(" + data.getKey() + "," + data.getValue() + ")");
            }
        }

    }

    static void wordCountNotEfficient() {
        String sentence = "I am learning learning java and Java Fremwork";
        String[] stringArray = sentence.toUpperCase().split(" ");
        LinkedHashMap<String, Integer> stringHashMap = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < stringArray.length; i++) {
            int wordCount = 0;
            for (int k = 0; k < stringArray.length; k++) {
                if (stringArray[i].equals(stringArray[k])) {
                    wordCount++;
                }
            }

            if (!stringHashMap.containsKey(stringArray[i])) {
                //stringHashMap.put(stringArray[i], wordCount);
                stringHashMap.replace(stringArray[i], wordCount);
            }

        }
        for (Entry<String, Integer> data : stringHashMap.entrySet()) {
            System.out.println("(" + data.getKey() + "," + data.getValue() + ")");
        }
    }

}
