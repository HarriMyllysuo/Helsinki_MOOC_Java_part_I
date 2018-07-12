
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Phonebook phonebook = new Phonebook();
        
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-789456");
        phonebook.add("Donald Trumppi", "050-666666");
        
        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println(number);
        
        number = phonebook.searchNumber("Matti Tunari");
        System.out.println(number);
    }
}
