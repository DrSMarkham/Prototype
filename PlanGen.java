/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
T is a type parameter, it will be replaced by a real type when an object of 
type Gen is created
 */
class Gen<T> {
    T ob; //declare object of type T


// P ass constructor of Gen an object of type T
Gen(T o) {
ob = o;
}
//Return ob
T getob() {
    return ob;
}
//Show type of T
void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
}
}
/**
 *
 * @author DrSMarkham
 * Demonstrate the generic class
 */
class PlanGen {
    public static void main(String args[]) {
        Gen<Integer> iOb;
        //create a Gen<Integer> object and asign its reference to iOb
        //Notice use of autoboxing to encapsulate the value 88 within
        //an integer object
        iOb = new Gen<Integer>(88);
        
        //Show type of data used by iOb
        iOb.showType();
        
        int v = iOb.getob();
        System.out.println("value: " + v);
        
        System.out.println();
        
        //Create a Gen object for Strings
        Gen<String> strOb = new Gen<String> ("Generics Test");
        
        strOb.showType();
        
        String str = strOb.getob();
        System.out.println("value: " + v);
        
        
        
        
        
    }
    
}
