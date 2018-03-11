/*
 * Author: Kathryn Reese
 * Partners: Hannah Hollenback, Kate Hohenstein
 * Date: 03/10/18
 * Purpose: To create a panel that will call an instance of the Game class
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	public MainPanel() {
		setBackground(new Color(40, 145, 56));
		setPreferredSize(new Dimension(600, 600));
		
	}
	public void paintComponent(Graphics image) {
		super.paintComponent(image);
	}

}
