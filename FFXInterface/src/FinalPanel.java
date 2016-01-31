import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalPanel extends JPanel{
	
	private JTextArea title;
	private JTextArea thankyou;
	private JTextField emailField;
	private GridLayout layout;
	
	public FinalPanel()
	{
		super();
		
		// setting panel layout, 1 column and three rows
		layout = new GridLayout(2, 1);
		setLayout(layout);
		// row one, user information title
		title = new JTextArea();
		title.setText(" Job Submission is Complete!\n");
		title.setFont(new Font("Calibri", Font.BOLD, 20));
		title.setEditable(false);
		add(title);
		
		// row two, email address
		thankyou = new JTextArea();
		thankyou.setText(" Thank you for using Force Field X!");
		thankyou.setFont(new Font("Calibri", Font.PLAIN, 18));
		thankyou.setEditable(false);
		add(thankyou);
		
	}

}
