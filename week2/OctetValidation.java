package week2;

import javax.swing.*;

public class OctetValidation {
    public static void main(String[] args) {

        String octet = JOptionPane.showInputDialog("Please enter an octet value");

        if(isValidOctet(octet))
            JOptionPane.showMessageDialog(null,"You entered a valid octet");
        else
            JOptionPane.showMessageDialog(null,"You entered an invalid octet");

    }

    private static boolean isValidOctet(String octet){

        for (int i=0; i<octet.length(); i++){

            if(octet.length()<1 || octet.length()>3)
                return false;
            if(!Character.isDigit(octet.charAt(i)))
                return false;
        }

        int octetAsInt = Integer.parseInt(octet);

        if(octetAsInt>=0 && octetAsInt<=255)
            return true;


        return false;
    }
}
