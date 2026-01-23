package LogicalProgramsDay3;

import java.util.HashMap;
import java.util.Map;

public class Prog5 {
    public static void main(String[] args) {
        String s = "Programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int value = map.getOrDefault(c, 0);
            map.put(c, value+1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

