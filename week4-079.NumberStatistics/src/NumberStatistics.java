
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers += 1;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (double)sum() / this.amountOfNumbers;
        }
    }
}
