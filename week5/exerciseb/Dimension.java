package week5.exerciseb;

public class Dimension {
    private int length;
    private int width;
    private int height;

    public Dimension(int length,int width,int height){
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Length:  "+getLength()+"  Width:  "+getWidth()+"  Height:  " +getHeight();
    }
}
