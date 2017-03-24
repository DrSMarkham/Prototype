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
 
public class PlanToolAna {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                BasicForm1 frame = new BasicForm1("Tasking Expression Query");
                frame.createGUI();
            }
        });
    }
 
}
 
class BasicForm1 extends JFrame {
    public BasicForm1(String name) {
        setTitle(name);
        BasicPanel1 panel = new BasicPanel1();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
         
    }
    public void createGUI() {
        setVisible(true);
    }
}
 
class BasicPanel1 extends JPanel {
    public BasicPanel1() {
        JButton button = new JButton("Enter New Tasking Expression Query");
        button.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent arg0) {
                InputDialog1 inputForm = new InputDialog1();
                inputForm.setVisible(true);
            }
        });
        add(button);
    }
}
 
class InputDialog1 extends JDialog {
    public InputDialog1() {
        InputPanel1 panel = new InputPanel1();
        setTitle("Input Tasking Expression Query");
        add(panel);
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(false);
    }
}
 
 
class InputPanel1 extends JPanel {
    //JTextField labelField;
     JTextField verbField;
     //JTextField taskerField;
     //JTextField taskeeField;
     JTextField affectField;
     JTextField actionField;
     //JTextField atwhereField;
     //JTextField routewhereField;
     //JTextField startwhenField;
     //JTextField endwhenField;
     JTextField whyField;
     //JTextField labelField;
     JTextField modField;
     
    public InputPanel1() {
        GridLayout gridLayout = new GridLayout(6,2);
        setLayout(gridLayout);
         
         verbField = new JTextField(20);
         //taskerField = new JTextField(20);
         //taskeeField = new JTextField(20);
         affectField = new JTextField(20);
         actionField = new JTextField(20);
         //atwhereField = new JTextField(20);
         //routewhereField = new JTextField(20);
         //startwhenField = new JTextField(20);
         //endwhenField = new JTextField(20);
         whyField = new JTextField(20);
         modField = new JTextField(20);
         //labelField = new JTextField(20);
         
         
         JLabel firstNameLabel = new JLabel("Verb: ");
         //JLabel secondNameLabel = new JLabel("Tasker: ");
         //JLabel phoneNumberLabel = new JLabel("Taskee: ");
         JLabel thirdNameLabel = new JLabel("Affect: ");
         JLabel fourthNumberLabel = new JLabel("Action: "); 
         //JLabel fifthNameLabel = new JLabel("At-Where: ");
         //JLabel sixthNumberLabel = new JLabel("Route-Where: ");
         //JLabel seventhNameLabel = new JLabel("Start-When: ");
         //JLabel eighthNumberLabel = new JLabel("End-When: "); 
         JLabel ninthNameLabel = new JLabel("Why: ");
         JLabel tenthNumberLabel = new JLabel("Label: ");
         JLabel eleventhNameLabel = new JLabel("Mod: ");
         
         
         JButton saveToFileButton = new JButton("Save to file");
         
         JButton cont = new JButton("Continue");
         cont.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				PlanToolSea frame = new PlanToolSea();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
         
          
         saveToFileButton.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter writer;
                try {
                    //File file = new File("contacts.txt");
                    //writer = new BufferedWriter(new FileWriter("entitytuples.txt",true));
                    writer = new BufferedWriter(new FileWriter("C:\\Users\\DrSMarkham\\Desktop\\anasea.txt",true));
                    writer.write(verbField.getText() + "\t" + actionField.getText() + "\t" +
                             actionField.getText() + "\t" 
                    +  whyField.getText() + "\t" +  modField.getText()
                    );
                    writer.newLine();
                    writer.close();
                } catch(FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                 
            }
        });
         
         JButton clear = new JButton("Clear");
         clear.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         verbField.setText("");
         affectField.setText("");
         actionField.setText("");
         whyField.setText("");
         modField.setText(null); //or use this
    }
});
         
         add(firstNameLabel);
         add(verbField);
         //add(secondNameLabel);
         //add(taskerField);
         ////add(phoneNumberLabel);
         //add(taskeeField);
         add(thirdNameLabel);
         add(affectField);
         add(fourthNumberLabel);
         add(actionField);
         //add(fifthNameLabel);
         //add(atwhereField);
         //add(sixthNumberLabel);
         //add(routewhereField);
         //add(seventhNameLabel);
         //add(startwhenField);
         //add(eighthNumberLabel);
         //add(endwhenField);
         add(ninthNameLabel);
         add(whyField);
         //add(tenthNumberLabel);
         //add(labelField);
         add(eleventhNameLabel);
         add(modField);
         
         add(saveToFileButton);
         //add(cont);
         add(clear);
    }                   
}