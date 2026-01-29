package LogicalProgramsDay4;

import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        int[] a = {5, 1, 3, 9, 2};
        int p = thirdLargest(a);
        System.out.println("3rd Largest is : "+p);
    }

    public static int thirdLargest(int[] a){
        Arrays.sort(a);
        int count=1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]!=a[i+1])
                count++;
            if(count==3)
                return a[i];

        }
return a[a.length-1];
    }
}
