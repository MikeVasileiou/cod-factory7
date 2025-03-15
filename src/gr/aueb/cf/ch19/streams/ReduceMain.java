package gr.aueb.cf.ch19.streams;

import java.util.List;

public class ReduceMain {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Product> products = List.of(new Product("", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Mangoes", 18.5, 50),
                new Product("Strawberries", 10.5, 30),
                new Product("Oranges", 12.4, 80));

        int totalSum1 = numbers.stream().reduce(0, (sum, n) -> sum + n);
        int totalSum2 = numbers.stream().reduce(0, Integer::sum);

        int sumOfQuantities = products.stream()
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);





    }
}
