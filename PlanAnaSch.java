
import javax.swing.*;
import javax.swing.text.*;
//Follows PlanOntTool.java 
public class PlanAnaSch {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Analogous Plan Search Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Analogous Plan Search Tool\n" + "\n" +
    
" Here we propose a design for an ‘analogous search’ tool to deploy experiential learning\n" +
"in solving military planning problems. A schematic description of our tentative design is:\n" +
"\n" +
"Specific Planning Query/Problem\n" +
"                    |\n" +
"                    |    Transform\n" +
"                    V\n" +
"{Generalised Planning Query/Problem}\n" +
"                    |\n" +
"                    |    Search Military Campaign Ontology\n" +
"                    V\n" +
"{Possible Answers to Generalised Planning Query/Problem}\n" +
"                    |\n" +
"                    |    Filter Solution Set according to Select Semantic Criteria\n" +
"                    V\n" +
"{Possible Answers to Specific Planning Query/Problem}\n" +
"\n" +
" In terms of the Military Campaign Ontology, the methodology is as follows:\n" +

"i)Input Planning Query/Problem as a tasking expression (or set of tasking expressions).\n" +
"(Verb, -, -, Affected, Action, X, P, -, -, Why, Target, Mod)\n" +
"The tasker, taskee, StartWhen, EndWhen fields are by default empty Strings.\n" +

"ii)Transform input tasking expression into a generalised set of tasking \n" +
"expressions by removing non-verb and non-gerund terms from the individual \n" +
"fields. Replace empty Strings with a wildcard* entry i.e. '0'.\n" +
"(Verb, -*, -*, Affected’, Action’, -*, -*, -*, -*, Why’, -*, Mod’)\n" +
"Affected’ = Affected entry stripped of all non-verbs and non-gerunds.\n" +
"Similarly for Action’, Why’ and Mod’.\n" +

"iii)Search the Military Campaign Ontology (Plan Knowledge Base) for plans with\n" +
"tasking expressions that belong to the set of generalised (analogous) query \n" +
"tasking expressions.\n" +

"iv)Filter the resulting set of plans according to additional semantic criteria\n" + 
"e.g. non-verbs and non-gerunds, to add query-related, purposeful specificity to\n" +
"the search and examine the experiential learning attached to the corresponding plans.\n" +
"\n" 
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}






