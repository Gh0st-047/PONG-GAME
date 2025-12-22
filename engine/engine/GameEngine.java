import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameEngine {

    GameDisplay dg;

    public GameEngine(GameDisplay g){

        this.dg = g;

        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dg.repaint();
            }
        });
        timer.start();
    }
}
