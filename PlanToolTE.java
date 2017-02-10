import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
 
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class PlanToolTE {
 
    private JFrame newuser;
    private JPanel newuserpanel;
    private JTextField verbtextfield;
    private JTextField taskertextfield;
    private JTextField taskeetextfield;
    private JTextField affecttextfield;
    private JTextField actiontextfield;
    private JTextField atwheretextfield;
    private JTextField routewheretextfield;
    private JTextField startwhentextfield;
    private JTextField endwhentextfield;
    private JTextField whytextfield;
    private JTextField labeltextfield;
    private JTextField modtextfield;
    
    //private JTextField 
    //private JTextField
    //private JTextField
    private JButton submitbutton;
    private JButton clearbutton;
 
    /** Creates new form NewUser */
    public PlanToolTE() {
        initComponents();
    }
 
    private final void initComponents(){
    JLabel firstname = new JLabel("Verb:");
    JLabel lastname = new JLabel("Tasker:");
    JLabel email = new JLabel("Taskee:");
    JLabel phone = new JLabel("Affect:");
    JLabel action = new JLabel("Action:");
    JLabel atwhere = new JLabel("At-Where:");
    JLabel routewhere = new JLabel("Route-Where:");
    JLabel startwhen = new JLabel("Start-When:");
    JLabel endwhen = new JLabel("End-When:");
    JLabel why = new JLabel("Why:");
    JLabel label = new JLabel("Label:");
    JLabel mod = new JLabel("Mod:");
    
    verbtextfield = new JTextField();
    taskertextfield = new JTextField();
    taskeetextfield = new JTextField();
    affecttextfield= new JTextField();
    actiontextfield = new JTextField();
    atwheretextfield = new JTextField();
    routewheretextfield = new JTextField();
    startwhentextfield= new JTextField();
    endwhentextfield = new JTextField();
    whytextfield = new JTextField();
    labeltextfield = new JTextField();
    modtextfield= new JTextField();
    
    JPanel userInputPanel = new JPanel(new GridLayout(4,5,5,5));
    userInputPanel.setBorder(BorderFactory.createEmptyBorder(50,50,80,80));
    userInputPanel.add(firstname);
    userInputPanel.add(verbtextfield);
    verbtextfield.setColumns(15);
    userInputPanel.add(lastname);
    userInputPanel.add(taskertextfield);
    taskertextfield.setColumns(15);
    userInputPanel.add(email);
    userInputPanel.add(taskeetextfield);
    taskeetextfield.setColumns(15);
    userInputPanel.add(phone);
    userInputPanel.add(affecttextfield);
    affecttextfield.setColumns(15);
    userInputPanel.add(action);
    userInputPanel.add(actiontextfield);
    actiontextfield.setColumns(15);
    userInputPanel.add(atwhere);
    userInputPanel.add(atwheretextfield);
    atwheretextfield.setColumns(15);
    userInputPanel.add(routewhere);
    userInputPanel.add(routewheretextfield);
    routewheretextfield.setColumns(15);
    userInputPanel.add(startwhen);
    userInputPanel.add(startwhentextfield);
    startwhentextfield.setColumns(15);
    userInputPanel.add(endwhen);
    userInputPanel.add(endwhentextfield);
    endwhentextfield.setColumns(15);
    userInputPanel.add(why);
    userInputPanel.add(whytextfield);
    whytextfield.setColumns(15);
    userInputPanel.add(label);
    userInputPanel.add(labeltextfield);
    labeltextfield.setColumns(15);
    userInputPanel.add(mod);
    userInputPanel.add(modtextfield);
    modtextfield.setColumns(15);
    
    submitbutton = new JButton(new SubmitAction());
    clearbutton = new JButton(new ClearAction());
 
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(submitbutton);
    buttonPanel.add(clearbutton);
    
    
    buttonPanel.add(clearbutton);
    
    newuserpanel = new JPanel(new BorderLayout());
    newuserpanel.add(userInputPanel,BorderLayout.NORTH);
    newuserpanel.add(buttonPanel,BorderLayout.SOUTH);
 
 
    newuser = new JFrame("Tasking Expressions");
    newuser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    newuser.setSize(1500,1500);
    newuser.setContentPane(newuserpanel);
    newuser.pack();
    newuser.setVisible(true);
 
    }
 
    private void performSubmit(){
 
    verbtextfield.getText();
    taskertextfield.getText();
    taskeetextfield.getText();
    affecttextfield.getText();
    actiontextfield.getText();
    atwheretextfield.getText();
    routewheretextfield.getText();
    startwhentextfield.getText();
    endwhentextfield.getText();
    whytextfield.getText();
    labeltextfield.getText();
    modtextfield.getText();
 
    }
 
    private void performClear(){
        System.out.println("Clearing the panel");
        verbtextfield.setText("");
        taskertextfield.setText("");
        taskeetextfield.setText("");
       affecttextfield.setText("");
       actiontextfield.setText("");
        atwheretextfield.setText("");
        routewheretextfield.setText("");
       startwhentextfield.setText("");
       endwhentextfield.setText("");
        whytextfield.setText("");
        labeltextfield.setText("");
       modtextfield.setText("");
       
    }
 
    private final class SubmitAction extends AbstractAction{
 
        public SubmitAction() {
            super("Submit");
        }
        @Override
 
        public void actionPerformed(ActionEvent e){
            performSubmit();
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
    new PlanToolTE();
}
}