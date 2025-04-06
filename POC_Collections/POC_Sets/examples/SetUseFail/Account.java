package SetUseFail;

import java.util.Objects;

public class Account {
    private final String number;
    private final double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        //wrong way
        return (int) (Math.random()*1000);
        //return 1;

        //right way
        //return Objects.hash(number, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
