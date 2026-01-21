package LogicalProgramsDay1;

public class Prog1 {

    public static void main(String[] args) {
        String str = "Mohan, Sohan, Rohan #$%&";

        findPunctuations(str);
    }

    public static void findPunctuations(String s){
        String punctuationsStr = "!\"#$%&'()*+,-./:;<=>?@[\\\\]^_{|}~";
        String result = "";
        int count = 0;

        for(char c : s.toCharArray()){
            for(int i = 0 ; i<punctuationsStr.length() ; i++) {
                if (c == punctuationsStr.charAt(i)){
                    result += c;
                    count++;
                }
            }
        }

        System.out.println("Total Punctutation present in String are: "+result);
        System.out.println("Total No of Punctuation present in String is:"+count);
    }

}
