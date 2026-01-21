package LogicalProgramsDay1;

public class Prog2 {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        findVowels(str.toLowerCase());
    }

    public static void findVowels(String s){
        String result = "";
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                result += c;
                count++;
            }
        }

        System.out.println("Total Vowel present in String are: "+result);
        System.out.println("Total No of Vowel present in String is:"+count);
    }

}

