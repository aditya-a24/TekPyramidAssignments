package LogicalProgramsDay4;

public class Prog2FreqOfElementsInAnArray {

    public static void main(String[] args) {
        int[] no = {10, 10, 2, 8, 3, 3, 2, 15, 13, 13, 14};

        getFrequency(no);

    }

    public static void getFrequency(int[] no){
        int min = no[0];
        int max = no[0];

        for(int n : no){
            if(n < min)
                min = n;
            if(n > max)
                max = n;
        }

        int[] freq = new int[max - min + 1];

        for(int i = 0 ; i < no.length ; i++){
            freq[no[i] - min]++;
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                System.out.println((i+min) + " is "+ freq[i] +" times.");
            }
        }


    }

}
