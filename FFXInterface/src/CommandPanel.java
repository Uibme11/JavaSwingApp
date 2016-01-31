import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class CommandPanel extends JPanel{

	private JTextArea title;
	private GridLayout layout;
	

	public CommandPanel()
	{
		super();
		JButton button;
		
		
		//Setting Panel Layout
		layout = new GridLayout(1,1,4,4);
		setLayout(layout);
		
		//Select Command Label
		title = new JTextArea();
		title.setText(" Select Command:");
		title.setEditable(false);
		add(title);	
		
		//Advanced Options Button
		button = new JButton("Advanced Options");
		add(button);
		

	}
	
}