import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PlanToolOJ extends JFrame implements ActionListener{

    JButton button=new JButton("Continue");
    public PlanToolOJ(){
      setLayout(new FlowLayout());
      button.addActionListener(this);
      add(button);
    }

public void actionPerformed(ActionEvent event){
    JFrame newFrame=new JFrame();
    newFrame.setVisible(true);
    newFrame.setSize(new Dimension(500,400));
    }

public static void main(String[] args) {

    PlanToolOJ t=new PlanToolOJ();
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    t.setVisible(true);
    t.setSize(new Dimension(500,400));  
 }

}