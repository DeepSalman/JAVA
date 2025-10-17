package FINAL.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FootToInchGUI implements ActionListener {

    JFrame frame = new JFrame("Converter");
    JLabel l1 = new JLabel("Foot");
    JLabel l2 = new JLabel("Inch");
    JTextField foot = new JTextField("0");
    JTextField inch = new JTextField("0");
    JButton button = new JButton("Convert to Inch");

    public FootToInchGUI()
    {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100,100,400,400);
        l1.setBounds(50,50,100,50);
        foot.setBounds(150,50,100,50);
        button.setBounds(100,150,150,50);
        l2.setBounds(50,250,100,50);
        inch.setBounds(150,250,100,50);

        frame.add(l1);
        frame.add(l2);
        frame.add(foot);
        frame.add(button);
        frame.add(l2);
        frame.add(inch);

        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        double val = Double.parseDouble(foot.getText());
        val *= 12;
        inch.setText(val + "");
    }

    public static void main(String[] args) {
        new FootToInchGUI();
    }

}
