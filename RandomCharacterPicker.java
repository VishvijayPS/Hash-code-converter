import java.util.Random;

public class RandomCharacterPicker {

    public static void main(String[] args) {
        // Step 1: Define the array of characters
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

        // Step 2: Specify the number of characters to pick
        int count = 3;

        // Step 3: Pick random characters
        char[] randomCharacters = pickRandomCharacters(characters, count);

        // Step 4: Display the result
        System.out.println("Randomly picked characters: ");
        for (char ch : randomCharacters) {
            System.out.print(ch + " ");
        }
    }

    public static char[] pickRandomCharacters(char[] array, int count) {
        if (count > array.length) {
            throw new IllegalArgumentException("Count cannot be greater than the array length.");
        }

        Random random = new Random();
        char[] result = new char[count];
        boolean[] used = new boolean[array.length]; // To ensure unique picks

        int picked = 0;
        while (picked < count) {
            int index = random.nextInt(array.length); // Random index
            if (!used[index]) { // Check if the character is already picked
                result[picked++] = array[index];
                used[index] = true;
            }
        }

        return result;
    }
}
