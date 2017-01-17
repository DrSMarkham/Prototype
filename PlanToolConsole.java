/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author DrSMarkham
 */
class PlanToolConsole {
    public static void main(String args[]) {
        String str;
        Console con;
        
        con = System.console();
        if( con == null) return;
        
        str = con.readLine("Enter a Tasking Expression"
                + " \nOB → Verb Tasker Taskee (Affected|Action) Where\n" +
                "Start-When (End-When) Why Label (Mod)* ");
        con.printf("The tasking expression is \n", str);
    }
    
}
