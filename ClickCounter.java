import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font; 
import javax.swing.JLabel;
import java.util.Random;

public class ClickCounter extends JFrame implements MouseListener, Runnable
{
   private JLabel LTitle;
   private JLabel Score;
   private JButton b1;
   private JButton b2;
   private JButton b3;
   private JButton b4;
   private JButton b5;
   private JButton b6;
   private JButton b7;
   private JButton b8;
   private JButton b9;
   private JButton b10;
   private JPanel PanelForm;
   private JRootPane RootPaneForm;
   private int count;
   
   class ButtonSensor implements ActionListener{
	   public void actionPerformed(ActionEvent ae){
		   JButton b = (JButton)ae.getSource();
		   if(b.getBackground() == Color.GREEN){count += 10;}
		   else{count -= 10;}
		   Score.setText("SCORE: " + count);
	   }
   }
   public ClickCounter()
   {
		super("Java click counter game");
		  
		this.setSize(800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		PanelForm = new JPanel();
		PanelForm.setLayout(null);
		
		count = 0;
		Score = new JLabel("SCORE: " +count);
		Score.setFont(new Font("Serif", Font.BOLD, 22));
		Score.setForeground(Color.BLACK);
		Score.setBounds(150, 200, 350, 50);
		PanelForm.add(Score);
		  
		LTitle = new JLabel("CLICK COUNTER");
		LTitle.setFont(new Font("Serif", Font.BOLD, 25));
		LTitle.setForeground(Color.BLACK);
		LTitle.setBounds(250, 100, 350, 50);
		PanelForm.add(LTitle);
	
		b1 = new JButton("1");
		b1.setBackground(Color.RED);
		b1.setBounds(100,400,80,80);
		b1.addActionListener(new ButtonSensor());
		PanelForm.add(b1);
		
		b2 = new JButton("2");
		b2.setBackground(Color.RED);
		b2.setBounds(200,400,80,80);
		b2.addActionListener(new ButtonSensor());
		PanelForm.add(b2);
		
		b3 = new JButton("3");
		b3.setBackground(Color.RED);
		b3.setBounds(300,400,80,80);
		b3.addActionListener(new ButtonSensor());
		PanelForm.add(b3);
				
		
		b4 = new JButton("4");
		b4.setBackground(Color.RED);
		b4.setBounds(400,400,80,80);
		b4.addActionListener(new ButtonSensor());
		PanelForm.add(b4);
		
		
		b5 = new JButton("5");
		b5.setBackground(Color.RED);
		b5.setBounds(500,400,80,80);
		b5.addActionListener(new ButtonSensor());
		PanelForm.add(b5);
		
		
		b6 = new JButton("6");
		b6.setBackground(Color.RED);
		b6.setBounds(100,500,80,80);
		b6.addActionListener(new ButtonSensor());
		PanelForm.add(b6);
		
		b7 = new JButton("7");
		b7.setBackground(Color.RED);
		b7.setBounds(200,500,80,80);
		b7.addActionListener(new ButtonSensor());
		PanelForm.add(b7);
		
		
		b8 = new JButton("8");
		b8.setBackground(Color.RED);
		b8.setBounds(300,500,80,80);
		b8.addActionListener(new ButtonSensor());
		PanelForm.add(b8);
		
				
		b9 = new JButton("9");
		b9.setBackground(Color.RED);
		b9.setBounds(400,500,80,80);
		b9.addActionListener(new ButtonSensor());
		PanelForm.add(b9);
		
		b10 = new JButton("10");
		b10.setBackground(Color.RED);
		b10.setBounds(500,500,80,80);
		b10.addActionListener(new ButtonSensor());
		PanelForm.add(b10);
			
		this.add(PanelForm);

   }
   
   
   	public void run() 
	{
      try 
	  {
            for(int i = 0; i < 500; i++) 
			{
			    int x;
				Random r=new Random();
				x=r.nextInt(10);
				if(x==1)
				{
				  b1.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b1.setBackground(Color.RED);
				}
				else if(x==2)
				{
				  b2.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b2.setBackground(Color.RED);
				}
				else if(x==3)
				{
				  b3.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b3.setBackground(Color.RED);
				}
				else if(x==4)
				{
				  b4.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b4.setBackground(Color.RED);
				}
				else if(x==5)
				{
				  b5.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b5.setBackground(Color.RED);
				}
				else if(x==6)
				{
				  b6.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b6.setBackground(Color.RED);
				}
				else if(x==7)
				{
				  b7.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b7.setBackground(Color.RED);
				}
				else if(x==8)
				{
				  b8.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b8.setBackground(Color.RED);
				}
				else if(x==9)
				{
				  b9.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b9.setBackground(Color.RED);
				}
		        else if(x==10)
				{
				  b10.setBackground(Color.GREEN);
				  Thread.sleep(1500);
				  b10.setBackground(Color.RED);
				}
				
				System.out.println( "Loop" + i);
				
				
				
            }
       }
	  catch (Exception e) 
	    {
         System.out.println(e.getMessage());
        }
   }
   
   public void start()
   {
     if(t == null)
	  {
         t = new Thread (this);
         t.start ();
      }
   }
   
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
    private Thread t;
    

		
}