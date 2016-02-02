import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;



public class CommandPanel extends JPanel{
	
	private JTextArea title;
	private GridLayout layout;
	private String[] FFXCommand = { "[FFX Command]", "Minimize", "Rotomer Optimize"};
	private JComboBox commandSelect= new JComboBox(FFXCommand);
	

	public CommandPanel()
	{
		super();
		JButton button;
		setBackground(Color.WHITE);
		
		
		//Setting Panel Layout
		layout = new GridLayout(2,1,5,5);
		setLayout(layout);
		
		//Select Command Label
		title = new JTextArea();
		title.setText(" Select Command:");
		title.setFont(new Font("Calibri", Font.PLAIN, 18));
		title.setEditable(false);
		add(title);	
		
		//Add Drop Down
		commandSelect.setSelectedIndex(0);
		commandSelect.setFont(new Font("Calibri", Font.PLAIN, 16));
		add(commandSelect);
	
		
		//Advanced Options Button
		button = new JButton("Advanced Options");
		button.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(button);
		

	}
	
	public String getCommand()
	{
		return commandSelect.getName();
	}
	
}