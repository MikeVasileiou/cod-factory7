package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Mangoes", 18.5, 50),
                new Product("Strawberries", 10.5, 30),

                new Product("Oranges", 12.4, 80));

        ArrayList<String> ListOfFruitNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        int totalQuantities = products.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();

    }
}
