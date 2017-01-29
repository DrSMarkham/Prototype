import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class PlanExit extends JFrame implements ActionListener
{
  JButton bQuit = new JButton("Click here to Exit");   
  
  public PlanExit(String title) 
  {
    super(title);
    setLayout( new FlowLayout() );
    bQuit.addActionListener( this );
    add( bQuit );
  }
  
  public void actionPerformed( ActionEvent evt)
  {
    System.exit( 0 );
  }   
  
  public static void main ( String[] args )
  {
    PlanExit frame = new PlanExit("Button Quitter");
   
    frame.setSize( 200, 100 );  
    frame.setVisible( true );        
  }
}