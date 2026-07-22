package dailyproblems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Wordcount {

    public static void main(String[] args) {

        String[] words = {
                "Java", "Python", "Java",
                "C", "Python", "Java"
        };

        Map<String, Long> count = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(count);
    }
}