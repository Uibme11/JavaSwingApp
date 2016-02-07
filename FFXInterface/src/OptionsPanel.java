import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
public class OptionsPanel extends JPanel{
	
	private Color c = new Color (235, 240, 255);
	private JLabel title;
	private JTextArea dropDownLabel;
	private JTextArea aminoAcidLabel;
	private JTextField aminoAcidField;
	private JTextArea chainIDLabel;
	private JTextField chainIDField;
	private JTextArea aminoChangeLabel;
	private JTextField aminoChangeField;
	private JTextArea blankCell; 
	private GridLayout layout;
	private String[] FFXStructures = { "[select a structure]", "  structure1", "  structure2", "  structure3", "  structure4", "  structure5" };
	private JComboBox structuresDropdown= new JComboBox(FFXStructures);

	
	public OptionsPanel()
	{
		super();
		setBackground(Color.WHITE);
		
		// setting panel layout, 10 rows and 1 column 
		layout = new GridLayout(10, 1, 0, 5);
		setLayout(layout);
		
		// row two, user information title
		dropDownLabel = new JTextArea();
		dropDownLabel.setText("\nChoose FFX Structure\n");
		dropDownLabel.setEditable(false);
		dropDownLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(dropDownLabel);
		
		// add drop down menu
		structuresDropdown.setSelectedIndex(0);
		structuresDropdown.setFont (new Font("Calibri", Font.PLAIN, 18));
		structuresDropdown.setBackground(c);
		add(structuresDropdown);
		
		// row two, user information title
		title = new JLabel("\n\n\nVariant Information",SwingConstants.CENTER);
		title.setFont(new Font("Calibri", Font.BOLD, 20));
		add(title);
		
		// row two, email address
		aminoAcidLabel = new JTextArea();
		aminoAcidLabel.setText("\n  Amino Acid Position");
		aminoAcidLabel.setEditable(false);
		aminoAcidLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoAcidLabel);
		
		
		// row two, email field
		aminoAcidField = new JTextField("  [number]");
		aminoAcidField.setBounds(20, 220, 40, 30);
		aminoAcidField.setEditable(true);
		aminoAcidField.setFont(new Font("Calibri", Font.PLAIN, 14));
		add(aminoAcidField);
		
		// row two, email address
		chainIDLabel = new JTextArea();
		chainIDLabel.setText(" \n  Chain ID");
		chainIDLabel.setEditable(false);
		chainIDLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(chainIDLabel);
		
		// row two, email field
		chainIDField = new JTextField("  [chain ID]");
		chainIDField.setBounds(20, 20, 40, 30);
		chainIDField.setEditable(true);
		chainIDField.setFont(new Font("Calibri", Font.PLAIN, 14));
		add(chainIDField);
		
		// row two, email address
		aminoChangeLabel = new JTextArea();
		aminoChangeLabel.setText("\n  Amino Acid Change");
		aminoChangeLabel.setEditable(false);
		aminoChangeLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(aminoChangeLabel);
		
		// row two, email field
		aminoChangeField = new JTextField("  [3 letter name]");
		aminoChangeField.setBounds(20, 20, 40, 30);
		aminoChangeField.setEditable(true);
		aminoChangeField.setFont(new Font("Calibri", Font.PLAIN, 14));
		add(aminoChangeField);
		
		// row two, user information title
				blankCell = new JTextArea();
				blankCell.setText("\n");
				blankCell.setEditable(false);
				add(blankCell);
			
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
	
	public int getStructureIndex()
	{
		return structuresDropdown.getSelectedIndex();
	}
	

}
