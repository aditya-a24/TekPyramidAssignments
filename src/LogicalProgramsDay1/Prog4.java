package LogicalProgramsDay1;

public class Prog4 {

    public static void main(String[] args) {
        String s1 = "    Rat!!   ";
        String s2 = "   tar  ";

//        if(s1.length() != s2.length()){
//            System.out.println("Both String have different length! Write Same length String");
//            return;
//        }

        isAnagram(s1, s2);
    }

    public static void isAnagram(String s1, String s2) {
        int[] freq1 = getFrequency(s1.trim().toLowerCase());
        int[] freq2 = getFrequency(s2.trim().toLowerCase());

        for(int i = 0 ; i<freq1.length ; i++){
            if(freq1[i] != freq2[i]){
                System.out.println(s1 + " and " +s2 +" is not Anagrams");
                return;
            }
        }
        System.out.println(s1.trim() + " and " +s2.trim() +" is Anagrams");
    }

    public static int[] getFrequency(String s){
        int[] freq = new int[26];

        for(char c:s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                freq[c - 'a']++;
            }
        }
        return freq;

    }

}
