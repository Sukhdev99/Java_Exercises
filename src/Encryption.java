import java.util.Scanner;

public class Encryption {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int SHIFT = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a string of characters:");
        String s = scanner.nextLine();
        String toEncode = "";
        String chainCoded = "";

        for (char c : s.toCharArray()) {
            if (ALPHABET.indexOf(Character.toLowerCase(c)) != -1 || c == ' ') {
                toEncode += c;
            }
        }

        for (char c : toEncode.toCharArray()) {
            char newChar;
            if (c == ' ') {
                newChar = ' ';
            } else {
                int index = (ALPHABET.indexOf(Character.toLowerCase(c)) + SHIFT) % 26;
                newChar = Character.isUpperCase(c) ?
                        Character.toUpperCase(ALPHABET.charAt(index)) :
                        ALPHABET.charAt(index);
            }
            chainCoded += newChar;
        }

        System.out.format("The initial chain was: '%s'\n", s);
        if (toEncode.isEmpty()) {
            System.out.println("The string to encode is empty.\n");
        } else {
            System.out.format("The string to encode is: '%s'\n", toEncode);
            System.out.format("The coded string is: '%s'\n", chainCoded);
        }
    }
}
