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
class PlanLL {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("advance");
        ll.add("defend");
        ll.add("Tasker");
        ll.add("Taskee");
        ll.add("Effect");
        ll.add("Action");
        ll.add("At_Where");
        ll.add("Route-Where");
        ll.add("Start-When");
        ll.add("End-When");
        ll.add("Why");
        ll.addLast("Label");
        ll.addFirst("Verb");
        
        ll.add("Mod");
        
        System.out.println("Tasking Expression is: " + ll);
        
        ll.remove("advance");
        ll.remove(1);
        
        System.out.println("Modified Tasking Expression is: " + ll);
        
        //ll.removeFirst();
        //ll.removeLast();
        
        //Get and Set a Value
        
        String val = ll.get(0);
        ll.set(0, val + " Changed");
        System.out.println("Tasking Expression after further modification: " + ll);
        
    }
    
}
