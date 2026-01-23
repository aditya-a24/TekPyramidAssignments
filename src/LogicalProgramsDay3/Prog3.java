package LogicalProgramsDay3;

import java.util.HashMap;
import java.util.Map;

public class Prog3 {
    public static void main(String[] args) {
        String text = "I love Java. Java is fun. Java is powerful.";

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z0-9\\s]", " ");

        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (word.length() > 0) {
                int value = map.getOrDefault(word, 0);
                map.put(word, value + 1);
            }
        }

        String mostRepeated = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeated = entry.getKey();
            }
        }

        System.out.println("Most repeated word: " + mostRepeated);
        System.out.println("Frequency: " + maxCount);
    }
}

