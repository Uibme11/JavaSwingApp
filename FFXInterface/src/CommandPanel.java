import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;



public class CommandPanel extends JPanel{
	
	private JTextArea title;
	private JTextArea blankspace1;
	private JTextArea blankspace2;
	private JTextArea commandoptiondescriptons;
	private JTextArea anneal;
	private JTextArea energy;
	private JTextArea md;
	private JTextArea minimize;
	private GridLayout layout;
	private String[] FFXCommand = { "[FFX Command]", "Anneal", "Engergy", "MD","Minimize" };
	private JComboBox commandSelect= new JComboBox(FFXCommand);
	

	public CommandPanel()
	{
		super();
		JButton button;
		setBackground(Color.WHITE);	
		
		//Setting Panel Layout
		layout = new GridLayout(20,0,3,3);
		setLayout(layout);
		
		//Blank Space Holder #1
		blankspace1 = new JTextArea();
		blankspace1.setText(" ");
		blankspace1.setFont(new Font("Calibri", Font.PLAIN, 18));
		blankspace1.setEditable(false);
		add(blankspace1);
				
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
		
		//Blank Space Holder #2
		blankspace2 = new JTextArea();
		blankspace2.setText(" ");
		blankspace2.setFont(new Font("Calibri", Font.PLAIN, 18));
		blankspace2.setEditable(false);
		add(blankspace2);
		
		//Command Option Descriptions Title
		commandoptiondescriptons = new JTextArea();
		commandoptiondescriptons.setText(" Command Descriptions-");
		commandoptiondescriptons.setFont(new Font("Calibri", Font.PLAIN, 18));
		commandoptiondescriptons.setEditable(false);
		add(commandoptiondescriptons);
		
		
		//Command and Purpose Anneal
		anneal = new JTextArea();
		anneal.setText(" Anneal - Run simulated annealing to optimize a structure.");
		anneal.setFont(new Font("Calibri", Font.PLAIN, 16));
		anneal.setEditable(false);
		add(anneal);
		
		//Command and Purpose Energy
		energy = new JTextArea();
		energy.setText(" Energy - Calculate the AMOEBA potential energy.");
		energy.setFont(new Font("Calibri", Font.PLAIN, 16));
		energy.setEditable(false);
		add(energy);
		
		//Command and Purpose MD
		md = new JTextArea();
		md.setText(" MD - Run NVE or NVT molecular dynamics.");
		md.setFont(new Font("Calibri", Font.PLAIN, 16));
		md.setEditable(false);
		add(md);
		
		//Command and Purpose MD
		minimize = new JTextArea();
		minimize.setText(" Minimize - Minimize a structure under the AMOEBA potential.");
		minimize.setFont(new Font("Calibri", Font.PLAIN, 16));
		minimize.setEditable(false);
		add(minimize);
		
		
		
		
		//Advanced Options Button
		//button = new JButton("Advanced Opti	ons");
		//button.setBounds(15,15,30,30);
		//button.setFont(new Font("Calibri", Font.PLAIN, 18));
		//add(button);
		

	}
	
	public String getCommand()
	{
		return commandSelect.getName();
	}
	
}