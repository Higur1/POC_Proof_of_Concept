package TreeSetUse;

import java.util.Objects;

public class AccountOrdering implements Comparable<AccountOrdering>{
    private final String number;
    private final double balance;

    public AccountOrdering(String number, double balance) {
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
    public String toString() {
        return "AccountOrdering{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AccountOrdering that = (AccountOrdering) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }

    @Override
    public int compareTo(AccountOrdering o) {
        return this.number.compareTo(o.number);
    }
}
