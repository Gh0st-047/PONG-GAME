import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



// ya brain of the game hai...

public class GameEngine {


    //takes objects of other classes..

    GameDisplay dg;
    Ball b;
    Paddle p1;
    Paddle p2;

    private String player1Name;
    private String player2Name;

    private int player1_score = 0;
    private int player2_score =0;

    private boolean gameOver;


    public boolean isGameOver() {
        return gameOver;
    }

    public void startNewGame() {
        player1_score = 0;
        player2_score = 0;
        b.reset();
        b.start();
        gameOver = false;
    }


    public int getPlayer1Score( )
    {
        return this.player1_score ;
    }


    public int getPlayer2Score( )
    {
        return this.player2_score ;
    }

    public String getPlayer1Name() {
        return this.player1Name;
    }

    public String getPlayer2Name() {
        return this.player2Name;
    }

    // this is important because gamedisplay takes gameengine object and the also gameengine req gamedisplay object -  both depeding to each other..
    // that's why ii have initialzed  null to the gameengine in the main.java
    // this function is used to connect both classes..
    public void setDisplay(GameDisplay d) {
        this.dg = d;
    }

    public void resetGame(){

        player1_score = 0;
        player2_score = 0;
        b.reset();

    }




    public GameEngine(GameDisplay g , Ball b, Paddle p1 , Paddle p2, String player1Name, String player2Name){

        this.dg = g;
        this.b = b;
        this.p1 = p1;
        this.p2 = p2;
        this.player1Name = player1Name;
        this.player2Name = player2Name;


    // this timer function is really important because movement depends
        Timer timer = new Timer(16, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                if (!gameOver){

                    b.ball_Movement(p1, p2);

                    if (b.getX() < 0){
                        player2_score +=1;
                        b.reset();

                    } else if (b.getX() > 600) {
                        player1_score +=1;
                        b.reset();


                    }

                    if ( player1_score >= 5 || player2_score >=  5) {
                        b.stop();
                        gameOver = true;

                    }

                }
                dg.repaint();

            }
        });


        timer.start();

    }
}


