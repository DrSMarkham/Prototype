/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author DrSMarkham
 */
import java.util.Random;

enum Answers { 
    NO, YES, MAYBE, LATER, SOON, NEVER
}
class FuzzyLogic {
    Random rand = new Random();
    Answers ask() {
        int prob =(int) (100*rand.nextDouble());
        
        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 75)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }
}

class AskMe {
    static void answer(Answers result) {
        switch(result) {
            case NO:
                System.out.println("No");
                break;
                
            case YES:
                System.out.println("Yes");
                break;
            
            case MAYBE:
                System.out.println("Maybe");
                break;
                
            case LATER:
                System.out.println("later");
                break;
                
            case SOON:
                System.out.println("Soon");
                break;
                
            case NEVER:
                System.out.println("Never");
                break;
                
            
        }
    }
    
    public static void main(String args[]) {
        FuzzyLogic q = new FuzzyLogic();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
                
                
                
                
                
        