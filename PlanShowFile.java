/*Use this program to specify the name of a file you want to see e.g. TEST.TXT
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author DrSMarkham
 */
class PlanShowFile {
    public static void main(String args[])
    {
        int i;
        
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        
        try ( InputStream fin = Files.newInputStream(Paths.get(args[0])) )
        {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
            
        } catch(InvalidPathException e) {
                System.out.println("Path Error" + e);
                } catch(IOException e) {
                        System.out.println("I/O Error " + e);
            }
        }
               
}

