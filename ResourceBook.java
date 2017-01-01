/*A role, #role database
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author DrSMarkham
 */
class ResourceBook {
    public static void main(String args[])
            throws IOException
    {
        Properties ht = new Properties();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String resource, number;
        FileInputStream fin = null;
        boolean changed = false;
        
        //Try to open resourcebook.dat file
        try{
            fin = new FileInputStream("resourcebook.dat");
        } catch(FileNotFoundException e){
            //ignore missing file
        }
        
        /* If resourcebook file already exists,
        load existing role numbers. */
        try{
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        } catch(IOException e) {
            System.out.println("Error reading file.");
        }
        
        //Let user enter new resources and numbers.
        do{
            System.out.println("Enter new resource" + " ('quit' to stop): ");
            resource = br.readLine();
            if(resource.equals("quit")) continue;
            
            System.out.println("Enter amount of resource in integers: ");
            number = br.readLine();
            
            ht.put(resource, number);
            changed = true;
        } while(!resource.equals("quit"));
        
        if(changed) {
            FileOutputStream fout = new FileOutputStream("resourcebook.dat");
            
            ht.store(fout, "Resource Book");
            fout.close();
        }
            do {
                System.out.println("Enter resource to find" + " ('quit' to quit): ");
            resource = br.readLine();
            if(resource.equals("quit")) continue;
            
            number = (String) ht.getProperty(resource);
            System.out.println(number);
        } while(!resource.equals("quit"));
        }
                        }