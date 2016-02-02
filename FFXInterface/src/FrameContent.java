import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FrameContent extends JFrame{
	
	final static boolean shouldFill = true; //allows buttons/ components to auto resize themselves
	final static boolean shouldWeightX = true; //keeps components equal "weights" on window resizing

	public FrameContent() 
	{
		super("Force Field X");
		this.getContentPane().setBackground(Color.WHITE);


		JButton button;
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill)
		{
			//natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		button = new JButton("Button 1");// buttons 1,2, and 3 could become tabs easily 
		if (shouldWeightX)  //keep resizing weight equal

		{
			c.weightx = 0.5;
		}
		c.gridx = 0;
		c.gridy = 0;
		this.add(button, c);

		button = new JButton("Button 2");
		c.gridx = 1;//sets location middle
		c.gridy = 0;
		this.add(button, c);

		button = new JButton("Button 3");
		c.gridx = 2;//sets location far right
		c.gridy = 0;
		this.add(button, c);

		//	        FinalPanel panel = new FinalPanel();
		// TO TEST: Change panel type to the class you created
		FinalPanel panel = new FinalPanel();
		c.ipady = 60; //make this component tall
		c.weightx = 0.5; //seems to have no affect
		c.gridwidth = 3; //determines how many columns wide
		c.gridheight = 3;
		c.gridx = 0; //determines row
		c.gridy = 1; //determines column'
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.FIRST_LINE_START; //anchor at the end of the last line
		this.add(panel, c);

		c.fill = GridBagConstraints.HORIZONTAL;

		button = new JButton("Next ->");
		c.ipady = 0;       //reset to default
		c.weighty = 1.0;   //request any extra vertical space
		c.anchor = GridBagConstraints.LAST_LINE_END; //anchor at the end of the last line
		//c.insets = new Insets(10,0,0,0);  //Specifies the minimum amount of space between the component and the edges of its display area
		c.gridx = 2;       //aligned with button 3
		c.gridwidth = 1;   //1 column wide
		c.gridy = 2;       //third row
		this.add(button, c);
		this.setVisible(true);

		//Add action listener to Next Button
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				//Execute when button is pressed
				System.out.println("You clicked 'Next' the button"); //good for testing until we have other GUI's made to link buttons to
			}
		});

		button = new JButton("<- Previous");
		c.ipady = 0;       //reset to default
		c.weighty = 1.0;   //request any extra vertical space
		c.anchor = GridBagConstraints.LAST_LINE_START; //anchor at the end of the last line
		//c.insets = new Insets(10,0,0,0);  //Specifies the minimum amount of space between the component and the edges of its display area
		c.gridx = 0;       //aligned with button 1
		c.gridwidth = 1;   //1 column wide
		c.gridy = 2;       //third row
		this.add(button, c);

		//Add action listener to previous Button
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				//Execute when button is pressed
				System.out.println("You clicked 'Previous' the button"); //good for testing until we have other GUI's made to link buttons to
			}
		});
	}

}

