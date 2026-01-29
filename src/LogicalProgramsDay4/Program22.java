package LogicalProgramsDay4;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
            if(isArmStrong(n))
                System.out.println("It is a Armstrong Number");
            else
                System.out.println("It is Not Armstrong Number");
    }

    public static boolean  isArmStrong(int n) {
        int sum=0;
        int num=n;
        int count=getCount(n);
        while(n>0) {
            int rem=n%10;
            sum=sum+getPower(rem,count);
            n/=10;
        }
        return sum==num;
    }

    public static int getCount(int n) {
        int count=0;
        while(n>0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static int getPower(int a,int b) {
        int pow=1;
        for(int i=1;i<=b;i++) {
            pow=pow*a;
        }
        return pow;
    }
    }

