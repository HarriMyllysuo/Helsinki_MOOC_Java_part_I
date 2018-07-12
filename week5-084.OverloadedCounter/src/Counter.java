
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
        
    }
    
    public Counter(int startingValue) {
        this.value = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }
    
    public Counter() {
        //this.value = 0;
        //this.check = false;
        this(0, false);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value += 1;
    }
    
    public void decrease() {
        if (check) {
            if (this.value > 0) {
                this.value -= 1;
            }
        } else {
            this.value -= 1;
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (check) {
            if (this.value < (0 + decreaseAmount)) {
                this.value = 0;
            }
        } else if (decreaseAmount < 0) {
            
        } else {
            this.value -= decreaseAmount;
        }
    }
}
