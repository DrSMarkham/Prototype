import javax.swing.*;
//import javax.swing.JButton;  
//import javax.swing.JFrame;  

//Go To PlanMenu from here

public class PlanNewFrame extends JFrame {
    
   

public static void main(String[] args) {
PlanNewFrame regface = new PlanNewFrame();
}

JLabel welcome = new JLabel("Welcome to the Planning Tool");
JButton cont = new JButton("Continue");
JPanel panel = new JPanel();

PlanNewFrame(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
cont.setBounds(110,100,80,20);

panel.add(cont);


     
    
panel.setLayout(null);

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}
