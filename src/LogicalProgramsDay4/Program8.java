package LogicalProgramsDay4;

public class Program8 {
    public static void main(String[] args) {
        int[] a = {10,20,20,30,40,40,50};

        int max=a[0],secondMax = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }else if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
        }
        System.out.println("Biggest : " + max );
        System.out.println("SecondBiggest : " + secondMax );
    }
}
