package LogicalProgramsDay3;

public class Prog4 {
    public static void main(String[] args) {
        String s = "12345";

        boolean isDigits = true;

        if (s.length() == 0) {
            isDigits = false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                isDigits = false;
                break;
            }
        }

        System.out.println(isDigits);
    }
}

