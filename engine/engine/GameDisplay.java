import javax.swing.*;
import java.awt.*;

public class GameDisplay extends JPanel {

    //takes paddles and ball and engine object to display on the screen

    private Paddle pd1;
    private Paddle pd2;
    private Ball ball;

    private GameEngine engine;




    public GameDisplay(Paddle p1 , Paddle p2, Ball b , GameEngine eng){

        pd1 = p1;
        pd2= p2;
        ball = b;
        engine = eng;
        setPreferredSize(new Dimension(600, 600));
        this.addKeyListener(new InputHandler(pd1, pd2, ball, engine));
        this.setFocusable(true);

    }

    // overrides paint component and make changes on the screen....

    @Override
    protected void paintComponent(Graphics g){

        // prints informaiton on the screen....

        int fawadscore = engine.getFawadScore();
        int hashirscore = engine.getHashir_score();

        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0, 700,700);
        g.setColor(Color.white);
        g.fillRect(pd1.getX(),pd1.getY(),pd1.getWidth(),pd1.getHeight());
        g.fillRect(pd2.getX(),pd2.getY(),pd2.getWidth(),pd2.getHeight());
        g.setColor(Color.red);
        g.fillOval(ball.getX(), ball.getY(), ball.get_width(), ball.get_height());
        g.setColor(Color.white);
        g.drawString("Fawad Score:" + fawadscore, 50, 50);
        g.drawString("Hashir Score:" + hashirscore , 450, 50);

        g.setFont(new Font("Arial", Font.BOLD, 30));

        if( engine.getFawadScore() >= 5){
            g.drawString("Fawad Wins",250,300);

        }else if (engine.getHashir_score() >=5){
            g.drawString("Hashir Wins", 250, 300);
        }
    }
}
