package LogicalProgramsDay3;

import java.util.HashMap;
import java.util.Map;

public class Prog6 {
    public static void main(String[] args) {
        String s = "Java";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println("First non-repeating character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

