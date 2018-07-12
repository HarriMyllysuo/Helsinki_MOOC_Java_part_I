import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private final int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        char symbol;
        String password = "";
        while (i < this.length) {
            int number = random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
            i++;
        }
        return password;
    }
}
