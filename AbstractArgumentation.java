import javax.swing.*;
import javax.swing.text.*;

public class AbstractArgumentation {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Abstract Argumentation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Abstract Argumentation Tool\n" + "\n" +
    "One of the key approaches to visual representation in the discipline \n" + 
    "of abstract argumentation is diagramming. The claims and their associated\n" +
    "reasons within a given argument are identified, and the relationships\n" + 
    "between them drawn up as trees. This diagram then serves as a basis for\n" +
    "criticism and reflection.  By identifying the structure of an argument\n" +
    "in terms of its constituents and the relationships between them, it\n" + 
    "becomes easier to critically evaluate each part of an argument in turn\n." +
    " The Araucaria program for graphical representation of abstract\n" +
    "argumentation frameworks, is composed of two main sections:\n" +
"1)  A main window which allows argument diagrams to be constructed from\n" + 
"pre-existing text files.\n" +
"2) An editor for schemes and scheme sets.\n" +
" When Araucaria loads, the program displays its main window which can be used\n" +
"to load text files and create argument diagrams from the text. When a text\n" + 
"file is loaded, the text appears in the left-hand panel. A portion of this\n " +
"text may be selected with the mouse. If the mouse is then clicked in the large\n" +
"panel on the right, a node corresponding to that portion of the text is\n" +
"created and drawn at the bottom of the panel. When two or more nodes have been\n" + 
"defined in this way, they can be connected in pairs by selecting one node with\n" + 
"the mouse and dragging the mouse to the other node. The first node selected is\n" +
"the premise of an argument, and the second node is the conclusion.\n" +
" Araucaria supports both convergent and linked arguments, missing premises\n" +
"(enthymemes) and refutations. The procedures for inserting each of these \n" +
"features into a diagram is simple. Although the text in the left panel cannot\n" +
"be edited after it has been loaded into Araucaria, the reconstructed text of a\n" +
"missing premise can be edited within the diagram.\n" +
"  Although the main editable diagram displays each premise or conclusion as a\n" +
"simple circular node with a one- or two-letter label, Araucaria can also \n" +
"produce a non-editable ‘full-text’ diagram in which each node is expanded to\n" +
"contain the full text of the corresponding premise or conclusion.  Each node\n" +
"and support arrow in a diagram can also have an associated evaluation, which \n" 
+ "can be used to represent the confidence placed in a premise or support. To\n" +
"attach an evaluation to one or more parts of the diagram, the nodes and/or \n" +
"support arrows are selected and the evaluation editor is used to define the\n" +
"associated evaluation. Evaluations are displayed as labels next to the node or\n" +
"arrow on the main diagram.\n" 
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}