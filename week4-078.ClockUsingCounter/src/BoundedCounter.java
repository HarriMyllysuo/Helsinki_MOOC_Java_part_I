
public class BoundedCounter {
    private int value;
    private final int nextRoundValue = 0;
    private final int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value = this.value + 1;
        if (this.value > upperLimit) {
            this.value = this.nextRoundValue;
        }
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        if (0 <= value && value <= upperLimit) {
            this.value = value;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
