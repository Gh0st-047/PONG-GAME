import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameEngine {

    GameDisplay dg;
    Ball b;
    Paddle p1;
    Paddle p2;

    public GameEngine(GameDisplay g , Ball b, Paddle p1 , Paddle p2){

        this.dg = g;
        this.b = b;
        this.p1 = p1;
        this.p2 = p2;



        Timer timer = new Timer(16, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                b.ball_Movement(p1, p2);  // your method updates x-coordinate
                dg.repaint(); // redraw panel
                dg.repaint();
            }
        });


        timer.start();



    }
}
