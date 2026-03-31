import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
        
        // TODO: Read N
        // TODO: Read N strings into an array
        // TODO: Sort the strings using a custom comparator
        // Comparator logic: (str1, str2) -> (str2 + str1).compareTo(str1 + str2)
        // TODO: Handle edge case where all numbers are "0" (e.g. input 0 0 -> output "0")
        // TODO: Concatenate sorted strings and print
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String[] s = new String[n];
                for(int i=0; i<n; i++){
                        s[i] = sc.next();
                }
                Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
                if(s[0].equals("0")){
                        System.out.println("0");
                        return;
                }
                StringBuilder result = new StringBuilder();
                for(String s1 : s){
                        result.append(s1);
                }
                System.out.println(result.toString());
        }
}
