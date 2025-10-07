import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @class MyDrawing class
 * @description Creates Cat and Mouse objects and draws and displays them.
 */
public class MyDrawing extends JPanel {
	// stores a Cat object
	private Cat cat;
	// stores a Mouse object
	private Mouse mouse;
	
	/**
	 * @description Constructor for MyDrawing class, creates a Cat and a
	 * Mouse object.
	 */
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		mouse = new Mouse();
	}
	
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	/**
	 * @description Draws Cat and Mouse objects.
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		mouse.draw(g, 100, 200);
	}
	
	/**
	 * @description Main method, creates a JFrame to display drawn
	 * Cat and Mouse objects.
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(400, 400);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
