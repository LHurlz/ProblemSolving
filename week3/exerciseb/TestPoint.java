package week3.exerciseb;

import javax.swing.*;

public class TestPoint {
    public static void main(String[] args) {
        String output="";

        Point p1 = new Point();
        output+="Just called Point() constructor.  Value of first object is " + p1.toString();

        Point p2 = new Point();
        int xAsInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter the x-coordinate"));
        p2.setX(xAsInt);
        int yAsInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter the y-coordinate"));
        p2.setY(yAsInt);
        output+="\n\nJust called Point(int,int) constructor.  Value of second object is " + p2.toString();

        if(p2.equals(p1))
            output+="\n\nJust called the equals() method.  The result is that the points are the same.";
        else
            output+="\n\nJust called the equals() method.  The result is that the points are different.";

        Point p3 = new Point(-4,11);
        output+="\n\nJust created a third point with values " + p3.toString();

        p2.setPoint(p3);
        output+="\n\nJust called setPoint() method to change the state of the second point to that of the third point. Value" +
                " of the second point is now " + p2.toString();

        p3.moveHorizontally(5);
        output+="\n\nJust called moveHorizontally() method to change the x value by -5 units.  Value of third object is now " + p3.toString();

        p1.moveVertically(6);
        output+="\n\nJust called moveVertically() method to change the y value by 6 units.  Value of first object is now " + p1.toString();



        JOptionPane.showMessageDialog(null,output);




    }
}
