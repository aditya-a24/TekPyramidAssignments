package LogicalProgramsDay2;

public class Prog6 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1;

        for (int i = 0; i <= temp.length() - s2.length(); i++) {
            if (temp.substring(i, i + s2.length()).equals(s2)) {
                return true;
            }
        }
        return false;
    }

}
