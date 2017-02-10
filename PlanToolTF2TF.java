import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
 
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class PlanToolTF2TF {
 
    private JFrame newuser;
    private JPanel newuserpanel;
    private JTextField roletextfield;
    private JTextField resourcetextfield;
    private JTextField hazardtextfield;
    private JTextField envfactextfield;
    
    //private JTextField 
    //private JTextField
    //private JTextField
    private JButton submitbutton;
    private JButton clearbutton;
 
    /** Creates new form NewUser */
    public PlanToolTF2TF() {
        initComponents();
    }
 
    private final void initComponents(){
    JLabel firstname = new JLabel("Roles:");
    JLabel lastname = new JLabel("Resources:");
    JLabel email = new JLabel("Hazards:");
    JLabel phone = new JLabel("Environmental Factors:");
    roletextfield = new JTextField();
    resourcetextfield = new JTextField();
    hazardtextfield = new JTextField();
    envfactextfield= new JTextField();
    
    JPanel userInputPanel = new JPanel(new GridLayout(4,5,5,5));
    userInputPanel.setBorder(BorderFactory.createEmptyBorder(50,50,80,80));
    userInputPanel.add(firstname);
    userInputPanel.add(roletextfield);
    roletextfield.setColumns(15);
    roletextfield.setText("Enter roles separated by commas");
    userInputPanel.add(lastname);
    userInputPanel.add(resourcetextfield);
    resourcetextfield.setColumns(15);
    resourcetextfield.setText("Enter resources separated by commas");
    userInputPanel.add(email);
    userInputPanel.add(hazardtextfield);    
    hazardtextfield.setColumns(15);
    hazardtextfield.setText("Enter hazards separated by commas");
    userInputPanel.add(phone);
    userInputPanel.add(envfactextfield);
    envfactextfield.setColumns(15);
    envfactextfield.setText("Enter environmental factors separated by commas");
 
    submitbutton = new JButton(new SubmitAction());
    clearbutton = new JButton(new ClearAction());
 
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(submitbutton);
    buttonPanel.add(clearbutton);
     
     
    newuserpanel = new JPanel(new BorderLayout());
    newuserpanel.add(userInputPanel,BorderLayout.NORTH);
    newuserpanel.add(buttonPanel,BorderLayout.SOUTH);
 
 
    newuser = new JFrame("Entity Tuples");
    newuser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    newuser.setSize(1500,1500);
    newuser.setContentPane(newuserpanel);
    newuser.pack();
    newuser.setVisible(true);
 
    }
    private void performSubmit(){
 
    roletextfield.getText();
    resourcetextfield.getText();
    hazardtextfield.getText();
    envfactextfield.getText();
     
 
    }
 
    private void performClear(){
        System.out.println("Clearing the panel");
        roletextfield.setText("");
        resourcetextfield.setText("");
        hazardtextfield.setText("");
       envfactextfield.setText("");
    }
    
    
    private final class SubmitAction extends AbstractAction{
 
        public SubmitAction() {
            super("Submit");
        }
        @Override
 
        public void actionPerformed(ActionEvent e){
            performSubmit();
            try{
    // Create file
    FileWriter fstream = new FileWriter("C:\\Users\\DrSMarkham\\Desktop\\outet.txt");
    BufferedWriter out = new BufferedWriter(fstream);
    
    out.write(roletextfield.getText());
    out.write(resourcetextfield.getText());
    out.write(hazardtextfield.getText());
    out.write(envfactextfield.getText());
    
    //out.write(data);
    //Close the output stream
    out.close();
    } catch (Exception evt){//Catch exception if any
    System.err.println("Error: " + evt.getMessage());
    }
            
        }
    }
    
    
 
    
    private final class ClearAction extends AbstractAction{
 
        public ClearAction(){
            super("Clear");
        }
 
        @Override
        public void actionPerformed(ActionEvent e){
            performClear();
 
        }
    }
                  
 
    public static void main(String args[]){
    new PlanToolTF2TF();
}
}