package racer_local;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RaceTrack extends JPanel{
	private int WIDTH;
	private int HEIGHT;
	public RaceTrack(String title, int width, int height){
		JFrame raceTrack = new JFrame(title);
		WIDTH = width;
		HEIGHT = height;
		
		raceTrack.setSize(WIDTH, HEIGHT);
		raceTrack.setVisible(true);
		raceTrack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void drawGrid(int squareSize){
		Graphics g = this.getGraphics();
		Graphics2D g2d = (Graphics2D) g;
		
		for (int i = squareSize; i < HEIGHT; i += squareSize){
			g2d.drawLine(0, i, WIDTH, i);
		}
		for (int j = squareSize; j < WIDTH; j += squareSize){
			g2d.drawLine(j, 0, j, HEIGHT);
		}
		g2d.dispose();
	}
	
//	@Override
//	public void paintComponent(Graphics g){
//		super.paintComponent(g);
//		
//		g.setColor(Color.BLACK);
//		for (int i = 5; i < HEIGHT; i += 5){
//			g.drawLine(0, i, WIDTH, i);
//		}
//		for (int j = 5; j < WIDTH; j += 5){
//			g.drawLine(j, 0, j, HEIGHT);
//		}
//	}
}