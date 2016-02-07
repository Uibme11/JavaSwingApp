import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class FrameContent extends JFrame{
	
	private JTabbedPane tabbedPane = new JTabbedPane();
	private WelcomePanel panel1 = new WelcomePanel();
	private CommandPanel panel2 = new CommandPanel();
	private OptionsPanel panel3 = new OptionsPanel();
	private SummaryPanel panel4 = new SummaryPanel();
	private FinalPanel panel5 = new FinalPanel();
	private JButton next = new JButton("Save and continue");
	private JButton back = new JButton("Back");
	private JPanel buttons = new JPanel();
	private int windowCounter = 0;
	private boolean finalWindow = false;
	private String structure;
	private String command;
			
	public FrameContent() 
	{
		super("Force Field X");
		this.getContentPane().setBackground(Color.WHITE);
		
		this.setLayout(new BorderLayout());
		
		//set array of panels
		tabbedPane.addTab("User Info", panel1);
		tabbedPane.addTab("Command", panel2);
		tabbedPane.addTab("Options", panel3);
		tabbedPane.addTab("Summary", panel4);

		tabbedPane.setBackground(Color.WHITE);
		add(tabbedPane, BorderLayout.CENTER);
		
		//add buttons to bottom of screen
		buttons.setLayout(new GridLayout(1, 2, 5, 5));
		buttons.add(back);
		buttons.add(next);
		buttons.setBackground(Color.WHITE);
		this.add(buttons, BorderLayout.SOUTH);
		
		
		
		//Add action listener to Next Button
		next.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				windowCounter = tabbedPane.getSelectedIndex();
				
				switch(windowCounter)
				{
					case 0: 
						tabbedPane.setSelectedComponent(panel2);
						break;
						
					case 1:
						tabbedPane.setSelectedComponent(panel3);
						break;
					
					case 2:
						switch(panel3.getStructureIndex())
						{
							case 0: structure = ""; break;
							case 1: structure = "structure1"; break;
							case 2: structure = "structure2"; break;
							case 3: structure = "structure3"; break;
							case 4: structure = "structure4"; break;
							case 5: structure = "structure5"; break;
							default: break;
						}
						
						switch(panel2.getCommandIndex())
						{
							case 0: command = ""; break;
							case 1: command = "Anneal"; break;
							case 2: command = "Energy"; break;
							case 3: command = "MD"; break;
							case 4: command = "Minimize"; break;
							default: break;
						}
						
						panel4.setSummaryText("\n\nName: " + panel1.getJobName() + "\n\nEmail: " + panel1.getEmail() + "\n\nCommand: " + command + "\n\nStructure: " + structure + "\n\nAmino Acid Position: " + panel3.getAminoAcidPosition() + "\n\nAmino Acid Chain: " 
													+ panel3.getChainID() + "\n\nAmino Acid Change: " + panel3.getAminoAcidChange());
														
						tabbedPane.setSelectedComponent(panel4);
						next.setText("Submit");
						break;
						
					case 3:
						if(!finalWindow)
						{
							add(panel5, BorderLayout.CENTER);
							back.setText("Submit another job");
							next.setText("Exit");
							finalWindow = true;
							break;
						}
						else
						{
							closeFrame();
						}
						
					default:
						break;
				}
			}
		});

		//Add action listener to previous Button
		back.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				windowCounter = tabbedPane.getSelectedIndex();
				
				switch(windowCounter)
				{
					case 0:
						break;
					
					case 1:
						tabbedPane.setSelectedComponent(panel1);
						break;
					
					case 2:
						tabbedPane.setSelectedComponent(panel2);
						break;
						
					case 3:
						if(!finalWindow)
						{
							tabbedPane.setSelectedComponent(panel3);
							next.setText("Save and continue");
						}
						else
						{
							tabbedPane.setSelectedComponent(panel1);
							panel5.setVisible(false);
							next.setText("Save and continue");
							back.setText("Back");
						}
						break;
						
					case 4:
						
						break;
						
					default:
						break;
					
				}
			}
		});
	}
	
	private void closeFrame()
	{
		super.dispose();
	}

}

