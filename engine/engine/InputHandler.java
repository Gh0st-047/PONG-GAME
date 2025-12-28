import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;


// this is imporatant because it handles keyboard movement stuff of paddels
public class InputHandler implements KeyListener {


    private final Paddle pdl1;
    private final Paddle pdl2;
    private final Ball ball;
    private final GameEngine engine;

    public InputHandler(Paddle pd, Paddle pd2, Ball b , GameEngine game){

        this.pdl1 = pd;
        this.pdl2 = pd2;
        this.ball = b;
        this.engine = game;
    }


    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W){
            pdl1.moveUP();

        }else if (key == KeyEvent.VK_S){
            pdl1.moveDown();

        } else if (key == KeyEvent.VK_UP){
            pdl2.moveUP();

        }else if (key == KeyEvent.VK_DOWN){
            pdl2.moveDown();

        }else if (key == KeyEvent.VK_SPACE){
            ball.start();
        }

        if (key == KeyEvent.VK_SPACE && engine.isGameOver()) {
            engine.startNewGame(); // resets scores and ball
        }


    }

// we cant remove below both functions , we can write code but not necessary for ove pong game project.
    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

}




