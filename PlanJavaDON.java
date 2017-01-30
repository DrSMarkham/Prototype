import javax.swing.*;
import javax.swing.text.*;
//Follow PlanAbsArg.java
public class PlanJavaDON {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Smantic Plan Representation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation Tool\n" + "\n" +
    "To create a new ontology, use CreateNewProject and enter the relevant\n" +
    "domain knowledge into the knowledge base. This process may require a \n" +
    "number of iterations. To create a frame, go to the Frames tab and right\n" +
    "click on new. To add attributes to that frame, right click on add slot.\n" +
    "At this point the user can attach a question to each slot or a \n" +
    "description/media. Use the rules tab to create rules. (See the provided\n" +
    "example in the prototype software.) When the \"question form\" is closed\n" +
    "you are left with the knowledge base builder form containing all frames\n" +
    "and rules that make the example. It is here that you create/edit the\n" +
    "knowledge base.\n" +
    " To start the expert system click on the run button (a new window \n" +
    "containing questions should appear - the question form). This will invoke\n" +
    "the inference process, so enter problem data and interact with the system.\n" +
    "OpenExistingProject can be used to modify and extend existing knowledge\n" +
    "bases.\n" +
    "In JavaDON, a frame can have slots, sub-frames and parent frames. Each slot\n" +
    "is represented as a sub-tree with the root node ‘SLOTS’. A slot is a\n" +
    "connection between a frame and an attribute, so this information is shown" +
    "in the node ‘ATTRIBUTE’. A slot can have a description (‘DESCRIPTION’), \n" + 
    "one or more media files  (‘MEDIA’) and a question and answers (‘QUESTION’)\n" +
    "associated with it. This description and/or media files can be shown to\n" +
    "the end user to better explain the solution the ES has produced. The \n" +
    "question is used to gather information about the value of the slot, if the\n" +
    "value is to be supplied by the end user. It can have two or more\n" +
    "predefined answers (with the choice of single or multiple selection), or\n" +
    "it can be left to the user to supply one or more answers. Media files can\n" +
    "be presented to the end user together with the question, in order to \n" +
    "describe it better.\n" +
" In JavaDON, a rule consists of four elements: type, importance, IF and THEN \n" +
"clauses. The type of a rule determines whether the rule’s IF clauses are \n" +
"related with each other using the logical “and” or the logical “or” operation.\n"+
"Priority determines which rule will be executed in case there are more rules\n" +
"that can be executed.  The IF and THEN clauses are the meeting point between\n" +
"frames and rules. Each clause uses one or more frame slots in order to build a\n" +
"logic expression.  Actions can only be performed through rules.\n" + "\n" 
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}