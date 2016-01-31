import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WelcomePanel extends JPanel{
	
	private JTextArea title;
	private JTextArea email;
	private JTextField emailField;
	private GridLayout layout;
	
	public WelcomePanel()
	{
		super();
		
		// setting panel layout, 1 column and three rows
		layout = new GridLayout(3, 1, 4, 4);
		setLayout(layout);
		
		// row one, user information title
		title = new JTextArea();
		title.setText("User Information\n");
		title.setEditable(false);
		add(title);
		
		// row two, email address
		email = new JTextArea();
		email.setText("Email: ");
		email.setEditable(false);
		add(email);
		
		// row two, email field
		emailField = new JTextField();
		emailField.setBounds(30, 30, 40, 30);
		emailField.setEditable(true);
		add(emailField);
			
	}
	

}
