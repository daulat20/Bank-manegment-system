package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_Class extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	Main_Class(String pin){
		this.pin =pin;
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330,  650, Image.SCALE_DEFAULT); 
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0,0,1330,650);
		add(l3);
		
		JLabel lable1 = new JLabel("Please Select Your Transaction");
		lable1.setForeground(Color.white);
		lable1.setFont(new Font("System",Font.BOLD,21));
		lable1.setBounds(370,130,400,35);
		l3.add(lable1);
		
		b1 = new JButton("Deposite");
		b1.setForeground(Color.white);
		b1.setBackground(new Color(65,125,128));
		b1.setBounds(350, 215, 120, 25);
		b1.setFont(new Font("System",Font.BOLD,15));
		b1.addActionListener(this);
		l3.add(b1);
		
		b2 = new JButton("Cash Withdrawl");
		b2.setForeground(Color.white);
		b2.setBackground(new Color(65,125,128));
		b2.setFont(new Font("System",Font.BOLD,15));
		b2.setBounds(565, 215, 160, 25);
		b2.addActionListener(this);
		l3.add(b2);
		
		b3 = new JButton("Fast Cash");
		b3.setForeground(Color.white);
		b3.setBackground(new Color(65,125,128));
		b3.setFont(new Font("System",Font.BOLD,15));
		b3.setBounds(350, 250, 120, 25);
		b3.addActionListener(this);
		l3.add(b3);
		
		b4 = new JButton("Mini Statement");
		b4.setForeground(Color.white);
		b4.setBackground(new Color(65,125,128));
		b4.setFont(new Font("System",Font.BOLD,15));
		b4.setBounds(565 , 250, 160, 25);
		b4.addActionListener(this);
		l3.add(b4);
		
		b5 = new JButton("Pin Change");
		b5.setForeground(Color.white);
		b5.setBackground(new Color(65,125,128));
		b5.setFont(new Font("System",Font.BOLD,15));
		b5.setBounds(350, 285, 123, 25);
		b5.addActionListener(this);
		l3.add(b5);
		
		b6 = new JButton("Balence Enquery");
		b6.setForeground(Color.white);
		b6.setBackground(new Color(65,125,128));
		b6.setFont(new Font("System",Font.BOLD,15));
		b6.setBounds(565, 285, 160, 25);
		b6.addActionListener(this);
		l3.add(b6);
		
		
		b7 = new JButton("Exit");
		b7.setForeground(Color.white);
		b7.setBackground(new Color(65,125,128));
		b7.setFont(new Font("System",Font.BOLD,15));
		b7.setBounds(350, 320, 120, 25);
		b7.addActionListener(this);
		l3.add(b7);

		
		setLayout(null);
		setUndecorated(true);
		setSize(1330,690);
		setLocation(0,0);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) {
			new Deposite(pin);
			setVisible(false);
		}
		else if(e.getSource()==b7) {
			System.exit(0);
		}
		else if (e.getSource() == b2) {
			new Withdrawl(pin);
		    setVisible(false);
		    
		}

		else if (e.getSource()==b6) {
			new BaleneceEnquery(pin);
			setVisible(false);
		}
		else if (e.getSource()==b3) {
			new FastCash(pin);
			setVisible(false);
		}
		else if (e.getSource() == b5) {
			new PinChange(pin);
			setVisible(false);
		}
		else if (e.getSource()==b4) {
			new MiniStatement(pin);
//			setVisible(false);
		}
	}
	public static void main(String[] args) {
		new Main_Class("");
	}

	

}
