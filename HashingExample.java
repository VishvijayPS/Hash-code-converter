import java.security.MessageDigest;

public class HashingExample {
    public static void main(String[] args) throws Exception {
        // Input Message
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            // Input Message
            System.out.print("Enter your message: ");
            String message = sc.nextLine();
            
            // Choose Hashing Algorithm
            System.out.println("Available Algorithms: SHA-256, MD5");
            System.out.print("Choose an algorithm: ");
            String algorithm = sc.nextLine();
            
            // Generate Hash
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hash = digest.digest(message.getBytes("UTF-8"));
            
            // Convert Byte Array to Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            
            System.out.println("The hash of your message using " + algorithm + " is: " + hexString.toString());
        }
    }
}
