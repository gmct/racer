package racer_active_animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

import racer_active_animation.*;

@SuppressWarnings("serial")
public class RaceTrack extends JPanel {
	int x, y, gridX, gridY;
	int radius = 5;
	int squareSize = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // TODO Look into moving the different objects being drawn into functions for the sake of clean syntax.
        // TODO Implement for loop to paint all points and connecting lines upon each repaint.
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draws the grid
        g2d.setPaint(Color.GRAY);
        for (int i = squareSize; i < this.getHeight(); i += squareSize) {
        	g2d.drawLine(0, i, this.getWidth(), i);
        }
        for (int j = squareSize; j < this.getWidth(); j += squareSize) {
        	g2d.drawLine(j, 0, j, this.getHeight());
        }
        
        // Draws the raceTrack
        g2d.setPaint(Color.BLACK);
        g2d.drawRect(150, 170, 400, 350);
        g2d.drawRect(20, 20, 660, 500);
        
        // Draws the car
        g2d.setPaint(Color.RED);
        g2d.fillOval(x, y, radius, radius);
        /* Possibly implement delay here instead or see if it would be doable to separate 
        this into separate methods.*/
    }
    
    public void setCoords(int x, int y){
    	/** 
    	 * Passes new x and y coordinates to the raceTrack object.
    	 * x and y coordinates should be within the bounds of the window size.
    	 * <p>
    	 * The circle drawn as a result of this will currently not persist on redraw.
    	 *  
    	 * @param	x desired 
    	 */
    	this.x = getGridX(x);
    	this.y = getGridY(y);
    }
    
    private int getGridX(int x) {
    	/**
    	 * Returns a value for x which is adjusted from the input value
    	 * so that it will go to the right place on the grid.
    	 * 
    	 * @return	the grid-corrected value of x
    	 */
    	x = x * squareSize + radius + (radius / 2 + 1);
    	return x;
    }
    
    private int getGridY(int y) {
    	/**
    	 * Returns a value for y which is adjusted from the input value
    	 * so that it will go to the right place on the grid
    	 * 
    	 * @return	the grid-corrected value of y
    	 */
    	y = this.getHeight() - y * squareSize;
    	return y;
    }
}