package week2;

import javax.swing.*;

public class TriangleCalculator {
    public static void main(String[] args) {


        float side1 = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the first side of the triangle"));
        float side2 = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the second side of the triangle"));
        float side3 = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the third side of the triangle"));

        triangleDetails(side1,side2,side3);
    }

    private static void triangleDetails(float side1,float side2,float side3){
        float area = (float)Math.sqrt(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3));
        String type="";

        if(side1==side2 && side1==side3 && side2==side3)
            type="equilateral triangle";
        else if(side1!=side2 && side1!=side3 && side2!=side3)
            type="scalene triangle";
        else if(side1==side2 || side1==side3 || side2==side3);
            type="isosceles triangle";

        JOptionPane.showMessageDialog(null,"The area of the triangle is " + String.format("%.3f",area) + " squared units and it is a " + type,"Triangle Details",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
