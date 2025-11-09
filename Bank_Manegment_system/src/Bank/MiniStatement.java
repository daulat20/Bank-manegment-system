package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

	String pin;
	JButton button;

	MiniStatement(String pin) {
		this.pin = pin;

		getContentPane().setBackground(Color.CYAN);
		setSize(400, 500);
		setUndecorated(true);
		setLocation(20, 20);
		setLayout(null);

		JLabel label1 = new JLabel();
		label1.setBounds(20, 140, 400, 250);
		add(label1);

		JLabel label2 = new JLabel("MY BANK");
		label2.setFont(new Font("System", Font.BOLD, 25));
		label2.setBounds(150, 20, 200, 20);
		add(label2);

		JLabel label3 = new JLabel();
		label3.setFont(new Font("System", Font.BOLD, 15));
		label3.setBounds(20, 80, 300, 20);
		add(label3);

		JLabel label4 = new JLabel();
		label4.setFont(new Font("System", Font.BOLD, 15));
		label4.setBounds(20, 400, 300, 20);
		add(label4);

		try {
			DbConnection c = new DbConnection();
			ResultSet rs = c.stat.executeQuery("select * from login where pin = '" + pin + "'");
			while (rs.next()) {
				label3.setText("card Number :" + rs.getString("card_no").substring(0, 4) + "XXXXXXXX"
						+ rs.getString("card_no").substring(12));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		try {

			int balance = 0;
			DbConnection c = new DbConnection();
			ResultSet r = c.stat.executeQuery("select * from bank where pin = '" + pin + "'");
			while (r.next()) {
				label1.setText(label1.getText() + "<html> " + r.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ r.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + r.getString("amount")
						+ "<br><br><html>");

				if (r.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(r.getString("amount"));
				} else {
					balance -= Integer.parseInt(r.getString("amount"));
				}
			}

			label4.setText("Your Total Balance is Rs :" + balance);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 button = new JButton("Exit");
	        button.setBounds(20,450,100,25);
	        button.setFont(new Font("Raleway", Font.BOLD, 18));
	        button.setBackground(Color.black);
	        button.setForeground(Color.white);
	        button.addActionListener(this);

	        add(button);


		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	}

	public static void main(String[] args) {
		new MiniStatement("");
	}

}
