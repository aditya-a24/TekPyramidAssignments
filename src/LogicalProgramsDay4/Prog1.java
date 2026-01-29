package LogicalProgramsDay4;

public class Prog1 {

    public static void main(String[] args) {
        int no = 235467;

        int largest = no%10;
        int smallest = no%10;

        while (no != 0) {
            int rem = no % 10;

            if(rem > largest)
                largest = rem;

            if(rem < smallest)
                smallest = rem;

            no = no/10;
        }

        System.out.println("Largest Digit in the number is: "+largest);
        System.out.println("Smallest Digit in the number is: "+smallest);

    }

}
