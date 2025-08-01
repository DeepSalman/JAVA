package LinkedList;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<>();
        countryNames.add("China");
        countryNames.add("India");
        countryNames.add("Russia");
        countryNames.add("Ukraine");

        //For Entire List
        System.out.println(countryNames);


        //For Each Loop
        for(String country : countryNames){
            System.out.println(country);
        }

        System.out.println("Size of the linked List : "+countryNames.size());

        //Adding in list
        countryNames.add(4,"Brazil");
        System.out.println("Size of the linked List after addition : "+countryNames.size());
        System.out.println(countryNames);


        //For adding in front and last
        countryNames.addFirst("Australia");
        System.out.println(countryNames);

        countryNames.addLast("Newzeland");
        System.out.println(countryNames);

        //Removing in list
        countryNames.remove("India");
        System.out.println(countryNames);

        countryNames.removeFirst();
        System.out.println(countryNames);

        countryNames.removeLast();
        System.out.println(countryNames);

        //Get first and get last
        System.out.println("First element: "+countryNames.getFirst());
        System.out.println("Last element: "+countryNames.getLast());

        //Clearing Linked list
        countryNames.clear();
        System.out.println(countryNames);


    }
}
