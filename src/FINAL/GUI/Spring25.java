package FINAL.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RockPaperScissorsGUI {

    // To generate a random choice, use the following function:
    private static String getRandomChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        return options[(int) (Math.random() * 3)];
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Rock Paper Scissors");
        JLabel label1 = new JLabel("Player 1");
        JLabel label2 = new JLabel("Player 2");
        JLabel resultLabel = new JLabel("Result will be shown here");
        JButton leftButton = new JButton("Player 1 Play");
        JButton rightButton = new JButton("Player 2 Play");
        JButton checkButton = new JButton("Check Winner");

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(label2);
        frame.add(leftButton);
        frame.add(checkButton);
        frame.add(rightButton);
        frame.add(resultLabel);

        //Code for the action handlers - QP code

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(getRandomChoice());
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(getRandomChoice());
            }
        });

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice1 = label1.getText();
                String choice2 = label2.getText();

                /// Player 1 wins
                if(choice1.equals("Paper") && choice2.equals("Rock") ||
                        choice1.equals("Rock") && choice2.equals("Scissors") ||
                        choice1.equals("Scissors") && choice2.equals("Paper"))
                {
                    resultLabel.setText("Player 1 Wins!");
                }
                else if(choice2.equals("Paper") && choice1.equals("Rock") ||
                        choice2.equals("Rock") && choice1.equals("Scissors") ||
                        choice2.equals("Scissors") && choice1.equals("Paper"))
                {
                    resultLabel.setText("Player 2 Wins!");
                }
                else if(choice1.equals(choice2))
                {
                    resultLabel.setText("Match Tied!");
                }

            }
        });
    }
}
