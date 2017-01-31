import javax.swing.*;
import java.awt.event.*;
public class PlanToolNewF implements ActionListener {
 
JButton j,k;
JLabel l;
JFrame f,f1;
public static void main(String args[]){
 
  PlanToolNewF x = new PlanToolNewF();
  x.go();
 
 
}
public void go(){
 
f = new JFrame("");
j = new JButton("Continue");
 
f.getContentPane().add(j);
 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
f.setSize(500,500);
f.setVisible(true);
j.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
f1 = new JFrame();
//k = new JButton("second frame");
//f1.getContentPane()// .add(k);
f1.setSize(500,500);
f1.setVisible(true);
 
 
}
}