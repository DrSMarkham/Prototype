import java.util.*;
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
class FindInLine {
    public static void main(String args[]){
        String instr = "Verb: Rescue Tasker: A Taskee: B Affected: Enemy Action: Hostage At-Where: X Route-Where: Y Start-When: 0 End-When: 12 Why: BlueChip Label: C Mod: HighPriority";
        
        Scanner conin = new Scanner(instr);
        
        conin.findInLine("Verb:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Tasker:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Taskee:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Affected:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Action:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("At-Where:");        
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Route-Where:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Start-When:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("End-When:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Why:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Label:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        //conin.close();
        
        //Scanner conin = new Scanner(instr);
        conin.findInLine("Mod:");
        
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
        
        
        
        
        conin.close();
                }
        }
    

