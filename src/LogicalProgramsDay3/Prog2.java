package LogicalProgramsDay3;

public class Prog2 {

    public static void main(String[] args) {
        String input = "Java is Java and Java is fun";

        String[] words = input.toLowerCase().split(" ");
        int n = words.length;

        boolean[] visited = new boolean[n];

        System.out.println("Duplicate words are:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (words[i].equals(words[j])) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(words[i]);
            }
        }
    }
}

