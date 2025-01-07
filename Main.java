// Save this file as Main.java
import com.example.encript.Hash_char;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Hash_char hs = new Hash_char();
            
            System.out.print("Enter the sentence: ");
            String s = sc.nextLine();
            
            char[] arr = s.toCharArray();
            int[] hash = new int[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                int res = hs.gethash(arr[i]);
                hash[i] = res;
            }
            
            for (int i = 0; i < hash.length; i++) {
                System.out.print(hash[i] + " ");
            }
        }
    }
}
