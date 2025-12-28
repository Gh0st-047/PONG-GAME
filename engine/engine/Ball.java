public class Ball {

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;


    private int Right = 1;
    private int Up = 1;


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



    public void ball_Movement( Paddle left , Paddle right){

        x = x + Right * speed;
        y = y + Up * speed;

        if (x <= 10  || x >= 570){

            Right = Right* -1;

        }
        if ( y <= 10 || y >= 590){

            Up = Up * -1 ;

        }

        if ( x <= left.getX() + left.getWidth() && x + width >= left.getX() && y <= left.getY() + left.getHeight() && y+ height >= left.getY()){

            Right = 1;

        }

        if ( x + width >= right.getX() && x <= right.getX() + right.getWidth() && y <= right.getY() + right.getHeight() && y + height >= right.getY() ){
            Right =  - 1;
        }

    }





}
