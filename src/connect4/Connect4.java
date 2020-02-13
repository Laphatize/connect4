package connect4;
import java.awt.*;
import javax.swing.*;

public class Connect4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Connect 4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setPreferredSize(new Dimension(850,700));
		frame.add(new Connect4Panel());
		frame.setBackground(Color.orange);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	//	frame.setResizable(false);
	}
}
