// Follows AbstractArgumentation.java and PlaAbsArgImage.java


import javax.swing.*;
import javax.swing.text.*;

public class PlanAbsArg {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Abstract Argumentation Tool");
    JTextArea ta = new JTextArea(150, 150);
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
                        + "\n" + 
"The Araucaria system provides an interface which supports the diagramming\n" +
"process, and then saves the result using AML, an open standard, designed in\n" +
"XML, for describing argument structure.\n" +
" Araucaria allows you to build argument diagrams by selecting phrases of text\n" +
"to represent the premises and conclusion of an argument and building a tree\n" +
"diagram interactively using the mouse. The argument text may be loaded from a\n" +
"disk file, and is displayed in the blue panel on the left. Use the mouse to\n" +
"select a portion of this text and then click on the grey panel on the right to\n" +
"create a node corresponding to this text. When you have selected the nodes you\n" +
"require, join them up by selecting one node (the premise) with the mouse and \n" +
"dragging the mouse (holding down the left button while moving the mouse) to\n" +
"the other node (the conclusion supported by the premise). Nodes and edges with\n" +
"a tree can be selected with the mouse. Selected objects can be deleted by\n" +
"pressing the 'Delete' key. Information on selected objects also appears in\n" +
"the yellow panel at the bottom. Araucaria supports different diagramming\n" +
"styles, currently the Standard 'box-and-arrow' approach, and the Toulmin\n" +
"approach."

    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}