package LogicalProgramsDay2;

public class Prog3 {
    public static void main(String[] args) {
        String s = "This is String";
        char replaceChar = '_';

        String result = "";

        for(char c : s.toCharArray()){
            if(c == ' ')
                result += replaceChar;
            else
                result += c;
        }
        System.out.println(result);
    }
}
