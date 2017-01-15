*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Random;
/**
 *
 * @author DrSMarkham
 */
class PlanException {
    public static void main(String args[]) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Division by Zero");
                a = 0;
            }
            System.out.println("a: " + a);
            }
        }
    }
    
