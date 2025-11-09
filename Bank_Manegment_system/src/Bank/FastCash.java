package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener {

	    JButton b1,b2,b3,b4,b5,b6,b7;
	    String pin;
	    
	    FastCash(String pin){
	        this.pin =pin;

	        ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/atm2.png"));
			Image i2 = i1.getImage().getScaledInstance(1330, 650, Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel l3 = new JLabel(i3);
			l3.setBounds(0, 0, 1330, 650);
			add(l3);

	        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
	        label.setBounds(370, 130, 700, 35);
	        label.setForeground(Color.WHITE);
	        label.setFont(new Font("System",Font.BOLD,23));
	        l3.add(label);

	        b1 = new JButton("Rs. 100");
	        b1.setForeground(Color.WHITE);
	        b1.setBackground(new Color(65,125,128));
	        b1.setBounds(350, 215, 120, 25);
			b1.setFont(new Font("System",Font.BOLD,15));
	        b1.addActionListener(this);
	        l3.add(b1);

	        b2 = new JButton("Rs. 500");
	        b2.setForeground(Color.WHITE);
	        b2.setBackground(new Color(65,125,128));
	        b2.setFont(new Font("System",Font.BOLD,15));
			b2.setBounds(565, 215, 160, 25);
	        b2.addActionListener(this);
	        l3.add(b2);

	        b3 = new JButton("Rs. 1000");
	        b3.setForeground(Color.WHITE);
	        b3.setBackground(new Color(65,125,128));
	        b3.setFont(new Font("System",Font.BOLD,15));
			b3.setBounds(350, 250, 120, 25);
	        b3.addActionListener(this);
	        l3.add(b3);

	        b4 = new JButton("Rs. 2000");
	        b4.setForeground(Color.WHITE);
	        b4.setBackground(new Color(65,125,128));
	        b4.setFont(new Font("System",Font.BOLD,15));
			b4.setBounds(565 , 250, 160, 25);
	        b4.addActionListener(this);
	        l3.add(b4);

	        b5 = new JButton("Rs. 5000");
	        b5.setForeground(Color.WHITE);
	        b5.setBackground(new Color(65,125,128));
	        b5.setFont(new Font("System",Font.BOLD,15));
			b5.setBounds(350, 285, 123, 25);
	        b5.addActionListener(this);
	        l3.add(b5);

	        b6 = new JButton("Rs. 10000");
	        b6.setForeground(Color.WHITE);
	        b6.setBackground(new Color(65,125,128));
	        b6.setFont(new Font("System",Font.BOLD,15));
			b6.setBounds(565, 285, 160, 25);
	        b6.addActionListener(this);
	        l3.add(b6);

	        b7 = new JButton("BACK");
	        b7.setForeground(Color.WHITE);
	        b7.setBackground(new Color(65,125,128));
	        b7.setFont(new Font("System",Font.BOLD,15));
			b7.setBounds(350, 320, 120, 25);
			b7.addActionListener(this);
	        l3.add(b7);

	        setLayout(null);
			setSize(1330, 690);
			setUndecorated(true);
			setLocation(0, 0);
			setVisible(true);
			
	    }

		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==b7) {
	            setVisible(false);
	            new Main_Class(pin);
		 }else {
			 String amount = ((JButton)e.getSource()).getText().substring(4);
			 DbConnection c = new DbConnection();
			 Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String formattedDate = formatter.format(date);
				try {
					ResultSet r = c.stat.executeQuery("select * from bank where pin = '"+pin+"'");
					int balance =0;
	                while (r.next()){
	                    if (r.getString("type").equals("Deposit")){
	                        balance += Integer.parseInt(r.getString("amount"));
	                    }else {
	                        balance -= Integer.parseInt(r.getString("amount"));
	                    }
	                }
	                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
	                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
	                    return;
	                }
	                
	                c.stat.executeUpdate("insert into bank(pin, date, type, amount) values('"+pin+"','"+formattedDate+"','Withdraw','"+amount+"')");
					JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposite Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				 setVisible(false);
		            new Main_Class(pin);
		 }
		
	}

	public static void main(String[] args) {
		new FastCash("");
	}
	
}
