// Matthew Torontali
// 8/26/20
// Decrypt shift cipher
// Some code ideas from Arup Guha

import java.util.Scanner;

public class Shift
{
    public static void main(String []args)
    {
        // initialize scanner object and variables
        Scanner scanner = new Scanner(System.in);
        String message;
        int key;
        int length;

        // get message and key from user
        System.out.println("Enter an encrypted message to decrypt: ");
        message = scanner.nextLine();
        // make sure message is all uppercase
        message = message.toUpperCase();
        System.out.println("Enter a key, 0 to 25: ");
        key = scanner.nextInt();

        // get length of message
        length = message.length();

        // Code idea from Arup Guha
        // Subtract the key to get the ciphertext. We have to add 26 to map the value back to a matching positive value
        // because of how mod works in java. We add 'A' to get back to the correct Ascii value. Then we convert the
        // ascii value to string with the Character.toString() method.
        for (int i = 0; i < length; i++)
        {
            System.out.print(Character.toString((message.charAt(i) - 'A' - key + 26)%26 + 'A'));
        }
        System.out.println("\n");
    }
}