package LogicalProgramsDay2;

public class Prog5 {

    public static void main(String[] args) {
        String str = "RaceCars";

        if(isPalindrome(str)){
            System.out.println(str + " is a Palindrome String");
        }else{
            System.out.println(str + " is not a Palindrome String");
        }
    }

    private static boolean isPalindrome(String str) {

        String s = str.toLowerCase();

        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


}
