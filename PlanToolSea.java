import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
 
public class NewWindowB extends JFrame {
    
    JButton b1;
    JLabel l1;
    public NewWindowB() {
        
        


//class PlanToolIB extends JFrame
//{

    

    //public PlanToolIB() {

        setSize(400,400);
        setVisible(true);

        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\DrSMarkham\\Desktop\\Toulmin.png"));

        add(background);

        background.setLayout(new FlowLayout());
        
        
        JButton btnNewFrame4 = new JButton("Continue");
		//add actionListener
		btnNewFrame4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				//NewWindowB frame = new NewWindowB();
				//frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame4.setBounds(280, 650, 178, 25);

        l1=new JLabel("Toulmin Diagram");
        //b1=new JButton("Continue");

        background.add(l1);
        background.add(btnNewFrame4);
    }

    public static void main(String args[]) 
    {
        new NewWindowB();
    }
}
    

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
         
         JButton btnNewFrame8 = new JButton("Continue");
		//add actionListener
		btnNewFrame8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindowSem frame = new NewWindowSem();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                btnNewFrame8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame8.setBounds(280, 500, 178, 25);
         
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
         add(btnNewFrame8);
    }                   
}//JFrame frame = new JFrame("Toulmin Diagram");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //JPanel panel1 = (JPanel)frame.getContentPane();
 
        //JLabel label1 = new JLabel();
        //label1.setIcon(new ImageIcon("C:\\Users\\DrSMarkham\\Desktop\\Toulmin.png"));// your image here
        //panel1.add(label1);
        
                
                //JPanel panel2 = (JPanel)frame.getContentPane();
                //panel.add(btnNewFrame4);
                //JLabel label2 = new JLabel();
                //label2.add(btnNewFrame4);
                //panel1.add(label2);
        
        
        
        //frame.setSize(300, 300);
        
        //frame.getContentPane().add(textArea);
    //add Button into contentPane
        //textArea.add(btnNewFrame4);
        //frame.getContentPane().add(btnNewFrame4);
        //frame.setLocationRelativeTo(null);
        //frame.pack();
        //frame.setVisible(true);
        
        
    //public static void main (String args[]) {
    //    SwingUtilities.invokeLater(new Runnable() {
    //        public void run() {
    //            new NewWindow4();
    //        }
    //    });
    //}
