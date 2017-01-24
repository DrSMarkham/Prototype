/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.function.Function;
/**
 *
 * @author DrSMarkham
 */
class PlanFn {
    public static void main(String args[])
    {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for(int i = 1; 1 <= n; i++)
                result = i * result;
            return result;
        };
        
        System.out.println("The factorial of 3 is " + factorial.apply(3));
        System.out.println("The factorial of 5 is " + factorial.apply(5));
        }
    }
    
