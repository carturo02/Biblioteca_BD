package application;

import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.WindowConstants;
import visual.Login;

public class Run {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Login frame = new Login();
					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
