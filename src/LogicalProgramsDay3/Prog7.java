package LogicalProgramsDay3;

public class Prog7 {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println(compress(input));
    }

    public static String compress(String s) {
        String result = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i);
                result = result + count;
                count = 1;
            }
        }
        return result;
    }
}
