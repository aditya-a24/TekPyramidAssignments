package LogicalProgramsDay3;

public class Prog1 {

    public static void main(String[] args) {
        String s = "I Love Programming";

        getReverse(s);

    }

    public static void getReverse(String s){

        String word = "";
        String result = "";

        for(int i = s.length()-1 ; i >= 0 ; i--){

            char c = s.charAt(i);

            if(c != ' '){
                word = c+word;
            }else{
                result = result + word + " ";
                word = "";
            }
        }
        result = result + word;
        System.out.println(result);
    }

}
