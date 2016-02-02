import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class FrameContent extends JFrame{
	
//	private final static boolean shouldFill = true; //allows buttons/ components to auto resize themselves
//	private final static boolean shouldWeightX = true; //keeps components equal "weights" on window resizing
	private JTabbedPane tabbedPane = new JTabbedPane();
	private WelcomePanel panel1 = new WelcomePanel();
	private CommandPanel panel2 = new CommandPanel();
	private OptionsPanel panel3 = new OptionsPanel();
//	private SummaryPanel panel4 = new SummaryPanel();
	private FinalPanel panel5 = new FinalPanel();
	private JButton next = new JButton("Next");
	private JButton back = new JButton("Back");
	private JPanel buttons = new JPanel();
	private int windowCounter = 0;
			
	public FrameContent() 
	{
		super("Force Field X");
		this.getContentPane().setBackground(Color.WHITE);
		
		this.setLayout(new BorderLayout());
		
		//set array of panels
		tabbedPane.addTab("User Info", panel1);
		tabbedPane.addTab("Command", panel2);
		tabbedPane.addTab("Options", panel3);
//		tabbedPane.addTab("Summary", panel4);

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
				switch(windowCounter)
				{
					case 0: 
						System.out.printf("job name: %s \nemail: %s\n", panel1.getJobName(), panel1.getEmail());
						tabbedPane.setSelectedComponent(panel2);
						windowCounter++;
						break;
						
					case 1:
						System.out.printf("command: %s \n", panel2.getCommand());
						tabbedPane.setSelectedComponent(panel3);
						windowCounter++;
						break;
						
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

}

