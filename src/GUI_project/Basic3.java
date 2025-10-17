package GUI_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI3 implements ActionListener
{
    int value = 10; //the value that will be displayed on screen
    JFrame frame;
    JLabel label;
    JTextField text;
    JButton button;

    public GUI3()
    {
        frame = new JFrame();
        label = new JLabel();
        text = new JTextField();
        button = new JButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//terminates the code once the close button is clicked on the frame
        frame.setBounds(100,100,400,400);	//set left corner and length width at the same time

        frame.setVisible(true);		//setVisible to true to show the frame
        frame.setLayout(null);

        label.setText(value + ""); //value is an int, whereas we need to set a String as label, so we can simply write value + "" , which will convert it into a String
        button.setText("Perform");

        label.setBounds(100,50,100,50);
        text.setBounds(100,150,100,50);
        button.setBounds(100,250,100,50);

        button.addActionListener(this);

        frame.add(label);
        frame.add(text);
        frame.add(button);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            String str = text.getText();  //Retrieve the text from the textfield

            if(str.charAt(0) == '+')  // str.charAt(0) gives the character at index 0, which is the operator, I only coded for +, you have to do for the rest
            {
                str = str.split(" ")[1];
                // str.split(" ") splits the String str using the string parameter given in the split function i.e. " "(space)
                // it returns an array of Strings, where each index contains each of the split Strings
                // for example: str = "+ 57" , str.split(" ") gives an array where index 0 has "+" and index 1 has "57"
                // str = str.split(" ")[1] sets str to the number given (for example "57" in the example above)

                value += Integer.parseInt(str);
                // str is a String but you cannot add a String to a integer, so you need to convert the String into a integer
                // you can use the wrapper class' function -> Integer.parseInt(str) to convert str into an integer

                label.setText(value + "");
                // set the new value as text in the label, here also like before you have to convert value from int to String, simple add ""
            }
            else
            {
                System.out.println("Error");
            }

        }
    }

}

public class Basic3 {

    public static void main(String[] args) {
        new GUI3();
    }

}
