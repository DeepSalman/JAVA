package Arrays;

public class ArrayClassTopic {

    public static void main(String[] args) {

        boolean b = false; // boolean type - true/false
        String uni = "UIU"; // String type for using strings in java

        int arr [] = new int[5]; // arr reference points to 5 int memory location
        //  int [] arr = new int[5]; // alternate declaration
        //  int arr[] = {10,20,30,40,50}; // direct declaration

        arr[0] = 10;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++) // Can use arr.length variable for directly using length of array
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int x : arr) //For each loop - each element of arr is saved in x
        {
            System.out.print(x + "");
        }

        System.out.println();



    }

}
