package LogicalProgramsDay3;

import java.util.HashMap;

public class Prog8 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        findLongestUniqueSubstr(s);
    }

    public static void findLongestUniqueSubstr(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        int maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        String longestSubstr = s.substring(maxStart, maxStart + maxLen);

        System.out.println("Longest length: " + maxLen);
        System.out.println("Longest substring: " + longestSubstr);
    }
}

