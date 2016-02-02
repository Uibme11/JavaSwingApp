import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OptionsPanel extends JPanel{
	
	private JTextArea title;
	private JTextArea dropDownLabel;
	private JTextArea aminoAcidLabel;
	private JTextField aminoAcidField;
	private JTextArea chainIDLabel;
	private JTextField chainIDField;
	private JTextArea aminoChangeLabel;
	private JTextField aminoChangeField;
	private GridLayout layout;
	private String[] FFXStructures = { "[select a structure]", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
	private JComboBox structuresDropdown= new JComboBox(FFXStructures);

	
	public OptionsPanel()
	{
		super();
		setBackground(Color.WHITE);
		
		// setting panel layout, 3 column and 5 rows
		layout = new GridLayout(9, 1, 0, 5);
		setLayout(layout);
		
		// row two, user information title
		dropDownLabel = new JTextArea();
		dropDownLabel.setText("Choose FFX Structure\n");
		dropDownLabel.setEditable(false);
		dropDownLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(dropDownLabel);
		
		// add drop down menu
		structuresDropdown.setSelectedIndex(0);
		add(structuresDropdown);
		
		// row two, user information title
		title = new JTextArea();
		title.setText("Variant Information\n");
		title.setEditable(false);
		title.setFont(new Font("Calibri", Font.BOLD, 18));
		add(title);
		
		// row two, email address
		aminoAcidLabel = new JTextArea();
		aminoAcidLabel.setText("Amino Acid Position");
		aminoAcidLabel.setEditable(false);
		aminoAcidLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoAcidLabel);
		
		
		// row two, email field
		aminoAcidField = new JTextField("[number]");
		aminoAcidField.setBounds(30, 30, 40, 30);
		aminoAcidField.setEditable(true);
		aminoAcidField.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoAcidField);
		
		// row two, email address
		chainIDLabel = new JTextArea();
		chainIDLabel.setText("Chain ID");
		chainIDLabel.setEditable(false);
		chainIDLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(chainIDLabel);
		
		// row two, email field
		chainIDField = new JTextField("[chain ID]");
		chainIDField.setBounds(30, 30, 40, 30);
		chainIDField.setEditable(true);
		chainIDField.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(chainIDField);
		
		// row two, email address
		aminoChangeLabel = new JTextArea();
		aminoChangeLabel.setText("Amino Acid Change");
		aminoChangeLabel.setEditable(false);
		aminoChangeLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoChangeLabel);
		
		// row two, email field
		aminoChangeField = new JTextField("[3 letter name]");
		aminoChangeField.setBounds(30, 30, 40, 30);
		aminoChangeField.setEditable(true);
		aminoChangeField.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoChangeField);
			
	}
	
	public String getAminoAcidPosition()
	{
		return aminoAcidField.getText();
	}
	
	public String getChainID()
	{
		return chainIDField.getText();
	}
	
	public String getAminoAcidChange()
	{
		return aminoChangeField.getText();
	}
	
	public String getStructure()
	{
		return structuresDropdown.getName();
	}
	

}
