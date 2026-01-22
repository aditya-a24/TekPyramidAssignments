package LogicalProgramsDay2;

public class Prog1 {
    public static void main(String[] args) {
        String s = "FUN";

        getSubsets(s);
    }

    public static void getSubsets(String s) {
        char[] arr = s.toCharArray();


        for (int i = 0 ; i < arr.length ; i++) {

            String result = "";
            for (int j = i ; j < arr.length ; j++) {
                result += arr[j];
                System.out.println(result);
            }
        }

    }

}
