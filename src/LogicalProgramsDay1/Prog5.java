package LogicalProgramsDay1;

public class Prog5 {

    public static void main(String[] args) {
        String s = "abcdefghi";
        int n = 3;

        if(s.length() == 0 || s.length()%n != 0){
            System.out.println("Dividing of String is not possible");
            return;
        }
        divideString(s, n);
    }

    public static void divideString(String s, int n){
        int splitingNo = s.length()/n;

        // Using Substring method
        //        int size = 0;
//        for (int i = 0 ; i<n ; i++){
//            System.out.println(s.substring(size, size+splitingNo));
//            size += splitingNo;
//        }

        // Without SubString
        int count = 0;
        for(int i = 0 ; i<s.length() ; i++){
            System.out.print(s.charAt(i));
            count++;

            if(count == splitingNo){
                System.out.println();
                count = 0;
            }
        }

    }



}
