// Follows AbstractArgumentation.java and PlaAbsArgImage.java


import javax.swing.*;
import javax.swing.text.*;

public class PlanAbsArg {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Abstract Argumentation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Toulmin Diagram\n" + "\n" +
    "Claim: the position or claim being argued for; the conclusion of the argument.\n" +
"Grounds: reasons or supporting evidence that bolster the claim.\n" +
"Warrant: the principle, provision or chain of reasoning that connects the\n" +
"grounds/reason to the claim.\n" +
"Backing: support, justification, reasons to back up the warrant.\n" +
"Rebuttal/Reservation: exceptions to the claim; description and rebuttal of\n" +
"counter-examples and counter-arguments.\n" +
"Qualification: specification of limits to claim, warrant and backing.  The \n" +
"degree of conditionality asserted.\n" +
"\n" +
" The claim will represent the desired objective (mission, operation event)\n" + 
"together with the proposed means of actualisation (tasks, roles, resources,\n" +
"etc.)\n" +
" Instances of experiential learning can be represented as grounds, backing,\n" +
"rebuttal, qualifier as appropriate together with data relating to other\n" +
"(contextual) features of the new plan.\n" 
                        + "\n" 
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}