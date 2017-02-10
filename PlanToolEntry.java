import java.awt.GridLayout;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class PlanToolEntry {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                BasicForm frame = new BasicForm("Entity Tuples");
                frame.createGUI();
            }
        });
    }
 
}
 
class BasicForm extends JFrame {
    public BasicForm(String name) {
        setTitle(name);
        BasicPanel panel = new BasicPanel();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
         
    }
    public void createGUI() {
        setVisible(true);
    }
}
 
class BasicPanel extends JPanel {
    public BasicPanel() {
        JButton button = new JButton("Enter New Entity Tuple");
        button.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent arg0) {
                InputDialog inputForm = new InputDialog();
                inputForm.setVisible(true);
            }
        });
        add(button);
    }
}
 
class InputDialog extends JDialog {
    public InputDialog() {
        InputPanel panel = new InputPanel();
        setTitle("Input Entity Tuple");
        add(panel);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(false);
    }
}
 
 
class InputPanel extends JPanel {
    JTextField labelField;
     JTextField roleField;
     JTextField resourceField;
     JTextField hazardField;
     JTextField envfacField;
      
    public InputPanel() {
        GridLayout gridLayout = new GridLayout(6,2);
        setLayout(gridLayout);
         labelField = new JTextField(20);
         roleField = new JTextField(20);
         resourceField = new JTextField(20);
         hazardField = new JTextField(20);
         envfacField = new JTextField(20);
         
         JLabel firstNameLabel = new JLabel("Label: ");
         JLabel secondNameLabel = new JLabel("Roles: ");
         JLabel phoneNumberLabel = new JLabel("Resources: ");
         JLabel thirdNameLabel = new JLabel("Hazards: ");
         JLabel fourthNumberLabel = new JLabel("Environmental Factors: "); 
         
         JButton saveToFileButton = new JButton("Save to file");
          
         saveToFileButton.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter writer;
                try {
                    //File file = new File("contacts.txt");
                    //writer = new BufferedWriter(new FileWriter("entitytuples.txt",true));
                    writer = new BufferedWriter(new FileWriter("C:\\Users\\DrSMarkham\\Desktop\\entitytuples.txt",true));
                    writer.write(labelField.getText() + "\t" + roleField.getText() + "\t" + 
                            resourceField.getText() + "\t" + hazardField.getText() + "\t" + envfacField.getText() );
                    writer.newLine();
                    writer.close();
                } catch(FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                 
            }
        });
         add(firstNameLabel);
         add(labelField);
         add(secondNameLabel);
         add(roleField);
         add(phoneNumberLabel);
         add(resourceField);
         add(thirdNameLabel);
         add(hazardField);
         add(fourthNumberLabel);
         add(envfacField);
         
         add(saveToFileButton);
    }                   
}