package GUI_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI2 implements ActionListener //implement ActionListener function to use Button action and other actions
{
    //Declare the required FINAL.FINAL.GUI variables
    JFrame frame;	//Frame is the screen where you add the components
    JLabel username;	//Text for username
    JTextField name;	//TextField for typing the username
    JLabel password;	//Text for password
    JTextField pass;	//TextField for typing the password
    JButton login;	//Login button

    //new components
    JButton b1;

    public GUI2() 	//Constructor where we setup the frame and the components
    {
        frame = new JFrame("My Login Page");	//Can add title for the frame
        username = new JLabel();
        name = new JTextField();
        password = new JLabel();
        pass = new JTextField();
        login = new JButton();

        // frame.setLocation(100,100);	//set the left corner coordinate
        //  frame.setSize(400,400);	//set length and width of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//terminates the code once the close button is clicked on the frame
        frame.setBounds(100,100,400,500);	//set left corner and length width at the same time

        frame.setVisible(true);		//setVisible to true to show the frame
        frame.setLayout(null);		//this must be set to null, or else the frame will show the components using its default layout

        //Set the texts for the components
        username.setText("Username");
        password.setText("Password");
        login.setText("Login");

        //Set the left corner and size of the components
        username.setBounds(50, 50, 100, 50);
        name.setBounds(200, 50, 100, 50);
        password.setBounds(50, 150, 100, 50);
        pass.setBounds(200, 150, 100, 50);
        login.setBounds(100, 250, 100, 50);

        //Add the components to the frame
        frame.add(username);
        frame.add(name);
        frame.add(password);
        frame.add(pass);
        frame.add(login);

        //Add this line to the button so that the action can be called while clicking
        login.addActionListener(this);

        //New Button
        b1 = new JButton();
        b1.setText("Another Button");
        b1.addActionListener(this);
        b1.setBounds(100,350,100,50);
        frame.add(b1);

    }

    public void actionPerformed(ActionEvent e)	//override the actionPerformed method to use the Button function
    {
        if(e.getSource() == login) { // e.getSource() function tells us which button has been clicked, remember to declare the buttons(components) as class variables
            if (name.getText().equals("oop") && pass.getText().equals("1115")) {
                System.out.println("Successful");
            } else {
                System.out.println("Try Again");
            }
        }
        else if(e.getSource() == b1)
        {
            System.out.println("b111111");
        }
    }
}


public class Basic2 {

    public static void main(String[] args) {
        new GUI2();	//just create a FINAL.FINAL.GUI object to run the code
    }

}