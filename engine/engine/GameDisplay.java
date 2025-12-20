import javax.swing.*;
import java.awt.*;

public class GameDisplay extends JPanel {

    private Paddle pd;

    public GameDisplay(Paddle p){

        pd = p;
        setPreferredSize(new Dimension(600, 600));


    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0, 600,600);
        g.setColor(Color.white);
        g.fillRect(pd.getX(),pd.getY(),pd.getWidth(),pd.getHeight());


        g.fillRect(pd.getX(),pd.getY(),pd.getWidth(),pd.getHeight());
    }
}
