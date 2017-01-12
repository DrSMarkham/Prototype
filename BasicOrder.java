
import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DrSMarkham
 */
class Tuple {
    String verb;
    String tasker;
    String taskee;
    String affected;
    String action;       
    String atWhere;       
    String routeWhere;
    String startWhen;
    String endWhen;
    String why;
    String label;
    String mod;    
    
    Tuple(String v, String tr, String te, String af, String ac,      
    String aw,String rw, String sw, String ew, String w, String l, String m){
        verb = v;
        tasker = tr;
        taskee = te;
        affected = af;
        action = ac;
        atWhere = aw;
        routeWhere = rw;
        startWhen = sw;
        endWhen = ew;
        why = w;
        label = l;
        mod = m;}
}
 
class VerbAffected {
    String verb;
    String affected;
    
    VerbAffected(String v, String af){
        verb = v;
        affected = af;
    }
}

class BasicOrder {
    public static void main(String args[]) {
         
         ArrayList<Tuple> myList = new ArrayList<>();
         
         myList.add(new Tuple("advance","A","B","enemy","divert","X","P","0","12","rescue","1","deceive"));
         //myList.add(new Tuple("defend", "C", "D","brigade", "Y", "Q", "6", "18", "support","2","peace conference"));
         
         System.out.println("Basic Order: ");
         myList.stream().forEach( (a) -> {
             System.out.println(a.verb + " " + a.tasker + " " + a.taskee + " " + a.affected + " " + a.action + " " + a.atWhere + " " + a.routeWhere + " " + a.startWhen + " " + a.endWhen + " " + a.why + " " + a.label + " " + a.mod + " ");
         });
         System.out.println();
         
         
         Stream<VerbAffected> verbAndAff = myList.stream().map((a) -> new VerbAffected(a.verb, a.affected));
         
         System.out.println("List of verb and affected pairs: ");
         verbAndAff.forEach( (a) -> {
             System.out.println(a.verb + " " + a.affected);
         });
    }
   
         
         
         
    
    
}

    
