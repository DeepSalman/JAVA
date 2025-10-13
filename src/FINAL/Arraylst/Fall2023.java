package FINAL.Arraylst;

import java.util.*;

// Address class
class Address {
    String houseNo, area, city;
    int zip;

    public Address(String houseNo, String area, String city, int zip) {
        this.houseNo = houseNo;
        this.area = area;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return houseNo + ", " + area + ", " + city + " - " + zip;
    }
}

// Comparator for sorting by zip (ascending)
class ZipComparator implements Comparator<Address> {
    public int compare(Address a1, Address a2) {
        if (a1.zip > a2.zip)
            return 1;
        else if (a1.zip < a2.zip)
            return -1;
        else
            return 0;
    }
}

class Test {
    public static void main(String[] args) {
        // Task 1: Create an empty ArrayList of Address type
        ArrayList<Address> list = new ArrayList<>();

        // Task 2: Add objects
        list.add(new Address("19/A", "Dhanmondi", "Dhaka", 1209));
        list.add(new Address("2/A", "Tejgaon", "Dhaka", 1215));
        list.add(new Address("65", "Nirala", "Khulna", 9100));

        // Task 3: Add new object at index 1
        list.add(1, new Address("215", "Aamtola", "Barishal", 8200));

        // Task 4: Set the object at index 2 to a new one
        list.set(2, new Address("36", "Gulshan", "Dhaka", 1212));

        // Sort ascending by zip code
        Collections.sort(list, new ZipComparator());

        System.out.println("After Sorting (Ascending by ZIP):");
        for (Address a : list) {
            System.out.println(a);
        }

        // Task 5: Delete object at index 2
        list.remove(2);

        System.out.println("\nAfter Deletion (index 2 removed):");
        for (Address a : list) {
            System.out.println(a);
        }
    }
}
