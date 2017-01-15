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
class PlanWriter {
    public static void main(String args[])throws IOException {
        String source = "OB → Verb Tasker Taskee (Affected|Action) Where\n" +
"Start-When (End-When) Why Label (Mod)*";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        
        try ( FileWriter f0 = new FileWriter("file1.txt");
              FileWriter f1 = new FileWriter("file2.txt");
              FileWriter f2 = new FileWriter("file3.txt"))
        {
            for (int i=0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }
            
            f1.write(buffer);
            
            f2.write(buffer,buffer.length-buffer.length/4, buffer.length/4);
        } catch(IOException e) {
            System.out.println("An IO Error Occurred");
            }
        }  
    }
    

