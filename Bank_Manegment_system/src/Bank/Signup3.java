package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener{
	
	JRadioButton rsaving,rfdeposite,rcurrent,rrd;
	
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
	JButton bsave,bcancel;
	
	String formno=" ";
	 Signup3(String formno) {
		 this.formno = formno;
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		JLabel l1 = new JLabel("Page 3 ");
		l1.setFont(new Font("Raleway",Font.BOLD,20));
		l1.setBounds(300,30,600,40);
		add(l1);
		
		JLabel l2 = new JLabel("Account Details ");
		l2.setFont(new Font("Raleway",Font.BOLD,25));
		l2.setBounds(300,60,600,40);
		add(l2);
		
		JLabel l3 = new JLabel("Account Type :");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setBounds(100,140,150,30);
		add(l3);
		
		rsaving = new JRadioButton("Saving Account");
		rsaving.setFont(new Font("Raleway", Font.BOLD, 15));
		rsaving.setBounds(120, 170, 160, 30);
		rsaving.setBackground(Color.CYAN);
		add(rsaving);

		rfdeposite = new JRadioButton("Fixed Deposite Account");
		rfdeposite.setFont(new Font("Raleway", Font.BOLD, 15));
		rfdeposite.setBounds(320, 170, 260, 30);
		rfdeposite.setBackground(Color.CYAN);
		add(rfdeposite);
		
		rcurrent = new JRadioButton("Current Account");
		rcurrent.setFont(new Font("Raleway", Font.BOLD, 15));
		rcurrent.setBounds(120, 200, 180, 30);
		rcurrent.setBackground(Color.CYAN);
		add(rcurrent);
		
		rrd = new JRadioButton("Recuiring Deposite Account");
		rrd.setFont(new Font("Raleway", Font.BOLD, 15));
		rrd.setBounds(320, 200, 260, 30);
		rrd.setBackground(Color.CYAN);
		add(rrd);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rsaving);
		bg.add(rfdeposite);
		bg.add(rcurrent);
		bg.add(rrd);
		
		JLabel l4 = new JLabel("Card Number :");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		l4.setBounds(100,260,150,30);
		add(l4);
		
		JLabel l5 = new JLabel("(Your 16-digit Card Number :)");
		l5.setFont(new Font("Raleway",Font.BOLD,10));
		l5.setBounds(100,285,250,20);
		add(l5);
		
		JLabel l6 = new JLabel("XXXX-XXXX-XXXX- 4862");
		l6.setFont(new Font("Raleway",Font.BOLD,16));
		l6.setBounds(330,260,250,30);
		add(l6);
		
		JLabel l7 = new JLabel("(if would appear on atmcard/cheque book and statements)");
		l7.setFont(new Font("Raleway",Font.BOLD,10));
		l7.setBounds(330,285,450,20);
		add(l7);
		
		JLabel l8 = new JLabel("PIN :");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		l8.setBounds(100,330,150,30);
		add(l8);
		
		JLabel l9 = new JLabel("XXXX");
		l9.setFont(new Font("Raleway",Font.BOLD,18));
		l9.setBounds(330,330,150,30);
		add(l9);
		
		JLabel l10 = new JLabel("(4-Digit Password)");
		l10.setFont(new Font("Raleway",Font.BOLD,10));
		l10.setBounds(100,355,250,20);
		add(l10);
		
		JLabel l11 = new JLabel("Services Required :");
		l11.setFont(new Font("Raleway",Font.BOLD,18));
		l11.setBounds(100,390,200,30);
		add(l11);
		
		c1 = new JCheckBox("Atm card");
		c1.setBackground(Color.CYAN);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(120,420,150,30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.CYAN);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(320,420,250,30);
		add(c2);
		
		c3 = new JCheckBox("Mobail Banking");
		c3.setBackground(Color.CYAN);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(120,450,150,30);
		add(c3);
		
		c4 = new JCheckBox("Email Alerts");
		c4.setBackground(Color.CYAN);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(320,450,250,30);
		add(c4);
		
		c5 = new JCheckBox("Check Book");
		c5.setBackground(Color.CYAN);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(120,480,150,30);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.CYAN);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(320,480,250,30);
		add(c6);
		
		JLabel l12 = new JLabel("Form No :");
		l12.setFont(new Font("Raleway", Font.BOLD, 14));
		l12.setBounds(550, 5, 200, 30);
		add(l12);
		
		JLabel l13 = new JLabel( );
		l13.setFont(new Font("Raleway", Font.BOLD, 16));
		l13.setBounds(600, 5, 200, 30);
		add(l13);
		
		bsave = new JButton("Submit");
		bsave.setFont(new Font("Raleway", Font.BOLD, 18));
		bsave.setBackground(Color.black);
		bsave.setForeground(Color.white);
		bsave.setBounds(180, 560, 100, 25);
		bsave.addActionListener(this);
		add(bsave);
		
		bcancel = new JButton("Cancel");
		bcancel.setFont(new Font("Raleway", Font.BOLD, 18));
		bcancel.setBackground(Color.black);
		bcancel.setForeground(Color.white);
		bcancel.setBounds(380, 560, 100, 25);
		bcancel.addActionListener(this);
		add(bcancel);
		
		
		
		
		getContentPane().setBackground(Color.CYAN);
		setLayout(null);
		setSize(750, 655);
		setUndecorated(true);
		setLocation(270, 30);
		setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String atype = " ";
		if(rsaving.isSelected()) {
			atype="Saving Account";
			
		}else if(rfdeposite.isSelected()) {
			atype="Fixed Deposite Account";
		}else if(rcurrent.isSelected()) {
			atype="Current Account";
		}else if(rrd.isSelected()) {
			atype="Recuiring Deposite Account";
		}
		Random ran = new Random();
		long first7 = (ran.nextLong() % 90000000L)+1409963000000000L;
		
		String cardno = ""+Math.abs(first7);
		
		long first3 = (ran.nextLong() % 9000L)+ 1000L;
		String pin = ""+Math.abs(first3);
		
		String fac = "";
		if(c1.isSelected()) {
			fac=fac+"Atm card";
		}else if(c2.isSelected()) {
			fac = fac+"Internet Banking";
		}
		else if(c3.isSelected()) {
			fac=fac+"Mobail Banking";
		}else if(c4.isSelected()) {
			fac=fac+"Email Alerts";
		}
		else if(c5.isSelected()) {
			fac=fac+"Check Book";
		}
		else if(c6.isSelected()) {
			fac=fac+"E-Statement";
		}
		
		try {
			if(e.getSource()==bsave) {
				if(atype.equals("")) {
					JOptionPane.showMessageDialog(null, "Fill all the field");
				}
				else {
					DbConnection c1 = new DbConnection();
					String query1="insert into signup3 (form_no,account_type,card_no,pin,facility) values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
					String query2 = "insert into login(form_no,card_no,pin) values('"+formno+"','"+cardno+"','"+pin+"')";
					
					c1.stat.executeUpdate(query1);
					c1.stat.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number :"+ cardno+ "/n"+"Pin :"+pin);
					new Deposite(pin);
					setVisible(false);
				}
			}else if(e.getSource()==bcancel) {
				System.exit(0);
			}
			
			
		} catch (Exception e2) {

		e2.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Signup3(" ");
	}

}
