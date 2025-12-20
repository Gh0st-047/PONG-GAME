public class Paddle {

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;


    public Paddle(){
        this.x = 0;
        this.y = 300;
        this.width= 50;
        this.height= 50;
        this.speed=10;
    }


    public Paddle(int x, int y, int w , int h , int s){


        this.x = x;
        this.y = y;
        this.width= w;
        this.height = y;
        this.speed  = s;
    }


    public void moveUP(){

        int temp = y- speed;
        if (temp <0){
            y = 0;
        } else{
            y = temp;

        }
    }

    public void moveDown(){

        int temp = y+ speed;
        if ( temp > 600){
            y = 600 - height;
        }else {
            y = temp;
        }
    }


    public int getX(){
        return this.x;
    }


    public int getY(){
        return this.y;
    }


    public int getWidth(){
        return this.width;
    }


    public int getHeight(){
        return this.height;
    }


}
