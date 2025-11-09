package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BaleneceEnquery extends JFrame implements ActionListener{
	String pin;
	JLabel lable2;
	JButton b1;
	
	BaleneceEnquery(String pin){
		
		this.pin=pin;
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/atm2.png"));
		Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1330, 650);
		add(l3);

		JLabel lable1 = new JLabel("Your Current Balence Rs.");
		lable1.setForeground(Color.white);
		lable1.setFont(new Font("System", Font.BOLD, 19));
		lable1.setBounds(350, 130, 700, 35);
		l3.add(lable1);

		lable2 = new JLabel();
		lable2.setForeground(Color.white);
		lable2.setFont(new Font("System", Font.BOLD, 19));
		lable2.setBounds(350, 160, 700, 35);
		l3.add(lable2);
		
		b1 = new JButton("Back");
		b1.setForeground(Color.white);
		b1.setBackground(new Color(65, 125, 128));
		b1.setBounds(600, 320, 120, 25);
		b1.setFont(new Font("System", Font.BOLD, 15));
		b1.addActionListener(this);
		l3.add(b1);
		
		int balance = 0;
		try {
			DbConnection c = new DbConnection();
			ResultSet r = c.stat.executeQuery("select * from bank where pin = '"+pin+"'");
			
			while(r.next()) {
				if (r.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(r.getString("amount"));

				} else {
					balance -= Integer.parseInt(r.getString("amount"));
				}

				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		lable2.setText(""+balance);
		
		
		setLayout(null);
		setSize(1330, 690);
		setUndecorated(true);
		setLocation(0, 0);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Main_Class(pin);
	
		
	}
	public static void main(String[] args) {
		new BaleneceEnquery("");
	}

	

}
