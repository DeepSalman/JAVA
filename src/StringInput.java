import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        //Input for one word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1= input.next();

        System.out.println("Your Input is :"+s1);

        //Input for several word
        input.nextLine(); //To remove input buffer !

        System.out.println("Enter a sentence : ");
        String sentence = input.nextLine();
        System.out.println("Your sentence is :"+s1+sentence);


    }
}
