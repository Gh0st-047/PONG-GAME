import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameEngine {

    GameDisplay dg;
    Ball b;

    public GameEngine(GameDisplay g , Ball b){

        this.dg = g;
        this.b = b;


        Timer timer = new Timer(16, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                b.ball_move_right();  // your method updates x-coordinate
                dg.repaint(); // redraw panel
                dg.repaint();
            }
        });


        timer.start();



    }
}
