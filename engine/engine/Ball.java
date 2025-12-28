public class Ball {



    // basic variables stuff

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;


    // important direction variables for the collision of ball with the left/right padel
    private int Right = 1;
    private int Up = 1;

    private boolean moving = false;


    public void reset(){
        x = 300;
        y = 300;

        moving = false;

    }


    public void start(){

        moving = true;
    }

    public void stop() {
        moving = false;
    }


    public Ball(){

        this.x = 100;
        this.y= 100;
        this.width = 20;
        this.height = 20;
        this.speed = 15;

    }

    public Ball(int i, int y, int w, int h , int s){

        this.x = i;
        this.y = y;
        this.width = w;
        this.height = h;
        this.speed =s;

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int get_width(){
        return this.width;
    }

    public int get_height(){
        return this.height;
    }



    // ball movement function that decides the movement of the fucntions and everything else

    public void ball_Movement( Paddle left , Paddle right){


        if (moving){


            x = x + Right * speed;
            y = y + Up * speed;


            // reflect the ball back when it hits the up and down side of the screen
            if ( y <= 0 || y >= 600){

                Up = Up * -1 ;

            }


            // tooke me around 3-4 hours figuring out this collision betwenn ball and paddles...( very basic stuff but very difficult
            //collision of the ball with left paddle
            if ( x <= left.getX() + left.getWidth() && x + width >= left.getX() && y <= left.getY() + left.getHeight() && y+ height >= left.getY()){

                Right = 1;

            }

            //collision of the ball with right paddle


            if ( x + width >= right.getX() && x <= right.getX() + right.getWidth() && y <= right.getY() + right.getHeight() && y + height >= right.getY() ){
                Right =  - 1;
            }

        }

    }

}
