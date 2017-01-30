
import javax.swing.*;
import javax.swing.text.*;
//Follow PlanOntology.java 
public class PlanOnt {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Semantic Plan Representation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation Tool\n" + "\n" +
    " Each ‘ActionsAnticipated/ActionsExecuted’ frame will have the following\n" +
    "attributes (corresponding to the associated tasking expression:\n" +
"Verb\n" +
"advance\n" +
"defend\n" +
"Tasker\n" +
"Taskee\n" +
"Affected\n" +
"Action\n" +
"At-Where\n" +
"Route-Where\n" +
"Start-When\n" +
"End-When\n" +
"Why\n" +
"Label\n" +
"Mod*\n" +
"\n" +
" The tasking expressions are of the form:\n" +
"\n" +
"OB → Verb Tasker Taskee (Affected|Action) Where\n" +
"Start-When (End-When) Why Label (Mod)*\n" +
"OB → advance Tasker Taskee Route-Where\n" +
"Start-When (End-When) Why Label (Mod)*\n" +
"OB → defend Tasker Taskee Affected At-Where\n" +
"Start-When (End-When) Why Label (Mod)*\n" + "\n" +
"  Thus this grammer will be incorporated into our military campaign ontology\n" +
"by assigning the ‘Verb’/’advance’/’defend’ as attributes to the \n" +
"ActionsAnticipated and ActionsExecuted frames. This involves allowing the\n" +
"following list of verbs to feature as action attributes:  divert, enable, \n" +
"deceive, deny, prevent, open, envelope, surprise, cause, protect, allow, \n" +
"create, influence, and support.\n" +
" ‘Tasker’, ‘Taskee’, ‘Start-When’, (‘End-When’), ‘Why’, ‘Label’ and (‘Mod’)* \n" +
"will also be accommodated as attributes of the ActionsAnticipated and \n" +
"ActionsExecuted frames.\n" +
"\n" 
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}




