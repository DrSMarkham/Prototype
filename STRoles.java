/*StringTokenizer
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
import java.util.StringTokenizer;

class STRoles{
    static String in = "feature=Roles;" + "medic=2;" + "sniper=5;" + "infantry=30";
    
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer(in, "=;");
        
        while(st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
