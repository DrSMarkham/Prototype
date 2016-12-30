   /*
            Read File Using Java BufferedInputStream Example.
            This example shows how to read a file using available and read
            methods of Java BufferedInputStream.
    */
     
    import java.io.*;
     
    public class TaskingTuplesBufferedInputStream {
     
            public static void main(String[] args) {
                   
                    //create file object
                    File file = new File("C://FileIO//taskingtuples.txt");
                    BufferedInputStream bin = null;
                   
                    try
                    {
                            //create FileInputStream object
                            FileInputStream fin = new FileInputStream(file);
                           
                            //create object of BufferedInputStream
                            bin = new BufferedInputStream(fin);
     
                            /*
                             * BufferedInputStream has ability to buffer input into
                             * internal buffer array.
                             *
                             * available() method returns number of bytes that can be
                             * read from underlying stream without blocking.
                             */
                             
                             //read file using BufferedInputStream
                            while( bin.available() > 0 ){
                                   
                                    System.out.print((char)bin.read());
                            }
                           
                    }
                    catch(FileNotFoundException e)
                    {
                            System.out.println("File not found" + e);
                    }
                    catch(IOException ioe)
                    {
                            System.out.println("Exception while reading the file " + ioe); 
                    }
                    finally
                    {
                            //close the BufferedInputStream using close method
                            try{
                                    if(bin != null)
                                            bin.close();
                                           
                            }catch(IOException ioe)
                            {
                                    System.out.println("Error while closing the stream : " + ioe);
                            }
     
                           
                    }
            }
           
    }
     
     
    /*
    Output would be
    This file is for demonstration of how to read a file using Java
    BufferedInputStream.
    */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


