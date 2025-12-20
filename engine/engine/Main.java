import javax.swing.*;

public class Main {
    public static void main(String [] args){

        Paddle pd1 = new Paddle(30,50,10,35,10);
        GameDisplay g1 = new GameDisplay(pd1);

        JFrame frame = new JFrame("Pong Game");
        frame.add(g1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);










    }

}
