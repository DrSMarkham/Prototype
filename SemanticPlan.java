import javax.swing.*;
import javax.swing.text.*;

public class SemanticPlan {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Semantic Plan Representation");
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation"
    
    );
    f.getContentPane().add(ta);
    f.pack();
    f.setVisible(true);

    ((AbstractDocument)ta.getDocument()).dump(System.out);
  }
}