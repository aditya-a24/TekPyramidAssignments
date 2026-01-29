package LogicalProgramsDay4;

import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Input");
        int n =  sc.nextInt();

        int sum = 0;
        while(n>0){
            int rem= n%10;
            sum= sum+rem;
            n/=10;
        }
        System.out.println("Sum : "+sum);
    }
}
