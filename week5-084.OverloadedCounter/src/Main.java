public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter(5, false);
        //c.decrease();
        //System.out.println(c.value());
        
        //c.decrease(-2);
        c.increase(-2);
        System.out.println(c.value());
    }
}
