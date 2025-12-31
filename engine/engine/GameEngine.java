import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



// ya brain of the game hai...

public class GameEngine {


    //takes objects of other classes..

    GameDisplay dg;
    Ball b;
    Paddle p1;
    Paddle p2;

    private String player1Name;
    private String player2Name;

    private int fawad_score = 0;
    private int hashir_score =0;

    private boolean gameOver;


    public boolean isGameOver() {
        return gameOver;
    }

    public void startNewGame() {
        fawad_score = 0;
        hashir_score = 0;
        b.reset();
        b.start();
        gameOver = false;
    }


    public int getFawadScore( )
    {
        return this.fawad_score ;
    }


    public int getHashir_score( )
    {
        return this.hashir_score ;
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

        fawad_score = 0;
        hashir_score = 0;


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
                        hashir_score +=1;
                        b.reset();

                    } else if (b.getX() > 600) {
                        fawad_score +=1;
                        b.reset();


                    }

                    if ( fawad_score >= 5 || hashir_score >=  5) {
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


