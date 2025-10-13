package FINAL.Arraylst;

import java.util.*;

// (i) Comparable implementation to sort by price (low to high)
class Cow implements Comparable<Cow> {
    String name;
    int price;

    public Cow(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " costs " + price + " taka.";
    }

    @Override
    public int compareTo(Cow other) {
        //return this.price - other.price; // ascending order by price
        if (this.price > other.price) return 1;
        else if (this.price == other.price) return 0;
        else return -1;
    }
}

// (ii) Comparator implementation to sort by name (alphabetically)
class NameComparator implements Comparator<Cow> {
    @Override
    public int compare(Cow c1, Cow c2) {
        return c1.name.compareTo(c2.name);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();

        cows.add(new Cow("Raja Babu", 2700000));
        cows.add(new Cow("Hero Alom", 1500000));
        cows.add(new Cow("Sultan", 1800000));
        cows.add(new Cow("Minister", 1200000));
        cows.add(new Cow("Shahid", 2200000));

        System.out.println("Before Sorting:");
        for (Cow c : cows) {
            System.out.println(c);
        }

        // Sort by price (Comparable)
        Collections.sort(cows);
        System.out.println("\nAfter Sorting by Price:");
        for (Cow c : cows) {
            System.out.println(c);
        }

        // (iii) Sort by name (using Comparator)
        Collections.sort(cows, new NameComparator());
        System.out.println("\nAfter Sorting by Name:");
        for (Cow c : cows) {
            System.out.println(c);
        }
    }
}

