import javax.swing.*;
 
public class PlanAbsArgImage {
    public PlanAbsArgImage() {
        JFrame frame = new JFrame("Toulmin Diagram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = (JPanel)frame.getContentPane();
 
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\DrSMarkham\\Desktop\\Toulmin.png"));// your image here
        panel.add(label);
 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PlanAbsArgImage();
            }
        });
    }
}