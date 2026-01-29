package LogicalProgramsDay4;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input : ");
        int n = sc.nextInt();
        isFib(n);
    }

    public static void isFib(int n){
         int[] fib = new int[n];
         fib[0]=0;
         fib[1]=1;

         for(int i=2;i<n;i++){
             fib[i] = fib[i-1]+ fib[i-2];
         }
        System.out.println(Arrays.toString(fib));
    }
}
