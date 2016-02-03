import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WelcomePanel extends JPanel{
	
	private JTextArea title;
	private JTextArea email;
	private JTextArea jobName;
	private JPanel blank1;
	private JPanel blank2;
	private JTextField emailField;
	private JTextField jobNameField;
	private GridLayout layout;
	
	public WelcomePanel()
	{
		super();
		setBackground(Color.WHITE);
		
		// setting panel layout, 1 column and three rows
		layout = new GridLayout(7 , 1, 2, 0);
		setLayout(layout);
		
		// row one, user information title
		title = new JTextArea();
		title.setText(" User Information"); 
		title.setEditable(false);
		title.setFont(new Font("Calibri", Font.BOLD, 20));
		add(title);
		
		// row two, email address
		email = new JTextArea();
		email.setText(" Email: ");
		email.setEditable(false);
		email.setFont(new Font("Calibri", Font.PLAIN, 20));
		add(email);
		
		// row three, email field
		emailField = new JTextField();
		emailField.setBounds(30, 30, 40, 30);
		emailField.setEditable(true);
		add(emailField);
		
		// row four, space fill
		blank1 = new JPanel();
		blank1.setBackground(Color.WHITE);
		add(blank1);
		
		//row five, space fill
		blank2 = new JPanel();
		blank2.setBackground(Color.WHITE);
		add(blank2);
		
		//row five, job name
		jobName = new JTextArea();
		jobName.setText(" Job Name:");
		jobName.setEditable(false);
		jobName.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(jobName);
		
		//row six, job name field
		jobNameField = new JTextField();
		jobNameField.setBounds(30, 30, 40, 30);
		jobNameField.setEditable(true);
		add(jobNameField);	
	}
	
	public String getEmail()
	{
		return emailField.getText();
	}
	
	public String getJobName()
	{
		return jobNameField.getText();
	}
	

}
