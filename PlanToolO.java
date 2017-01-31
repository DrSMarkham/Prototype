import java.awt.*;  
    import java.awt.event.*;  
     import javax.swing.*;  
    public class PlanToolO extends JFrame {  
        
     private JLabel l1;  
     private JLabel l2;  
     private JTextField t1;  
     private JPasswordField p1;  
    private JButton b1;  
        
     public PlanToolO()  
     {  
        super("");  
            
         Container container = getContentPane();  
         container.setLayout(new FlowLayout());  
            
            
         //l1=new JLabel("Continue");  
         //container.add(l1);  
         //t1=new JTextField(25);  
         //container.add(t1);  
         //l2=new JLabel(" Password :- ");  
         //container.add(l2);  
         //p1=new JPasswordField(25);  
         //container.add(p1);  
         b1=new JButton("Continue");  
         container.add(b1);  
            
         ButtonHandler handler = new ButtonHandler();  
         b1.addActionListener(handler);  
         setSize(400,150);  
         setVisible(true);  
     }  
     public static void main (String args[])  
     {  
       PlanToolO application = new PlanToolO();  
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     }  
        
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            /*String msg;
            msg = "Login Successful";
            JOptionPane.showMessageDialog(null, msg);*/
 
            JFrame secondFrame = new JFrame("");
            secondFrame.setSize(600, 500);
            secondFrame.setVisible(true);
            dispose();
        }
    }  
          }  