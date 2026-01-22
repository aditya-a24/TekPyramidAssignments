package LogicalProgramsDay2;

public class Prog7 {
    public static void main(String[] args) {
        String str = "This is String";

        getReverse(str);
    }

    public static void getReverse(String str){

        char[] ch = str.toCharArray();

        String result = "";


        for(int i = ch.length-1 ; i>=0 ; i--){
            result += ch[i];
        }

        System.out.println(result);
    }

}
