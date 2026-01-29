package LogicalProgramsDay4;

import java.util.Arrays;

public class Program15 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0)
             result[index++] = a[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
