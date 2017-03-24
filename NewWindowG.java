import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class NewWindowG extends JFrame {
    
    JButton b1;
    JLabel l1;
    public NewWindowG() {
        
        


//class PlanToolIB extends JFrame
//{

    

    //public PlanToolIB() {

        setSize(400,400);
        setVisible(true);

        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\DrSMarkham\\Desktop\\digraph.png"));

        add(background);

        background.setLayout(new FlowLayout());
        
        
        JButton btnNewFrame11 = new JButton("Continue");
		//add actionListener
		btnNewFrame11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//new PlanToolG();
//call the object of NewWindow and set visible true
				PlanToolG1 frame = new PlanToolG1();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame11.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame11.setBounds(280, 650, 178, 25);
                
                JButton btnNewFramea = new JButton("Deploy Tool");
		//add actionListener
		btnNewFramea.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				GraphModel frame = new GraphModel();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            //new PlanToolPBA();
			}
		});
                btnNewFramea.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFramea.setBounds(280, 650, 178, 25);
                
                

        l1=new JLabel("Digraph");
        //b1=new JButton("Continue");

        background.add(l1);
        background.add(btnNewFrame11);
        background.add(btnNewFramea);
    }

    public static void main(String args[]) 
    {
        new NewWindowG();
    }
}
            //JFrame frame = new JFrame("Toulmin Diagram");
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
