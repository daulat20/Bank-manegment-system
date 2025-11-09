package Bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JLabel label1, label2, label3;
	JTextField textfield1;
	JPasswordField passwordfield2;
	JButton bsignin, bclear, bsignup;

	public Login() {
		super("Bank Manegment System");

		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(300, 10, 100, 100);
		add(image);


		label1 = new JLabel("WELCOME TO MY BANK");
		label1.setForeground(Color.white);
		label1.setFont(new Font("AvantGarde", Font.BOLD, 33));
		label1.setBounds(100, 125, 450, 40);
		add(label1);

		label2 = new JLabel("Card No : ");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Ralway", Font.BOLD, 20));
		label2.setBounds(50, 200, 375, 30);
		add(label2);

		textfield1 = new JTextField(15);
		textfield1.setBounds(225, 200, 230, 30);
		textfield1.setFont(new Font("Arial", Font.BOLD, 14));
		add(textfield1);

		label3 = new JLabel("PIN : ");
		label3.setForeground(Color.white);
		label3.setFont(new Font("Ralway", Font.BOLD, 20));
		label3.setBounds(50, 250, 375, 30);
		add(label3);

		passwordfield2 = new JPasswordField(6);
		passwordfield2.setBounds(225, 250, 230, 30);
		passwordfield2.setFont(new Font("Arial", Font.BOLD, 14));
		add(passwordfield2);

		bsignin = new JButton("SIGN IN");
		bsignin.setFont(new Font("Arial", Font.BOLD, 14));
		bsignin.setForeground(Color.white);
		bsignin.setBackground(Color.BLACK);
		bsignin.setBounds(100, 320, 100, 30);
		bsignin.addActionListener(this);
		add(bsignin);

		bclear = new JButton("CLEAR");
		bclear.setFont(new Font("Arial", Font.BOLD, 14));
		bclear.setForeground(Color.white);
		bclear.setBackground(Color.BLACK);
		bclear.setBounds(270, 320, 100, 30);
		bclear.addActionListener(this);
		add(bclear);

		bsignup = new JButton("SIGN UP");
		bsignup.setFont(new Font("Arial", Font.BOLD, 14));
		bsignup.setForeground(Color.white);
		bsignup.setBackground(Color.black);
		bsignup.setBounds(170, 375, 150, 30);
		bsignup.addActionListener(this);
		add(bsignup);

		ImageIcon iii1 = new ImageIcon(getClass().getResource("/Bank/bank.jpg"));
		Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_SMOOTH);
		ImageIcon iii3 = new ImageIcon(iii2);
		JLabel image2 = new JLabel(iii3);
		image2.setBounds(0, 0, 850, 480);
		add(image2);

		setLayout(null);
		setSize(850, 480);
		setLocation(280, 150);
		setUndecorated(true);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			if(e.getSource() == bsignin) {
				
				DbConnection con = new DbConnection();
				String cardno = textfield1.getText();
				String pin = passwordfield2.getText();
				String q = "select * from login where card_no = '"+cardno+"' and  pin = '"+pin+"'";
				ResultSet r = con.stat.executeQuery(q);
				if(r.next()) {
					setVisible(false);
					new Main_Class(pin);
				}
				
				
				
			}else if(e.getSource()==bclear) {
				textfield1.setText("");
				passwordfield2.setText("");
				
			}else if(e.getSource()==bsignup) {
				new Sign_up();
				setVisible(false);
				
			}
		} catch (Exception E) {
			E.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Login();
	}

}
