package LogicalProgramsDay2;

public class Prog2 {
    public static void main(String[] args) {
        String s = "aaaaaddde";

        char maxChar= getMaxOccurring(s);
        char minChar = getMinOccurring(s);

        System.out.println("The Maximum Occurring Character in a String is: "+maxChar);
        System.out.println("The Minimum Occurring Character in a String is: "+minChar);
    }

    public static char getMaxOccurring(String s){
        int[] freq =  getFrequency(s);

        int maxFreq = freq[0];
        int maxIndex = 0;
        for(int i = 1 ; i< freq.length ; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxIndex = i;
            }
        }

        return (char) (maxIndex + 'a');
    }

    public static char getMinOccurring(String s){
        int[] freq = getFrequency(s);

        int minFreq = Integer.MAX_VALUE;
        int minIndex = 0;

        for(int i = 0 ; i<freq.length ; i++){
            if(freq[i] != 0 && freq[i] < minFreq){
                minFreq = freq[i];
                minIndex = i;
            }
        }
        return (char) (minIndex+'a');
    }

    public static int[] getFrequency(String s){
        String str = s.toLowerCase();

        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                freq[c - 'a']++;
            }
        }

        return freq;
    }
}
