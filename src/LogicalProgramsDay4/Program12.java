package LogicalProgramsDay4;

public class Program12 {
    public static void main(String[] args) {

        int[] a = {1,3,4};
        int sum=0;
        int n = a.length+1;
        for(int i=0;i<a.length;i++){
            sum =  sum + a[i];
        }
        System.out.println((n*(n+1)/2)-sum);
    }
}
