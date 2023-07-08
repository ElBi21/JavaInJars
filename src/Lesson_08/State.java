package Lesson_08;

public class State {
    public String name; // Name of the state
    private String currency; // Name of its currency
    private int reserves; // Gold reserves
    private int amount = 0; // Total value of minted coins

    public class Coin { // Inner class
        int value;

        public Coin (int value) {
            this.value = value; // In this case, the "this" keyword denotes the inner object
            (State.this).amount = (State.this).amount + value;
            // amount = amount + value;
            // State.this denotes the outer object, it allows us to select precisely the State to which the coin belongs
        }

        public void printValue () {
            System.out.println("Bank of " + name);
            System.out.print(value + " " + currency + " (Total amount of " + amount + " coins minted)\n");
            System.out.println("(Value in gold: " + (State.this).valueInGold(this) + " Kg)");
            // Each Coin object is based on a State object. Since this is an inner class, we can access freely
            // to all the attributes from within the class
        }

        public void printValueWithThis () {
            System.out.println("Bank of " + (State.this).name);
            System.out.print(value + " " + (State.this).currency + " (Total amount of " +
                    (State.this).amount + " coins minted)\n");
            System.out.println("(Value in gold: " + (State.this).valueInGold(this) + " Kg)");
        }
    }

    public State (String name, String currency, int reserves) {
        this.name = name;
        this.currency = currency;
        this.reserves = reserves;
    }

    public int valueInGold (Coin m) {
        return (reserves/amount) * m.value;
    }

    public Coin mint (int v) {
        return new Coin(v);
    }
}
