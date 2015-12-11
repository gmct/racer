package racer_active_animation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

import racer_active_animation.*;

@SuppressWarnings("serial")
public class RaceTrack extends JPanel {
	int x, y;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, this.getHeight() - y, 5, 5);
    }
    
    public void setCoords(int x, int y){
    	this.x = x;
    	this.y = y;
    }
}