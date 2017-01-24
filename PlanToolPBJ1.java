/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
class PlanToolPBJ1 {
    public static void main(String args[]) {
        
        try {
            ProcessBuilder proc =
                    new ProcessBuilder ("JavaDON.exe", "testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing JavaDON.");
        }
        
        }
    }
    
