
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money plus = new Money(euros + added.euros, cents + added.cents);
        //Money added = new Money(euros, cents); tää ei käy!!
        return plus;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            return new Money(0, 0);
        } else {
            int newEuros = this.euros - decremented.euros;
            int newCents = this.cents - decremented.cents;
            if (this.cents < decremented.cents) {
                newEuros--;
                newCents = 100 - decremented.cents;
            }
            return new Money(newEuros, newCents);
        }
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

}
