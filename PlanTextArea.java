import javax.swing.*;
import javax.swing.text.*;

public class PlanTextArea {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Structural Plan Representation");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
            "Structural Plan Representation" +
          "\n" +
"Use a tuple-based model:\n" +
"(Int start node(of edge), Int end node(of edge), Int number of multiple\n" + 
" edges,Int forward degree of start node(of edge), String action_1, \n" + 
"String action_2,…, String action_( number of multiple edges), *String actor, \n"
+ "*String resource, *String hazard, *String environmental factor, \n" + 
"Empty String,…,Empty String)\n" + "\n" +
"i = start node(of edge) = state i\n" +
"j = end node(of edge) = state j\n" +
"m_ij = number of multiple edges from node i to node j = \n" + 
"number of actions executed simultaneously between state i and state j\n" +
"d_i = forward degree of node i, i.e. the number of (directed) edges leading \n" +
"away from node i\n" +
"action_1 = least priority action executed between nodes (states) i and j\n" +
"action_2 = next least priority action executed between nodes (states) i and j\n" +
".\n" +
".\n" +
".\n" +
"action_m_ij = highest priority action executed between nodes (states) i and j\n" +
"*String actor denotes m_ij tuple entries corresponding to the actors \n" + 
"associated to the m_ij action tuple entities. These String actor tuples are \n" + 
" ordered such that actor tuple entry k+m_ij corresponds to action tuple entry k.\n" +
"Similarly for *String resource, *String hazard and *String environmental factor\n" +
" The individual tuple entries for the actions will be the corresponding \n" + 
"tasking expressions utilising verbs from the J3CIEDM tables \n" + 
"\n" +
" Similarly each corresponding actor, resource, hazard and environmental \n" + 
"factor tuple entry will utilise code from the corresponding J3CIEDM category.\n" + 
"  For example for:\n" +
"•	Actions use “action-task-activity-code”\n" +
"•	Roles use “person-type-category-code”\n" +
"•	Resources use “materiel-type-category-code”\n" +
"•	Hazards use “feature-type-category-code” and “object-type-category-code”\n" +
"•	Environmental Factors use “feature-type-category-code”" + "\n" +
"The user will input the values of j, m_ij, d_i, action_1,…,action_m_ij.\n" +
"For any given node (state) i the value of j will be the i_max +1 where i_max \n" +
" is the maximum number of states recorded already which temporally precede \n" + 
"state j. The tuples will be saved and data extracted from them to calculate \n" + 
"the various plan similarity metrics."
    
    
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}