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
	private JButton next = new JButton("Next");
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
						System.out.printf("job name: %s \nemail: %s\n", panel1.getJobName(), panel1.getEmail());
						tabbedPane.setSelectedComponent(panel2);
						break;
						
					case 1:
						System.out.printf("command: %s \n", panel2.getCommand());
						tabbedPane.setSelectedComponent(panel3);
						break;
					
					case 2:
						System.out.printf("Amino Acid Position: %s \nAmino Acid Chain: \nAmino Acid Change: \nStructure: \n", panel3.getAminoAcidPosition(), panel3.getChainID(), panel3.getAminoAcidChange(), panel3.getStructure());
						panel4.setSummaryText("Summary goes here\n");
						tabbedPane.setSelectedComponent(panel4);
						next.setText("Submit");
						break;
						
					case 3:
						if(!finalWindow)
						{
							System.out.printf("Summary Page\n");
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
				//Execute when button is pressed
				System.out.println("You clicked 'Previous' the button"); //good for testing until we have other GUI's made to link buttons to
			}
		});
	}
	
	private void closeFrame()
	{
		super.dispose();
	}

}

