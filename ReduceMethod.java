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
class ReduceMethod {
    public static void main (String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();
        
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        
        //2 ways to obtain integer product of elements in myList using reduce()
        Optional<Integer>productObj = myList.stream().reduce((a,b) -> a*b);
        if(productObj.isPresent())
            System.out.println("Product as Optional: " + productObj.get());
        
        int product = myList.stream().reduce(1, (a,b) -> a*b);
        System.out.println("Product as int: " + product);
        
    }
    
}
