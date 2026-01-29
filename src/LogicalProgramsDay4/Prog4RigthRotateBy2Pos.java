package LogicalProgramsDay4;

import javax.xml.transform.Source;

public class Prog4RigthRotateBy2Pos {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int r = 2;

        getRotation(a, r);
    }

    public static void getRotation(int[] a, int r){

        r = r % a.length;
        if(r == 0)
            return;

        getReverse(a, 0, a.length-1);

        getReverse(a, r, a.length-1);

        getReverse(a, 0, r-1);
        System.out.println("Right Rotation of array by 2 position: ");
        for(int i : a){
            System.out.print(i + " ");
        }

    }

    public static void getReverse(int[] a, int start, int end){
        while (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }
}
