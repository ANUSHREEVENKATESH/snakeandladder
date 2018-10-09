package snake;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SnakeandLadders {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnakeandLadders window = new SnakeandLadders();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SnakeandLadders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anu V\\Pictures\\Screenshots\\Screenshot (7).png"));
		frame.setBounds(800, 100, 600, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblSomething = new JLabel("something");
		lblSomething.setIcon(new ImageIcon("C:\\Users\\Anu V\\Pictures\\Screenshots\\Screenshot (6).png"));
		frame.getContentPane().add(lblSomething, BorderLayout.NORTH);
	}

}
