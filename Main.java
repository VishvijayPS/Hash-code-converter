import com.example.encript.Hash_char;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Hash_char hs = new Hash_char();
            Random random = new Random();
            char[] randomChars = {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U','v', 'w', 'x', 'y', 'z','j', 'k', 'l', 'm','@','#','$','&'};

            System.out.print("Enter the sentence: ");
            String input = sc.nextLine();

            String hashedString = convertAndLoadToString(input, hs, randomChars, random);

            System.out.println("KeyQuill hash value :");
            System.out.println(hashedString);
        }
    }

    public static String convertAndLoadToString(String input, Hash_char hashCharHandler, char[] randomChars, Random random) {
        char[] arr = input.toCharArray();
        int lt = arr.length;
        StringBuilder result = new StringBuilder();
        String hlt = Integer.toHexString(lt);
        result.append(hlt);
        if (result.length() < 4) {
            addRandomCharacters(result, randomChars, 4 - result.length(),random);
        }
        for (int i = 0; i < arr.length; i++) {
            int hashValue = hashCharHandler.gethash(arr[i]);
            String hexadecimal = Integer.toHexString(hashValue * lt);
            result.append(hexadecimal);

            if (i < arr.length - 1) {
                char randomChar = randomChars[random.nextInt(randomChars.length)];
                result.append(randomChar);
            }
        }

        return result.toString();
    }

    public static void addRandomCharacters(StringBuilder result, char[] randomChars, int numChars, Random random) {
        for (int i = 0; i < numChars; i++) {
            char randomChar = randomChars[random.nextInt(randomChars.length)];
            result.append(randomChar);
        }
    }
}
