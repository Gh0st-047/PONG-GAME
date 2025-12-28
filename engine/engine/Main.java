import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){

        Paddle pd1 = new Paddle(0,200,10,35,10);

        Paddle pd2 = new Paddle(580,200,10,35,10);

        Ball b1 = new Ball(200, 200,20,20, 2);



        JFrame frame = new JFrame("Pong Game");
        GameDisplay g1 = new GameDisplay(pd1, pd2, b1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(g1);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        GameEngine ge1 = new GameEngine(g1, b1, pd1,pd2);


        g1.requestFocusInWindow();


    }

}
