package week3.exerciseb;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Point point){
        return (point.x==x && point.y==y);
    }

    public void setPoint(Point point){
        this.x=point.getX();
        this.y=point.getY();
    }

    public void moveHorizontally(int move){
        this.x=(getX()-move);
    }

    public void moveVertically(int move){
        this.y=(getY()+move);
    }



}
