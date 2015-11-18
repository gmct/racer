/* ToDo
 * Display the grid.
 * Create track on grid.
 * Create start and finish lines.
 * Create car elements.
 * Accept input to move cars.
 * Make input only allowed to increase by 1.
 * Ensure that location doesn't equal or pass the wall. 
 * Ensure line doesn't intersect the wall.
 */

package racer_local;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Racer extends JFrame {
    
    public Racer() {

        initUI();
    }

    private void initUI() {

        add(new RaceTrack());

        setSize(250, 200);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Racer ex = new Racer
                		();
                ex.setVisible(true);
            }
        });
    }
}