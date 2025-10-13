package FINAL.Arraylst;
/// Some instructions:
/// Ascending order means - lower to upper 0-9:
/// Descending order means - upper to lower 9-0:




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    String name;
    int amount;
    double unit_price;
    double total_price; // calculated inside class

    public Product(String name, int amount, double unit_price) {
        this.name = name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.total_price = amount * unit_price; // calculated once during object creation
    }

    @Override
    public String toString() {
        return name + " - Amount: " + amount + ", Unit Price: " + unit_price + ", Total: " + total_price;
    }


}


class sorting implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.unit_price>o2.unit_price) return -1;
        else if(o1.unit_price<o2.unit_price) return 1;
        else return 0;
    }
}

class ProductList {
    public static void main(String[] args) {
        // i. Declare an ArrayList of Product
        ArrayList<Product> products = new ArrayList<>();

        // ii. Insert given products
        products.add(new Product("Mango", 5, 20));
        products.add(new Product("Apple", 4, 24));
        products.add(new Product("Litchi", 20, 3));

        // iii. Insert Banana at index 1
        products.add(1, new Product("Banana", 10, 12));

        // iv. Update the unit_price of "Apple" to 30 (and recalculate total_price)
        for (Product p : products) {
            if (p.name.equals("Apple")) {
                p.unit_price = 30;
                p.total_price = p.amount * p.unit_price; // update total price too
            }
        }

        // v. Sort the arraylist based on total_price (descending)
        Collections.sort(products, new sorting());


        // Print sorted list
        System.out.println("Products sorted by total price (descending):");
//        for (Product p : products) {
//            System.out.println(p);
//        }

        //using normal loop
         for (int i = 0; i < products.size(); i++) {
             System.out.println(products.get(i));
         }
    }
}
