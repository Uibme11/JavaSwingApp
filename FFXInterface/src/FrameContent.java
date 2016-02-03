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
						panel4.setSummaryText("Name: " + panel1.getJobName() + "\nEmail: " + panel1.getEmail() + "\nCommand: " + panel2.getCommand() + "\nAmino Acid Position: " + panel3.getAminoAcidPosition() + "\nAmino Acid Chain: " 
													+ panel3.getChainID() + "\nAmino Acid Change: " + panel3.getAminoAcidChange());
														
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

