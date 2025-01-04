import java.util.*;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Hash_Value = "hari ram";
        char [] Hash_Array = Hash_Value.toCharArray();
        // System.out.println("Enter the String to Hash :");
        // Hash_Value = sc.nextLine();
        System.out.println("The value is :"+ Hash_Array[0]);

        for (int i = 0;i < Hash_Array.length;i++){
            System.out.println(Hash_Array[i]);
            System.out.println();
        }
        sc.close();
    }
}