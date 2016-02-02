
//public class Backup {
//	import java.awt.event.ActionEvent;
//	import java.awt.event.ActionListener;
//	import java.awt.*;
//	import javax.swing.JButton;
//	import javax.swing.JFrame;
//	import javax.swing.JTabbedPane;
//
//
//	public class FrameContent extends JFrame{
//		
////		private final static boolean shouldFill = true; //allows buttons/ components to auto resize themselves
////		private final static boolean shouldWeightX = true; //keeps components equal "weights" on window resizing
//		private JTabbedPane tabbedPane = new JTabbedPane();
//		private WelcomePanel panel1 = new WelcomePanel();
//		private CommandPanel panel2 = new CommandPanel();
//		private OptionsPanel panel3 = new OptionsPanel();
////		private SummaryPanel panel4 = new SummaryPanel();
//		private FinalPanel panel5 = new FinalPanel();
//
//		public FrameContent() 
//		{
//			super("Force Field X");
//			this.getContentPane().setBackground(Color.WHITE);
//			
//			//set array of panels
//			tabbedPane.addTab("Usr Info", panel1);
//			tabbedPane.addTab("Command", panel2);
//			tabbedPane.addTab("Options", panel3);
////			tabbedPane.addTab("Summary", panel4);
//
//			add(tabbedPane)
//			
//			paneArray[0].setSelectedComponent(paneArray[0]);
//
//			JButton button;
//			this.setLayout(new GridBagLayout());
//			GridBagConstraints c = new GridBagConstraints();
//			if (shouldFill)
//			{
//				//natural height, maximum width
//				c.fill = GridBagConstraints.HORIZONTAL;
//			}
//
//			button = new JButton("Button 1");// buttons 1,2, and 3 could become tabs easily 
//			if (shouldWeightX)  //keep resizing weight equal
//
//			{
//				c.weightx = 0.5;
//			}
//			c.gridx = 0;
//			c.gridy = 0;
//			this.add(button, c);
//
//			button = new JButton("Button 2");
//			c.gridx = 1;//sets location middle
//			c.gridy = 0;
//			this.add(button, c);
//
//			button = new JButton("Button 3");
//			c.gridx = 2;//sets location far right
//			c.gridy = 0;
//			this.add(button, c);
//
//			//	        FinalPanel panel = new FinalPanel();
//			// TO TEST: Change panel type to the class you created
//			FinalPanel panel = new FinalPanel();
//			c.ipady = 60; //make this component tall
//			c.weightx = 0.5; //seems to have no affect
//			c.gridwidth = 3; //determines how many columns wide
//			c.gridheight = 3;
//			c.gridx = 0; //determines row
//			c.gridy = 1; //determines column'
//			c.fill = GridBagConstraints.BOTH;
//			c.anchor = GridBagConstraints.FIRST_LINE_START; //anchor at the end of the last line
//			this.add(panel, c);
//
//			c.fill = GridBagConstraints.HORIZONTAL;
//
//			button = new JButton("Next ->");
//			c.ipady = 0;       //reset to default
//			c.weighty = 1.0;   //request any extra vertical space
//			c.anchor = GridBagConstraints.LAST_LINE_END; //anchor at the end of the last line
//			//c.insets = new Insets(10,0,0,0);  //Specifies the minimum amount of space between the component and the edges of its display area
//			c.gridx = 2;       //aligned with button 3
//			c.gridwidth = 1;   //1 column wide
//			c.gridy = 2;       //third row
//			this.add(button, c);
//			this.setVisible(true);
//
//			//Add action listener to Next Button
//			button.addActionListener(new ActionListener() {
//
//				public void actionPerformed(ActionEvent e)
//				{
//					//Execute when button is pressed
//					System.out.println("You clicked 'Next' the button"); //good for testing until we have other GUI's made to link buttons to
//				}
//			});
//
//			button = new JButton("<- Previous");
//			c.ipady = 0;       //reset to default
//			c.weighty = 1.0;   //request any extra vertical space
//			c.anchor = GridBagConstraints.LAST_LINE_START; //anchor at the end of the last line
//			//c.insets = new Insets(10,0,0,0);  //Specifies the minimum amount of space between the component and the edges of its display area
//			c.gridx = 0;       //aligned with button 1
//			c.gridwidth = 1;   //1 column wide
//			c.gridy = 2;       //third row
//			this.add(button, c);
//
//			//Add action listener to previous Button
//			button.addActionListener(new ActionListener() {
//
//				public void actionPerformed(ActionEvent e)
//				{
//					//Execute when button is pressed
//					System.out.println("You clicked 'Previous' the button"); //good for testing until we have other GUI's made to link buttons to
//				}
//			});
//		}
//
//	}
//
//
//}

//    /**
//     * Create the GUI and show it.  For thread safety,
//     * this method should be invoked from the
//     * event-dispatching thread.
//     */
//    private static void createAndShowGUI()
//    {
//        //Make sure we have nice window decorations
//        JFrame.setDefaultLookAndFeelDecorated(true); //look and feel of GUI can be changed to something later
//
//        //Create and set up the window.
//        JFrame frame = new JFrame("Submit an FFX job");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Set up the content pane
//        addComponentsToPane(frame.getContentPane());
//
//        //Display the window
//        frame.pack();
//        frame.setSize(500, 500);
//        frame.setBackground(Color.WHITE);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args)
//    {
//        /**Schedule a job for the event-dispatching thread:
//        creating and showing this application's GUI.
//    	this will be useful when we want to switch the internal pane
//    	 to a JPanel**/
//        javax.swing.SwingUtilities.invokeLater(new Runnable()
//        {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
//    }
