
import java.util.Arrays;

public class pra_39 {

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 9, 1, 7};
        System.out.println("Before sorting : " + Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println("After sorting : " + Arrays.toString(numbers));
        String[] names = {"John", "Alice", "Bob", "David"};
        System.out.println("\n Strings Before sorting : " + Arrays.toString(names));
        sortArray(names);
        System.out.println("Strings After sorting : " + Arrays.toString(names));
        Product[] products = {
            new Product("Laptop", 1000),
            new Product("Phone", 800),
            new Product("Tablet", 600),
            new Product("Smartwatch", 200)
        };
        System.out.println("\nBefore sorting (Products by price): ");
        for (Product p : products) {
            System.out.println(p);
        }
        sortArray(products);
        System.out.println("\nAfter sorting (Products by price): ");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("23DCS089_ Samarth");
    }
}

class Product implements Comparable<Product> {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return this.price - other.price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
