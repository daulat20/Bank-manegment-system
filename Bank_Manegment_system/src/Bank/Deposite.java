package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Deposite extends JFrame implements ActionListener{
	String pin;
	TextField textfield;
	JButton b1,b2;
	
	Deposite(String pin){
		this.pin=pin;
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330,  650, Image.SCALE_DEFAULT); 
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0,0,1330,650);
		add(l3);
		
		JLabel lable1 = new JLabel("Enter Amount You Want To Deposite");
		lable1.setForeground(Color.white);
		lable1.setFont(new Font("System",Font.BOLD,19));
		lable1.setBounds(370,130,400,35);
		l3.add(lable1); 
		
		
		textfield = new TextField();
		textfield.setBackground(new Color(65,125,128));
		textfield.setForeground(Color.white);
		textfield.setBounds(370,160,320,25);
		textfield.setFont(new Font("Raleway",Font.BOLD,22));
		l3.add(textfield);
		
		b1 = new JButton("Deposite");
		b1.setForeground(Color.white);
		b1.setBackground(new Color(65,125,128));
		b1.setBounds(600, 285, 120, 25);
		b1.setFont(new Font("System",Font.BOLD,15));
		b1.addActionListener(this);
		l3.add(b1);

		b2 = new JButton("Back");
		b2.setForeground(Color.white);
		b2.setBackground(new Color(65,125,128));
		b2.setBounds(600, 320, 120, 25);
		b2.setFont(new Font("System",Font.BOLD,15));
		b2.addActionListener(this);
		l3.add(b2);
		
		
		
		setLayout(null);
		setSize(1330,690);
		setLocation(0,0);
		setUndecorated(true);
		setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String amount = textfield.getText();
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formattedDate = formatter.format(date);
			
			if(e.getSource() == b1) {
				if(textfield.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposite");
					
				}
				else {
					DbConnection c = new DbConnection();
					c.stat.executeUpdate("insert into bank(pin, date, type, amount) values('"+pin+"','"+formattedDate+"','Deposit','"+amount+"')");
					JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposite Successfully");
					setVisible(false);
					new Main_Class(pin);
				}
			}else if(e.getSource()==b2) {
				setVisible(false);
				new Main_Class(pin);
			}
		
		
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Deposite("");
	}

}
