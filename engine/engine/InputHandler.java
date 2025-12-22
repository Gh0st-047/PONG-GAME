import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class InputHandler implements KeyListener {


    private Paddle pd;

    public InputHandler(Paddle pd){
        this.pd = pd;
    }


    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W){
            pd.moveUP();

        }else if (key == KeyEvent.VK_S){
            pd.moveDown();

        }


    }


    @Override
    public void keyReleased(KeyEvent e) {

  
    }



    @Override
    public void keyTyped(KeyEvent e) {
    }






}
