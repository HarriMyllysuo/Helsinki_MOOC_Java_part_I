
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number) {
        persons.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person person : this.persons) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        for (Person person : this.persons) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
