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
public class PlanToolSerialisation {
    public static void main(String args[]) {
        //Object Serialisation
        try ( ObjectOutputStream objOStrm =
                new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass object1 = new MyClass("advance", "A", "B", "enemy", "divert", "X", "P", 0, 12, "rescue", 1, "peace conference");
            System.out.println("Tasking Expression1: " + object1);
            objOStrm.writeObject(object1);
        }
        catch(IOException e) {
            System.out.println("Exception during serialisation: " + e);
        }
        
        //Pbject Serialisation
        
        try ( ObjectInputStream objIStrm = 
                new ObjectInputStream(new FileInputStream("serial")) )
        {
            MyClass object2 = (MyClass)objIStrm.readObject();
            System.out.println("OB " + object2);
        }
        catch(Exception e) {
            System.out.println("Exception during deserialisation: " + e);
        }
    }
}

class MyClass implements Serializable {
    String s1; 
    String s2;
    String s3;
    String s4;
    String s5; 
    String s6;
    String s7;
    int s8;
    int s9; 
    String s10;
    int s11;
    String s12;
    
    public MyClass(
    String s1, 
    String s2,
    String s3,
    String s4,
    String s5, 
    String s6,
    String s7,
    int s8,
    int s9, 
    String s10,
    int s11,
    String s12) {
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
    this.s4 = s4;
    this.s5 = s5;
    this.s6 = s6;
    this.s7 = s7;
    this.s8 = s8;
    this.s9 = s9;
    this.s10 = s10;
    this.s11 = s11;
    this.s12 = s12;
}
    public String toString() {
        return "OB = " + s1 + " "  + s2 + " "  + s3 + " " + s4 + " "
 + s5 + " " + s6 + " " + s7 + " " + s8 + " "  + s9 + " "  + s10 + " "
     + s11 + " " + s12 + " ";
    }
}
