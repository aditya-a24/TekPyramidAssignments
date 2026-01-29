package LogicalProgramsDay4;

import java.util.*;

public class Program11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target...");
        int target = sc.nextInt();

        List<Integer> list = Arrays.asList(2, 7, 11, 15, 5, 3);
        Map<Integer, Integer> m1 = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int complement = target - num;

            if (m1.containsKey(complement)) {
                System.out.println("Pair Found " + complement + " + " + num + " : " + target);
                found = true;
                break;
            }
            m1.put(num, i);
        }
        if (!found) {
            System.out.println("No Pair Found..");
        }
    }
}
