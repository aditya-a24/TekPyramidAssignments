package LogicalProgramsDay4;

import java.sql.SQLOutput;

public class Program17 {
    public static void main(String[] args) {

        int[] a = {1,3,5,11,14};

        System.out.println("Prime Numbers :");
        for(int x:a){
            if(isPrime(x))
                System.out.print(x + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
