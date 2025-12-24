import javax.swing.*;
import java.awt.*;

public class GameDisplay extends JPanel {

    private Paddle pd1;
    private Paddle pd2;
    private Ball ball;


    public GameDisplay(Paddle p1 , Paddle p2, Ball b){

        pd1 = p1;
        pd2= p2;
        ball = b;
        setPreferredSize(new Dimension(600, 600));
        this.addKeyListener(new InputHandler(pd1, pd2, ball));
        this.setFocusable(true);

    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0, 600,600);
        g.setColor(Color.white);
        g.fillRect(pd1.getX(),pd1.getY(),pd1.getWidth(),pd1.getHeight());
        g.fillRect(pd2.getX(),pd2.getY(),pd2.getWidth(),pd2.getHeight());
        g.setColor(Color.red);
        g.fillOval(ball.getX(), ball.getY(), ball.get_width(), ball.get_height());
    }
}
