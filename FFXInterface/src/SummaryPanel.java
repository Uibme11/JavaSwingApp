import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SummaryPanel extends JPanel{
	
	private JTextArea summaryText = new JTextArea();
	
	public SummaryPanel()
	{
		super();
		setBackground(Color.WHITE);
		
		add(summaryText);
		
	}

	public void setSummaryText(String info)
	{
		summaryText.setText(info);
	}
}
