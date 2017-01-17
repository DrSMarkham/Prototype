
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
class PlanTTF {
    //throw an exception out of the method
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    
    //return from within a try block
    static void procB() {
        try {
             System.out.println("Inside procB");
             return;
            //throw new RunTimeException("demo");
        } finally {
            System.out.println("procB's finally");
        }
    }
            //execute a try block normally
    static void procC() {
        try {
             System.out.println("Inside procC");
             return;
            //throw new RunTimeException("demo");
        } finally {
            System.out.println("procC's finally");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
        }
    }
