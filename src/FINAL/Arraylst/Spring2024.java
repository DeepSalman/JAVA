package FINAL.Arraylst;

import java.util.*;

// Appliance class
class Appliance {
    String name, category;
    double powerConsumption; // watt

    Appliance(String n, String c, double d) {
        name = n;
        category = c;
        powerConsumption = d;
    }

    public String toString() {
        return name + " - " + category + " - " + powerConsumption + "W";
    }
}

// Comparator class for sorting in descending order
class PowerComparator implements Comparator<Appliance> {
    public int compare(Appliance a1, Appliance a2) {
        if (a1.powerConsumption < a2.powerConsumption)
            return 1;   // for descending order
        else if (a1.powerConsumption > a2.powerConsumption)
            return -1;
        else
            return 0;
    }
}


class ApplianceTest {
    public static void main(String[] args) {
        // task-1: create an empty ArrayList of "Appliance" type
        ArrayList<Appliance> list = new ArrayList<>();

        // task-2: add given appliances
        list.add(new Appliance("Television", "Entertainment", 150));
        list.add(new Appliance("Washing machine", "Laundry", 2000));
        list.add(new Appliance("Refrigerator", "Kitchen", 100));

        // task-3: find "Kitchen" appliances and print details
        System.out.println("Kitchen Appliances:");
        for (Appliance a : list) {
            if (a.category.equalsIgnoreCase("Kitchen")) {
                System.out.println(a);
            }
        }

        // task-4: sort the list based on power consumption (descending order)
        Collections.sort(list, new PowerComparator());

        // task-5: print appliances with highest and lowest power consumption
        System.out.println("\nSorted Appliances (Descending by Power):");
        for (Appliance a : list) {
            System.out.println(a);
        }

        System.out.println("\nHighest Power Consumption: " + list.get(0));
        System.out.println("Lowest Power Consumption: " + list.get(list.size() - 1));
    }
}

