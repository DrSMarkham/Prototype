
import javax.swing.*;
import javax.swing.text.*;
//Follow PlanOnt.java 
public class PlanToolOnt {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Semantic Plan Representation Tool");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation Tool\n" + "\n" +
    
" A schematic representation of the military campaign ontology:\n" +
"\n" +
"                                                        Military Campaign frame\n" +
"                                                                    |\n" +
"                                                           Operation sub-frame\n" +
"                                                          /                  \\           \n" +
"                                   ActionsAnticipated sub-frame      ActionsExecuted sub-frame\n" +
"                                                     \n" +
" Individual operation frames corresponding to a given military campaign are\n" +
"hierarchically ordered according to a temporal execution sequence to create a\n" +
"military campaign ontology. Individual operation frames (ontological nodes)\n" +
"could be further related by the following binary relations:\n" +
                        "\n" +
"i)Semantic similarity of objectives/operation type (reconnaissance, rescue, aid, etc.)\n" +
"ii)Overlapping (geographical) areas of operation\n" +
"iii)Semantic similarity of operation type\n" +
"iv)Semantic similarity of operational environment" +
"v)Semantic similarity of commander’s intent" +
" \n" + "\n" + 
" Frames which comprise the instances of Script Learning appear as sub-frames\n" +
"to the corresponding ActionsExecuted frames of the military campaign ontology.\n"  +
" In terms of C2IEDM the attributes of the Script Frames are:\n" +
"i)Pre-conditions for the instance(s) of experiential learning – ACTION-CONDITION\n" +
"ii)Entities –ACTION-RESOURCE\n" +
"iii)Actors – ACTION-ACTOR\n" +
"iv)Actions – ACTION-TASK\n" +
"v)Scenes – key temporal aspects (intervals) - ACTION-EVENT\n" +
"vi)Outcomes - of the experiential learning – ACTION-EFFECT\n" +
"\n" +
" Sets of instances of these script components can be used to reframe the data\n" +
"captured in the tasking expression associated with an ActionExecuted frame \n" +
"instance. This allows a task to be described in terms of sub-tasks and thereby\n" +
"capture finer detail. Individual instances of learning script frames are \n" +
"related by semantic similarity (as described above for operation frames)."
    

    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}






