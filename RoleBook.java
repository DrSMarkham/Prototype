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
class RoleBook {
    public static void main(String args[])
            throws IOException
    {
        Properties ht = new Properties();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String role, number;
        FileInputStream fin = null;
        boolean changed = false;
        
        //Try to open rolebook.dat file
        try{
            fin = new FileInputStream("rolebook.dat");
        } catch(FileNotFoundException e){
            //ignore missing file
        }
        
        /* If rolebook file already exists,
        load existing role numbers. */
        try{
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        } catch(IOException e) {
            System.out.println("Error reading file.");
        }
        
        //Let user enter new roles and numbers.
        do{
            System.out.println("Enter new role" + " ('quit' to stop): ");
            role = br.readLine();
            if(role.equals("quit")) continue;
            
            System.out.println("Enter number in role: ");
            number = br.readLine();
            
            ht.put(role, number);
            changed = true;
        } while(!role.equals("quit"));
        
        if(changed) {
            FileOutputStream fout = new FileOutputStream("rolebook.dat");
            
            ht.store(fout, "Role Book");
            fout.close();
        }
            do {
                System.out.println("Enter role to find" + " ('quit' to quit): ");
            role = br.readLine();
            if(role.equals("quit")) continue;
            
            number = (String) ht.getProperty(role);
            System.out.println(number);
        } while(!role.equals("quit"));
        }
                        }