public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        if (this.cents - decreaser.cents < 0) {
            Money newMoney = new Money(this.euros - decreaser.euros - 1, 100 - decreaser.cents);
            return newMoney;
        } else {
            Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);

            if (newMoney.euros < 0) {
                newMoney = new Money(0, 0);
            }

            return newMoney;
        }
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
