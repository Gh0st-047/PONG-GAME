public class Ball {

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;

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




    public void ball_move_right(){

        int temp;
        temp = x + speed;
        if (temp> 600){
            x = 600 - width;
        }else{
            x = temp;
        }


    }
}
