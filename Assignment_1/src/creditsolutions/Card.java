package creditsolutions;

public class Card {
    // Using defult constructors
    private int cardnumber;
    private double balance;
    private int pin;
    private boolean status;

    public Card () {

        cardnumber = 0;

        balance = 0.0;

        pin = 0;

        boolean status ;


    }
    //PRIMARY CONSTRUCTOR

    public Card(int cardnumber, double balance, int pin, boolean status) {
        this.cardnumber = cardnumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Card cardnumber= " + cardnumber + "\nbalance= " + balance + " \npin= " + pin + "\nstatus=" + status;
    }
    //Generating display method

    void display () {

        System.out.println(toString());
    }
}

