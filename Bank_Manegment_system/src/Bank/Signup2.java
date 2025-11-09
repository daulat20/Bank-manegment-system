package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener{
	
	JComboBox rreligion ,rcategory,rincome,reducational,roccupation;
	String fromno;  
	JTextField txtfpan,txtfaadhar;
	JRadioButton syes ,sno,ryes,rno;
	JButton btnnext;
	
	 Signup2(String first) {
		 super("APPLICATION FORM");
		 this.fromno = first;
		ImageIcon i1 = new ImageIcon(getClass().getResource("/Bank/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		
		JLabel l1 = new JLabel("Page 2 ");
		l1.setFont(new Font("Raleway",Font.BOLD,20));
		l1.setBounds(300,30,600,40);
		add(l1);
		
		JLabel l2 = new JLabel("Additional Details ");
		l2.setFont(new Font("Raleway",Font.BOLD,20));
		l2.setBounds(300,60,600,40);
		add(l2);
		
		JLabel l3 = new JLabel("Religion :");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setBounds(100,170,100,30);
		add(l3);
		
		String religion[] = {"Hindu" ,"Muslim" , "Sikh" , "Christian","other"};
		rreligion = new JComboBox(religion);
		rreligion.setBackground(Color.CYAN);
		rreligion.setFont(new Font("Raleway",Font.BOLD,14));
		rreligion.setBounds(300 ,170 ,320,25);
		add(rreligion);
		
		
		JLabel l4 = new JLabel("Category :");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		l4.setBounds(100,210,100,25);
		add(l4);
		
		String category[] = {"General" ,"OBC" , "SC" , "ST","other"};
		rcategory = new JComboBox(category);
		rcategory.setBackground(Color.CYAN);
		rcategory.setFont(new Font("Raleway",Font.BOLD,14));
		rcategory.setBounds(300 ,210 ,320,25);
		add(rcategory);
		
		JLabel l5 = new JLabel("Income :");
		l5.setFont(new Font("Raleway",Font.BOLD,18));
		l5.setBounds(100,250,100,25);
		add(l5);
		
		String income[] = {"Null" ,"less then 1,50,000" , "less then 2,50,000" , "5,00,000","up to 10,00,000", "Above 10,00,00"};
		rincome = new JComboBox(income);
		rincome.setBackground(Color.CYAN);
		rincome.setFont(new Font("Raleway",Font.BOLD,14));
		rincome.setBounds(300 ,250 ,320,25);
		add(rincome);
		
		JLabel l6 = new JLabel("Educational :");
		l6.setFont(new Font("Raleway",Font.BOLD,18));
		l6.setBounds(100,290,150,30);
		add(l6);
		
		String educational[] = {"Non-Graduate" ,"Graduate" , "Post-Graduate" , "Doctrate","Other" };
		reducational = new JComboBox(educational);
		reducational.setBackground(Color.CYAN);
		reducational.setFont(new Font("Raleway",Font.BOLD,14));
		reducational.setBounds(300 ,290 ,320,25);
		add(reducational);
		
		JLabel l7 = new JLabel("Occupation :");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		l7.setBounds(100,330,150,30);
		add(l7);
		
		String occupation[] = {"Salaried" ,"Self-Employed" , "Business" , "Student","Retired" ,"Other" };
		roccupation = new JComboBox(occupation);
		roccupation.setBackground(Color.CYAN);
		roccupation.setFont(new Font("Raleway",Font.BOLD,14));
		roccupation.setBounds(300 ,330 ,320,25);
		add(roccupation);
		
		JLabel l8 = new JLabel("Pan Number :");
		l8.setFont(new Font("Raleway", Font.BOLD, 18));
		l8.setBounds(100, 370, 250, 30);
		add(l8);

		txtfpan = new JTextField();
		txtfpan.setFont(new Font("Raleway", Font.BOLD, 14));
		txtfpan.setBounds(300, 370, 250, 25);
		add(txtfpan);
		
		
		JLabel l9 = new JLabel("Aadhar Number :");
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		l9.setBounds(100, 410, 250, 30);
		add(l9);

		txtfaadhar = new JTextField();
		txtfaadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		txtfaadhar.setBounds(300, 410, 250, 25);
		add(txtfaadhar);
		
		JLabel l10 = new JLabel("Senior Citizen :");
		l10.setFont(new Font("Raleway", Font.BOLD, 18));
		l10.setBounds(100, 450, 250, 30);
		add(l10);
		
		syes = new JRadioButton("Yes");
		syes.setFont(new Font("Raleway", Font.BOLD, 14));
		syes.setBounds(300, 450, 60, 30);
		syes.setBackground(Color.CYAN);
		add(syes);

		sno = new JRadioButton("No");
		sno.setFont(new Font("Raleway", Font.BOLD, 14));
		sno.setBounds(370, 450, 160, 30);
		sno.setBackground(Color.CYAN);
		add(sno);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(syes);
		bg.add(sno);
		
		JLabel l11 = new JLabel("Existing Account :");
		l11.setFont(new Font("Raleway", Font.BOLD, 18));
		l11.setBounds(100, 490, 250, 30);
		add(l11);
		
		ryes = new JRadioButton("Yes");
		ryes.setFont(new Font("Raleway", Font.BOLD, 14));
		ryes.setBounds(300, 490, 60, 30);
		ryes.setBackground(Color.CYAN);
		add(ryes);

		rno = new JRadioButton("No");
		rno.setFont(new Font("Raleway", Font.BOLD, 14));
		rno.setBounds(370, 490, 160, 30);
		rno.setBackground(Color.CYAN);
		add(rno);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(ryes);
		bg1.add(rno);
		
		JLabel l12 = new JLabel("Form No :");
		l12.setFont(new Font("Raleway", Font.BOLD, 18));
		l12.setBounds(500, 10, 200, 30);
		add(l12);
		
		JLabel l13 = new JLabel(fromno );
		l13.setFont(new Font("Raleway", Font.BOLD, 18));
		l13.setBounds(600, 10, 200, 30);
		add(l13);
		
		
		btnnext = new JButton("Next");
		btnnext.setFont(new Font("Raleway", Font.BOLD, 18));
		btnnext.setBackground(Color.black);
		btnnext.setForeground(Color.white);
		btnnext.setBounds(300, 560, 100, 25);
		btnnext.addActionListener(this);
		add(btnnext);
		
		
		getContentPane().setBackground(Color.CYAN);
		setLayout(null);
		setSize(700, 655);
		setUndecorated(true);
		setLocation(270, 30);
		setVisible(true);
	}
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 String rel = (String) rreligion.getSelectedItem();
		 String cate = (String) rcategory.getSelectedItem();
		 String income=(String) rincome.getSelectedItem();
		 String edu = (String) reducational.getSelectedItem();
		 String occ = (String) roccupation.getSelectedItem();
		 String pan = txtfpan.getText();
		 String aadhar = txtfaadhar.getText();
		 
		 String scitizen = " ";
		 if (syes.isSelected())
			 scitizen = "Yes";
			else if (sno.isSelected())
				scitizen = "No"; 
		 
		 String exeacc = " ";
		 if (ryes.isSelected())
			 exeacc = "Yes";
			else if (rno.isSelected())
				exeacc = "No"; 
		 
		 
		 try {
			 
			 
			 if (rel.equals("Select")) {
		            JOptionPane.showMessageDialog(null, "Please select Religion");
		        } else if (cate.equals("Select")) {
		            JOptionPane.showMessageDialog(null, "Please select Category");
		        } else if (income.equals("Select")) {
		            JOptionPane.showMessageDialog(null, "Please select Income");
		        } else if (edu.equals("Select")) {
		            JOptionPane.showMessageDialog(null, "Please select Educational Qualification");
		        } else if (occ.equals("Select")) {
		            JOptionPane.showMessageDialog(null, "Please select Occupation");
		        } else if (pan.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter PAN Number");
		        } else if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
		            JOptionPane.showMessageDialog(null, "Invalid PAN format! Example: ABCDE1234F");
		        } else if (aadhar.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter Aadhar Number");
		        } else if (!aadhar.matches("\\d{12}")) {
		            JOptionPane.showMessageDialog(null, "Aadhar must be a 12-digit number");
		        } else if (scitizen.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please select Senior Citizen option");
		        } else if (exeacc.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please select Existing Account option");
		        } else {
		        	
		        	DbConnection c1 = new DbConnection();
		        	String query = "insert into signuptwo(form_no,religion,category,income,education,occupation,pan,aadharno,seniorcitizen,Existingacc)"
		        			+ " values('"+fromno+"','"+rel+"','"+cate+"','"+income+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+exeacc+"')";
		        	c1.stat.executeUpdate(query);
		        	new Signup3(fromno);
		        	setVisible(false);
		        }
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	 }
	 
	public static void main(String[] args) {
		new Signup2("");
	}


}
