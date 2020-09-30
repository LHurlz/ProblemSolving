package week2;

import javax.swing.*;

public class NumberArray {
    public static void main(String[] args) {
        double[] numbers = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};
        double largest, average;
        String aboveAverageString="";

        largest = largest(numbers);
        average = average(numbers);
        aboveAverageString = aboveAverage(numbers,average);

        JOptionPane.showMessageDialog(null,"The largest value in the array is "+largest+"\nThe average value in the array is " +String.format("%.3f",average)+
                "\n"+aboveAverageString);
    }

    private static double largest(double[] numbers){
        double largest=numbers[0];

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>largest)
                largest=numbers[i];
        }

        return largest;
    }

    private static double average(double[] numbers){
        double total=0;
        double average;

        for(int i=0; i<numbers.length; i++){
            total+=numbers[i];
        }

        average = (total/numbers.length);

        return average;
    }

    private static String aboveAverage(double[] numbers, double average){
        String output="The list of values above average is";

        for(int i=0; i< numbers.length; i++){
            if(numbers[i]>average)
                output+=" " + numbers[i];
        }

        return output;
    }
}
