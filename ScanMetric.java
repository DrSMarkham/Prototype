/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;


/**
 *
 * @author DrSMarkham
 */
class SetDelimiters {
    public static void main (String args[])
            throws IOException {
        
        double den = 0.0;
        double sum = 0.0;
        
        FileWriter fout1 = new FileWriter("text1.txt");
        FileWriter fout2 = new FileWriter("text2.txt");
        
        //store values in comma separtaed list
        fout1.write("2, 3, 4, 5, 6, 7, 4, 9, 1, 10, 5, done");
        fout1.close();
        
        fout2.write("5, 2, 9, 7, 1, 0, 3, 5, 1, 8 4, done");
        fout2.close();
        
        FileReader fin1 = new FileReader("Test1.txt");
        FileReader fin2 = new FileReader("Test2.txt");
        
        Scanner src1 = new Scanner(fin1);
        Scanner src2 = new Scanner(fin2);
        
        src1.useDelimiter(", *");
        src2.useDelimiter(", *");
        
        while(src1.hasNext()) {
            if(src1.hasNextDouble()){
                sum += src1.nextDouble();
            }
            else {
                String str1 = src1.next();
                if(str1.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }
        src1.close();
        
         while(src2.hasNext()) {
            if(src2.hasNextDouble()){
                den += src2.nextDouble();
            }
            else {
                String str2 = src2.next();
                if(str2.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }
        src2.close();
        
        System.out.println("Average is " + sum / den);
        
        
                
            
    }
            
    
}
