package LogicalProgramsDay4;

public class Program16 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        System.out.print("Intersection: ");
        findIntersection(a, b);
    }

    public static void findIntersection(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    b[j] = -1; // mark as used
                    break;
                }
            }
        }
    }
}
