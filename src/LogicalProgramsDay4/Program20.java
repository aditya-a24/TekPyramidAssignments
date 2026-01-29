package LogicalProgramsDay4;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        getHCF(a,b);

    }

    public static int getHCF(int a, int b) {

        int small = (a < b) ? a : b;
        for (int i = small; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("HCF IS : " + i);
                return i;
            }
        }
        return 1;
    }


}
