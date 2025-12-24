import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class InputHandler implements KeyListener {


    private final Paddle pdl1;
    private final Paddle pdl2;

    public InputHandler(Paddle pd, Paddle pd2){

        this.pdl1 = pd;
        this.pdl2 = pd2;
    }


    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W){
            pdl1.moveUP();

        }else if (key == KeyEvent.VK_S){
            pdl1.moveDown();

        } else if (key == KeyEvent.VK_DOWN){
            pdl2.moveUP();

        }else if (key == KeyEvent.VK_RIGHT){
            pdl2.moveDown();
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
  
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

}
