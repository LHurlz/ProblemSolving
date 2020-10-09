package week3.exercisea;

import javax.swing.*;

public class TestDate {
    public static void main(String[] args) {
        String output="";

        Date d1 = new Date();

        output+="Just called the Date() constructor - value of first Date object is " + d1.toString();

        Date d2 = new Date();

        int dayAsInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));
        d2.setDay(dayAsInt);

        int monthAsInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month value"));
        d2.setMonth(monthAsInt);

        int yearAsInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year value"));
        d2.setYear(yearAsInt);

        output+="\n\nJust called the Date(int,int,int) constructor - value of second Date object is " + d2.toString();

        if(d2.equals(d1))
            output+="\n\nJust called the equals() method. The result is that the dates are the same.";
        else
            output+="\n\nJust called the equals() method. The result is that the dates are different.";

        Date d3 = d2.copy();

        output+="\n\nJust called the copy() method. The value of the 3rd Date object is " + d3.toString();

        JOptionPane.showMessageDialog(null,output);
    }
}
