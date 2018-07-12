import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        String help = "";
        int i = text.length();
        String character;
        while (i > 0) {
            character = text.substring(i-1, i);
            help += character;
            i--;
        }
        return help;
    }

    public static boolean palindrome(String text) {
        // write code here
        String help = reverse(text);
        return help.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
