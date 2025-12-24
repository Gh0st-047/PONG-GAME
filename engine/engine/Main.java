import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){

        Paddle pd1 = new Paddle(0,200,10,35,10);

        Paddle pd2 = new Paddle(500,200,10,35,10);

        Ball b1 = new Ball(200, 200,20,20, 2);

        GameDisplay g1 = new GameDisplay(pd1, pd2, b1);


        JFrame frame = new JFrame("Pong Game");
        frame.add(g1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        GameEngine ge1 = new GameEngine(g1, b1);


        g1.requestFocusInWindow();


    }

}
