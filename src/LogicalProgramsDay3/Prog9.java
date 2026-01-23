package LogicalProgramsDay3;

public class Prog9 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String doubleStr = "";
        for (int i = 0; i < s1.length(); i++) {
            doubleStr += s1.charAt(i);
        }
        for (int i = 0; i < s1.length(); i++) {
            doubleStr += s1.charAt(i);
        }

        for (int i = 0; i <= doubleStr.length() - s2.length(); i++) {
            int k = i;
            int j = 0;

            while (j < s2.length() && doubleStr.charAt(k) == s2.charAt(j)) {
                k++;
                j++;
            }

            if (j == s2.length()) {
                return true;
            }
        }

        return false;
    }
}
