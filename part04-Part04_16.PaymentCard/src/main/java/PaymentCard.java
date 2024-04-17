public class PaymentCard {
    private double balance;

    // constructor - parameters allow for custom values instead default 0
    public PaymentCard(double openingBalance) {

        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance < 2.60) {
            this.balance -= 0;
        } else {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance < 4.60) {
            this.balance -= 0;
        } else {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        this.balance += amount;

        if (this.balance > 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance -= amount;
        }
    }

}
// closing class
