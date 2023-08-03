package app.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        getOutput(filterProduct(getProduct()));
    }

    private static Map<Integer, String> getProduct() {
        Map<Integer, String> days = new HashMap<>();
        days.put(8, "Monday");
        days.put(10, "Tuesday");
        days.put(15, "Wednesday");
        days.put(13, "Thursday");
        days.put(11, "Friday");
        days.put(12, "Saturday");
        days.put(14, "Sunday");
        return days;
    }

    private static Map<Integer, String> filterProduct(Map<Integer, String> days) {
        return days.entrySet().stream()
                .filter(map -> map.getKey() >= 10 && map.getKey() <=13)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }

    private static void getOutput(Map<Integer, String> days) {
        int count = 1;
        for (Map.Entry<Integer, String> entry : days.entrySet()) {
            System.out.println(count + ") " + "+" + entry.getKey() + " - " + entry.getValue()) ;
            count++;
        }
    }
}