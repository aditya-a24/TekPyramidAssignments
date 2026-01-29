package LogicalProgramsDay4;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        getLCM(a,b);

    }
    public static void getLCM(int a, int b) {
        int big = (a > b) ? a : b;

        for (int i = big; ; i += big) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM is : " + i);
                break;
            }
        }
    }
}
