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
class PlanArrayWriter {
    public static void main(String args[]) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "OB → Verb Tasker Taskee (Affected|Action) Where\n" +
"Start-When (End-When) Why Label (Mod)*";
        char buf[] = new char[s.length()];
        
        s.getChars(0, s.length(), buf, 0);
        
        try {
            f.write(buf);
        }catch(IOException e){
            System.out.println("Error Writing to Buffer");
            return;
        }
        System.out.println("Buffer as String");
        System.out.println(f.toString());
        System.out.println("Into Array");
        
        char c[] = f.toCharArray();
        for (int i=0; i < c.length; i++) {
            System.out.println(c[i]);
        }
            
            System.out.println("\nTo a FileWriter");
            
            //Use try with resources to manage filestream
            try ( FileWriter f2 = new FileWriter("test.txt"))
            {
                f.writeTo(f2);
            } catch(IOException e) {
                    System.out.println("I/O Error: " + e);
                    }
            
            System.out.println("Doing a Reset");
            f.reset();
            for (int i=0; i < 3; i++) f.write('X');
            
            System.out.println(f.toString());
            }
        
        }

