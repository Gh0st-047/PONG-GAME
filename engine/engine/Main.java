import javax.swing.*;

public class Main {
    public static void main(String [] args){
        new GUI();
    }

    public void startPongGame(String player1Name, String player2Name){

        Paddle pd1 = new Paddle(0,200,20,50,20);

        Paddle pd2 = new Paddle(580,200,20,50,20);

        Ball b1 = new Ball(200, 200,20,20, 3);



        JFrame frame = new JFrame("Pong Game");
        // first we provide null to the gameengine object
        GameEngine ge1 = new GameEngine(null, b1, pd1, pd2, player1Name, player2Name);

        // created ge1 is provided to gamedisplay
        GameDisplay g1 = new GameDisplay(pd1, pd2, b1, ge1);

        // now ge1 takes the object of g1....
        ge1.setDisplay(g1);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(g1);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);


        g1.requestFocusInWindow();


    }

}
