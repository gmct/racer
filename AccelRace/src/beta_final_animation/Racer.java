package beta_final_animation;

/*
 * TODO
 * Separate into server and client class ASAP.
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

/*
 * Long Term
 * Implement UDP connection unless UDP proves to not be a good implementation.
 * Make startLine pos selection live between all players.
 * Implement chat.
 * Add cool explosion animation. If player's are going to collide with wall have animation move them to that point then show explosion.
 * Follow last feature by a "pit crew" towing the car back to its last position over the course of three turns.
 * First two turns have pit crew doing repair animation while other players move and third turn have pit crew towing car back to last location while other players move.
 * reddit silveresque badge on screen if player gets hit immediately after getting towed back to last location.
 * Make custom map file input allowing players to specify wall color, track color and any special rules.
 */

/*
 * Subjective
 * Choose resolution for maps. 
 * Leaning towards a 16:9 aspect ratio. Maybe 1440x810 to accommodate lower res screens while still maintaining a good aspect ratio on higher res.
 * Possibly less horizontal resolution and throw in a table of previous moves + chat.
 * Change rules of game possibly to make it more conducive to this digital format.
 * Decide whether or not to show trace of past locations.
 * Change name.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Racer extends BasicGame {
	// track can not be defined here due to throwing a SlickException.
	Image track;
	Color wall = new Color(70, 70, 70);
	Color gridLine = new Color(128, 128, 128);
	int startPositions, firstStart;
	public Racer(String gamename) {
		super(gamename);	
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {
		track = new Image("res/Racetrack1.jpg");
		int wallBlocksEncountered = 0;
		int x = 10;
		boolean inWall = false;
		
		/*
		 * Initializes the values of startPositions and firstStart assuming that the start line is at (x, 490) and is horizontal.
		 * Should eventually be able to handle startlines in any orientation (preferably just horizontal and vertical for sanity's sake)
		 * as long as the color corresponds to a predetermined start line color.
		 */
		
		// TODO Clean this up, remove any redundancies. Move it server side.
		while (wallBlocksEncountered < 2) {
			if (wall.equals(track.getColor(x, 490)) && !inWall) {
				wallBlocksEncountered++;
				inWall = true;
			} else if (!inWall && firstStart <= 0) {
				firstStart = x;
				startPositions++;
			} else {
				startPositions++;
			}
			if (track.getColor(x, 490).equals(gridLine)) {
				inWall = false;
			}
			x += 10;
		}
	}
	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {}
	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawImage(track, 0, 0);
		g.setColor(Color.red);
		g.drawOval(40, 490, 5, 5);
	}
	
	
	
	public static void main (String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Racer("Racer"));
			appgc.setDisplayMode(700, 500, false);
			appgc.start();
			appgc.setVSync(true);
		}
		catch (SlickException ex) {
			Logger.getLogger(Racer.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	
}