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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Sign_up extends JFrame implements ActionListener {
	
	Random r = new Random();
	long first4 = (r.nextLong() % 9000l + 1000l);
	String first = String.valueOf(Math.abs(first4));

	JLabel label1, label2, label3;
	JTextField textname, txtfname, txtemail, txtcity, txtpin, txtstate, txtadd;

	JDateChooser date;

	JRadioButton bmale, bfemale, bmarried, bunmarried;
	JButton next;

	Sign_up() {
		super("APPLICATION FORM");
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25, 10, 100, 100);
		add(image);

		label1 = new JLabel("APPLICATION FORM NO: " + first);
		label1.setBounds(160, 15, 600, 40);
		label1.setFont(new Font("Raleway", Font.BOLD, 33));
		add(label1);

		label2 = new JLabel("Page 1");
		label2.setBounds(330, 60, 600, 30);
		label2.setFont(new Font("Raleway", Font.BOLD, 20));
		add(label2);

		label3 = new JLabel("Personal Details");
		label3.setBounds(290, 80, 600, 30);
		label3.setFont(new Font("Raleway", Font.BOLD, 20));
		add(label3);

		JLabel l4 = new JLabel("Name :");
		l4.setFont(new Font("Raleway", Font.BOLD, 18));
		l4.setBounds(100, 150, 100, 30);
		add(l4);

		textname = new JTextField();
		textname.setFont(new Font("Raleway", Font.BOLD, 14));
		textname.setBounds(250, 150, 250, 25);
		add(textname);

		JLabel l5 = new JLabel("Father Name :");
		l5.setFont(new Font("Raleway", Font.BOLD, 18));
		l5.setBounds(100, 190, 250, 30);
		add(l5);

		txtfname = new JTextField();
		txtfname.setFont(new Font("Raleway", Font.BOLD, 14));
		txtfname.setBounds(250, 190, 250, 25);
		add(txtfname);

		JLabel l6 = new JLabel("Date Of Birth :");
		l6.setFont(new Font("Raleway", Font.BOLD, 18));
		l6.setBounds(100, 230, 250, 30);
		add(l6);

		date = new JDateChooser();
		date.setForeground(Color.cyan);
		date.setBounds(250, 230, 250, 25);
		add(date);

		JLabel l7 = new JLabel("Gender :");
		l7.setFont(new Font("Raleway", Font.BOLD, 18));
		l7.setBounds(100, 270, 250, 30);
		add(l7);

		bmale = new JRadioButton("Male");
		bmale.setFont(new Font("Raleway", Font.BOLD, 14));
		bmale.setBounds(250, 270, 60, 30);
		bmale.setBackground(Color.cyan);
		add(bmale);

		bfemale = new JRadioButton("Female");
		bfemale.setFont(new Font("Raleway", Font.BOLD, 14));
		bfemale.setBounds(370, 270, 160, 30);
		bfemale.setBackground(Color.cyan);
		add(bfemale);

		ButtonGroup bg = new ButtonGroup();
		bg.add(bfemale);
		bg.add(bmale);

		JLabel l8 = new JLabel("Email :");
		l8.setFont(new Font("Raleway", Font.BOLD, 18));
		l8.setBounds(100, 310, 250, 30);
		add(l8);

		txtemail = new JTextField();
		txtemail.setFont(new Font("Raleway", Font.BOLD, 14));
		txtemail.setBounds(250, 310, 250, 25);
		add(txtemail);

		JLabel l9 = new JLabel("Married Status :");
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		l9.setBounds(100, 350, 250, 30);
		add(l9);

		bmarried = new JRadioButton("Married");
		bmarried.setFont(new Font("Raleway", Font.BOLD, 14));
		bmarried.setBounds(250, 350, 100, 30);
		bmarried.setBackground(Color.cyan);
		add(bmarried);

		bunmarried = new JRadioButton("Unmarried");
		bunmarried.setFont(new Font("Raleway", Font.BOLD, 14));
		bunmarried.setBounds(370, 350, 160, 30);
		bunmarried.setBackground(Color.cyan);
		add(bunmarried);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(bmarried);
		bg1.add(bunmarried);

		JLabel l10 = new JLabel("Address :");
		l10.setFont(new Font("Raleway", Font.BOLD, 18));
		l10.setBounds(100, 390, 250, 30);
		add(l10);

		txtadd = new JTextField();
		txtadd.setFont(new Font("Raleway", Font.BOLD, 14));
		txtadd.setBounds(250, 390, 250, 25);
		add(txtadd);

		JLabel l11 = new JLabel("City :");
		l11.setFont(new Font("Raleway", Font.BOLD, 18));
		l11.setBounds(100, 430, 250, 30);
		add(l11);

		txtcity = new JTextField();
		txtcity.setFont(new Font("Raleway", Font.BOLD, 14));
		txtcity.setBounds(250, 430, 250, 25);
		add(txtcity);

		JLabel l12 = new JLabel("Pin Code :");
		l12.setFont(new Font("Raleway", Font.BOLD, 18));
		l12.setBounds(100, 470, 250, 30);
		add(l12);

		txtpin = new JTextField();
		txtpin.setFont(new Font("Raleway", Font.BOLD, 14));
		txtpin.setBounds(250, 470, 250, 25);
		add(txtpin);

		JLabel l13 = new JLabel("State :");
		l13.setFont(new Font("Raleway", Font.BOLD, 18));
		l13.setBounds(100, 510, 250, 30);
		add(l13);

		txtstate = new JTextField();
		txtstate.setFont(new Font("Raleway", Font.BOLD, 14));
		txtstate.setBounds(250, 510, 250, 25);
		add(txtstate);

		next = new JButton("Next");
		next.setFont(new Font("Raleway", Font.BOLD, 18));
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setBounds(300, 550, 100, 25);
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(Color.CYAN);

		setLayout(null);
		setUndecorated(true);
		setSize(700, 655);
		setLocation(270, 30);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formno = first;
		String name = textname.getText().trim();
		String fname = txtfname.getText().trim();
		String email = txtemail.getText().trim();
		String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
		String address = txtadd.getText().trim();
		String city = txtcity.getText().trim();
		String pin = txtpin.getText().trim();
		String State = txtstate.getText().trim();

		String gender = null;
		if (bmale.isSelected())
			gender = "Male";
		else if (bfemale.isSelected())
			gender = "Female";

		String married = null;
		if (bmarried.isSelected())
			married = "Married";
		else if (bunmarried.isSelected())
			married = "Unmarried";

		// validation
		try {
			if (name.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Name is Required.");
			} else if (fname.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Father name is Required");
			} else if (date.getDate() == null) {
				JOptionPane.showMessageDialog(null, "Date of Birth is required");
			} else if (gender == null) {
				JOptionPane.showMessageDialog(null, "Please Select Gender ");
			} else if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
				JOptionPane.showMessageDialog(null, "Enter valid Email Id");
			} else if (married == null) {
				JOptionPane.showMessageDialog(null, "Please Select Married Status ");
			} else if (address.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Address can not be Empty");
			} else if (city.isEmpty()) {
				JOptionPane.showMessageDialog(null, "City is Required");
			} else if (pin.isEmpty() || !pin.matches("\\d{6}")) {
				JOptionPane.showMessageDialog(null, "Enter valid 6 digit Pin Code");
			} else if (State.isEmpty()) {
				JOptionPane.showMessageDialog(null, "State is Require");

			} else {
				DbConnection db1 = new DbConnection();
				String query = "insert into signUp (form_no ,name, fname, DBO, gender, email, marriedStatus, address, city, pincode, state) "
						+ " values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','"
						+ email + "','" + married + "','" + address + "'," + "'" + city + "','" + pin + "','" + State
						+ "')";
				db1.stat.executeUpdate(query);
				new Signup2(formno);
				setVisible(false);
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Sign_up();
	}

}
