package GUI_project;

import javax.swing.*;

class gui{
    JFrame frame;
    JLabel username;
    JTextField user;
    JLabel password;
    JTextField Pass;
    JButton login;
    public gui(){
        frame=new JFrame("Login Page");
        username=new JLabel("Username");
        password=new JLabel("Password");
        user=new JTextField();
        Pass=new JTextField();
        login=new JButton("Login");

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.add(username);
        frame.add(password);
        frame.add(user);
        frame.add(Pass);
        frame.add(login);
    }
}

public class Basic {
    public static void main(String[] args) {
        gui g1 =new gui();
    }

}
