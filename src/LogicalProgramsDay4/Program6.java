package LogicalProgramsDay4;

public class Program6 {
    public static void main(String[] args) {
        int[] a = {10,20,20,30,40,40};

        int max=a[0],min =a[0];
        for(int x:a){
            if(x>max)max=x;
            if(x<min)min=x;
        }

        int[] freq = new int[max-min+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]-min]++;
        }
        System.out.print("Array After Removing : ");
        for (int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print((i+min) + " ");
            }
        }
    }
}
