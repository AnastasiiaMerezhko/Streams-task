package app.task1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        getOutput(filterNames(getData()));
    }

    private static Stream<String> getData(){
        return Stream.of("Mario", "Megan",
                "Tom", "Steve", "John", "Magnus");
    }

    private static Stream<String> filterNames(Stream <String> stream) {
        return stream.filter(str -> str.startsWith("M"));

    }
    private static void getOutput(Stream<String> stream) {
        AtomicInteger cnt = new AtomicInteger(0);
        stream.forEach(name ->
                System.out.println(cnt.incrementAndGet() + ") " + name));
    }
}