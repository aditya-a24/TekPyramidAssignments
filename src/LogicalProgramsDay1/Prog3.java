package LogicalProgramsDay1;

public class Prog3 {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        findConsonants(str.toLowerCase());
    }

    public static void findConsonants(String s){
        String result = "";
        int count = 0;

        for(char c : s.toCharArray()){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                result += c;
                count++;
            }
        }

        System.out.println("Total Consonants present in String are: "+result);
        System.out.println("Total No of Consonants present in String is:"+count);
    }

}
