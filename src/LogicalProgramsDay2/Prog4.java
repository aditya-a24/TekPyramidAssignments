package LogicalProgramsDay2;

public class Prog4 {
    public static void main(String[] args) {
        String s = "This is Java";

        getReplaceChar(s);
    }

    public static void getReplaceChar(String s){
        String result = "";

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                result += (char) (c - 32);
            }
            if(c >= 'A' && c<= 'Z'){
                result += (char) (c + 32);
            }
            if(c == 32){
                result += ' ';
            }
        }

        System.out.println(s + " becomes: " + result);
    }
}
