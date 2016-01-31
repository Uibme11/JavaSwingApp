import java.awt.Color;

import javax.swing.JFrame;

public class FrameDriver {
	
	
	public static void main(String[] args)
	{
		
		MainFrame frame = new MainFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

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
}
