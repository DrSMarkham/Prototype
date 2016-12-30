import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static javax.swing.UIManager.get;

/**
 *
 * @author DrSMarkham
 */
public class IteratorRoles {
    public static void main(String args[]){
        SortedMap<String, Integer> aggroles = new SortedMap<String, Integer>();
        Map<String, Integer> roles = new Map<String, Integer>();
        //console input roles
        Set<String>roletypes = new Set<String>();
        roletypes = roles.keySet();
        Iterator<String> itr = roletypes.iterator();
        while(itr.hasNext()){
            String keyelement;
            keyelement = itr.next();
            Integer sum;
            Iterator<String,Integer> mapitr = roles.iterator();
            while(mapitr.containsKey(roles keyelement)){
            sum+ = get(roles keyelement);
            Integer remove(roles keyelement);
                  };
            aggroles.put(String keyelement, Integer sum)
        };
    };
    
}