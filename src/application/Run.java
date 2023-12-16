package application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import visual.Login;

public class Run {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
