import com.example.encript.Hash_char;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Hash_char hs = new Hash_char();
            Random random = new Random();
            char[] randomChars = {'@', '#', '$', '%', '&', '*'};
            
            System.out.print("Enter the sentence: ");
            String s = sc.nextLine();
            
            char[] arr = s.toCharArray();
            int[] hash = new int[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                int res = hs.gethash(arr[i]);
                hash[i] = res;
            }
            
            for (int i = 0; i < hash.length; i++) {
                System.out.print(hash[i]);
                if (i < hash.length - 1) {
                    char randomChar = randomChars[random.nextInt(randomChars.length)];
                    System.out.print(randomChar);
                }
            }
        }
    }
}
