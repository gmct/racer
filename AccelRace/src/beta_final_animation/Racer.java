package beta_final_animation;
/*
 * TODO
 * Separate into server and client class ASAP. -- This is difficult to do with classes. Delayed until networking is figured out.
 * Move start line detection to server and have server present starting options.
 * Make x and y sync with server class on each update.
 * Import other player's positions.
 * Implement textbox input.
 * For textbox, autodetect an ideal position, ideally wall color. 
 * (not just any color but gridline/white to prevent obstructing artwork)
 * Change map to have colored start and finish line.
 * Make startline detection not depend on orientation or y axis location.
 * Remove unnecessary code from the Hello World basis used in figuring out Slick2D basics.
 * Find a better place to put this list.
 * THIS
 */

import java.util.Scanner;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;

public class Racer extends BasicGame {
	// track can not be defined here due to throwing a SlickException.
	Image track;
	Color wall = new Color(70, 70, 70);
	Color gridLine = new Color(128, 128, 128);
	int startPositions, firstStart;
	int x, y, lastX, lastY, xVelocity, yVelocity;
	TextField xInput, yInput;
	String message;
	
	public Racer(String gamename) {
		super(gamename);	
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		track = new Image("res/Racetrack1.jpg");
		int wallBlocksEncountered = 0;
		int ticker = 0;
		boolean inWall = false;
		
		/*
		 * Initializes the values of startPositions and firstStart assuming that the start line is at (x, 490) and is horizontal.
		 * Should eventually be able to handle startlines in any orientation (preferably just horizontal and vertical for sanity's sake)
		 * as long as the color corresponds to a predetermined start line color.
		 */
		
		// TODO Clean this up, remove any redundancies. Move it server side.
		while (wallBlocksEncountered < 2) {
			if (wall.equals(track.getColor(ticker, 490)) && !inWall) {
				wallBlocksEncountered++;
				inWall = true;
			} else if (!inWall && firstStart <= 0) {
				firstStart = ticker;
				startPositions++;
			} else {
				startPositions++;
			}
			if (track.getColor(ticker, 490).equals(gridLine)) {
				inWall = false;
			}
			ticker += 10;
		}
		
//		// This is bad code and you should feel bad.
//		Scanner scan = new Scanner(System.in);
//		// TODO Trace code and find where this off by 2 error is coming from.
//		System.out.print("Enter starting position 1-" + (startPositions - 2) + ": ");
//		int startInput = scan.nextInt();
//		x = firstStart - 20 + startInput * 10;
//		y = 490;
//		scan.close();
		x = 100;
		y = 490;
		
		xInput = new TextField(gc, gc.getDefaultFont(), 220,470,40,20, new ComponentListener()
        {
	         public void componentActivated(AbstractComponent source) {
	            message = "Entered1: "+xInput.getText();
	            xInput.setFocus(true);
	         }

	    });
		yInput = new TextField(gc, gc.getDefaultFont(), 280,470,40,20, new ComponentListener()
        {
	         public void componentActivated(AbstractComponent source) {
	            message = "Entered1: "+yInput.getText();
	            yInput.setFocus(true);
	         }

	    });
	}
	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		Input input = gc.getInput();
		
		// TODO Clean this code.
		// Null check doesn't work.
		if (input.isKeyPressed(Input.KEY_ENTER) && xInput.getText() != "" && yInput.getText() != "") {
			try {
				
				int xChange = Integer.parseInt(xInput.getText());
				int yChange = Integer.parseInt(yInput.getText());
				
				if (Math.abs(xChange - xVelocity) <= 1 && Math.abs(yChange-yVelocity) <= 1) {
					
					boolean crashed = false;
					int x1 = x, y1 = y;
					for (int c = 0; c < 10; c++) {
						if (wall.equals(track.getColor(x1, y1))){
							crashed = true;
						}
						x1 += xChange;
						y1 -= yChange;
					}
					
					if (!crashed) {
						x += xChange * 10;
						y -= yChange * 10;
						xVelocity = xChange;
						yVelocity = yChange;
					}  else {
						xVelocity = 0;
						yVelocity = 0;
						xInput.setText("Boom");
					}
					
				} else {
					xInput.setText("bad");
					yInput.setText("num");
				}
			} catch (NumberFormatException nf) {
				xInput.setText("only");
				yInput.setText("num");
			}
		}
	}
	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawImage(track, 0, 0);
		g.setColor(Color.red);
		g.fillOval(x-3 ,y - 3,6,6);
		xInput.render(gc, g);
		yInput.render(gc, g);
	}
	
	
	
	public static void main (String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Racer("Racer"));
			appgc.setDisplayMode(700, 500, false);
			appgc.start();
			appgc.setTargetFrameRate(60);
			appgc.setVSync(true);
		}
		catch (SlickException ex) {
			Logger.getLogger(Racer.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	
}