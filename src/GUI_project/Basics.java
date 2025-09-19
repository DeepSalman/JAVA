package GUI_project;

import javax.swing.*;

class GUI extends JFrame { //Follows Card layout

    public GUI(){
        JLabel l = new JLabel("Hello world");
        JLabel l1 = new JLabel("Hello Salman");

        add(l);
        add(l1);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class Basics {
    public static void main(String[] args) {
        GUI gui = new GUI();


    }
}
