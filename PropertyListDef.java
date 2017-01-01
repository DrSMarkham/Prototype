/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author DrSMarkham
 */
class PropertyListDef {
    public static void main(String[] args){
        Properties defList =new Properties();
        defList.put("F", "reconnaissance");
        defList.put("W", "rescue");
        
        Properties optypes = new Properties(defList);
        
        optypes.put("I", "bombing");
        
        //get a set view of the keys
        Set<?> operations =optypes.keySet();
        
        //Show all ops and optypes
        for(Object name : operations)
            System.out.println("Operation" + name + " is a " + optypes.getProperty((String)name) + ".");
        
        System.out.println();
        
        String str = optypes.getProperty("F");
        System.out.println("Operation F is a " + str + " mission.");
        
        String str1 = optypes.getProperty("X", "Not Found");
        System.out.println("Operation X is " + str1 + ".");
        
    }
    
}
