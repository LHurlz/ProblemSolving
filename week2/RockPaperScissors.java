package week2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissors {
    JFrame jFrameWindow;
    JButton rockButton, paperButton, scissorsButton;
    JLabel label;
    int count=0;

    public RockPaperScissors(){
        jFrameWindow = new JFrame("Rock, Paper, Scissors");

        FlowLayout flow = new FlowLayout();
        jFrameWindow.setLayout(flow);
        jFrameWindow.setSize(300,100);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Game 1 - the computer has made its choice");
        jFrameWindow.add(label);

        rockButton = new JButton("Rock");
        jFrameWindow.add(rockButton);
        paperButton = new JButton("Paper");
        jFrameWindow.add(paperButton);
        scissorsButton = new JButton("Scissors");
        jFrameWindow.add(scissorsButton);

        EventHandler handler = new EventHandler();
        rockButton.addActionListener(handler);
        paperButton.addActionListener(handler);
        scissorsButton.addActionListener(handler);

        jFrameWindow.setVisible(true);

    }

    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int computerChoice = (int)(Math.random()*3)+1;

            if(e.getSource()==rockButton){
                int playerChoice = 1;

                if(playerChoice==computerChoice)
                    JOptionPane.showMessageDialog(null,"Draw - nobody won!");
                else if(computerChoice==2)
                    JOptionPane.showMessageDialog(null,"The computer won!");
                else if(computerChoice==3)
                    JOptionPane.showMessageDialog(null,"You won!");

                count++;
                label.setText("Game " + (count+1) + " - the computer has made its choice");

            }

            if(e.getSource()==paperButton){
                int playerChoice = 2;

                if(playerChoice==computerChoice)
                    JOptionPane.showMessageDialog(null,"Draw - nobody won!");
                else if(computerChoice==1)
                    JOptionPane.showMessageDialog(null,"You won!");
                else if(computerChoice==3)
                    JOptionPane.showMessageDialog(null,"The computer won!");

                count++;
                label.setText("Game " + (count+1) + " - the computer has made its choice");

            }

            if(e.getSource()==scissorsButton){
                int playerChoice = 3;

                if(playerChoice==computerChoice)
                    JOptionPane.showMessageDialog(null,"Draw - nobody won!");
                else if(computerChoice==1)
                    JOptionPane.showMessageDialog(null,"The computer won!");
                else if(computerChoice==2)
                    JOptionPane.showMessageDialog(null,"You won!");

                count++;
                label.setText("Game " + (count+1) + " - the computer has made its choice");

            }

         }
    }

    public static void main(String[] args) {
        RockPaperScissors guiApp = new RockPaperScissors();
    }

}
