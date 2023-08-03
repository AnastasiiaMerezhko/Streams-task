package app.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        getOutput(filterProduct(getProduct()));
    }

    private static Map<String, Double> getProduct() {
        Map<String, Double> products = new HashMap<>();
        products.put("cheese", 1.30);
        products.put("milk", 2.00);
        products.put("Kiwi", 2.10);
        products.put("banana", 3.05);
        products.put("rice", 1.15);
        return products;
    }

    private static Map<String, Double> filterProduct(Map<String, Double> products) {
        return products.entrySet().stream()
                .filter(map -> map.getValue() <= 2.00)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static void getOutput(Map<String, Double> products) {
        int count = 1;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(count + ") " + entry.getKey() + " - " + entry.getValue() + " USD") ;
            count++;
        }
    }
}