package week2;

import javax.swing.*;

public class PhonebookArray {
    public static void main(String[] args) {
        String[] names = new String[10];
        String[] phoneNumbers = new String[10];
        int subscript;

        populateArrays(names,phoneNumbers);

        String nameSearch = JOptionPane.showInputDialog("Whose phone number do you seek?");

        subscript = linearSearch(names,nameSearch);

        if(subscript==-1){
            JOptionPane.showMessageDialog(null,"Sorry the name you searched for, " + nameSearch + ", was not found.");
        }
        else
            JOptionPane.showMessageDialog(null,"The phone number is " + phoneNumbers[subscript]);

    }

    private static void populateArrays(String[] names, String[] phoneNumbers){
        for(int i=0; i<names.length; i++) {
            names[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
            phoneNumbers[i] = JOptionPane.showInputDialog("Please enter the phone number of person " + (i+1));
        }

    }

    private static int linearSearch(String[] names,String nameSearch){
        int i;

        for(i=0; i<names.length; i++)
        {
            if(names[i].equals(nameSearch))
                return i;
        }

        return -1;
    }

}
