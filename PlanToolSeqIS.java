/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author DrSMarkham
 */
class ISEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;
    public ISEnumerator(Vector<String> files) {
        this.files = files.elements();
    }
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }
    
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e){
            return null;
            
        }
    }
 
    
}

class PlanToolSeqIS {
    public static void main(String args[]) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        ISEnumerator ise = new ISEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        
        try {
            while ((c = input.read()) != -1)
                System.out.print((char) c);
        } catch(NullPointerException e) {
            System.out.println("Error Opening File.");
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
          try{
                input.close();
          } catch(IOException e) {
              System.out.println("Error Closing SequenceInputStream");
          }
        }
    }
}