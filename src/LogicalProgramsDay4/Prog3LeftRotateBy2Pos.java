package LogicalProgramsDay4;

public class Prog3LeftRotateBy2Pos {
    public static void main(String[] args) {
        int[] no = {1, 2, 3, 4, 5};

        int k = 2;

        int [] temp = new int[2];

        for(int i = 0 ; i<k ; i++){
            temp[i] = no[i];
        }

        for(int i = k ; i < no.length ; i++){
            no[i - k] = no[i];
        }
    }
}
