package SetsUse;

import java.util.HashSet;
import java.util.Set;

public class SetsUse {
    public static void main(String[] args) {
        Account a1 = new Account("123", 100);
        Account a2 = new Account("456", 200);
        Account a3 = new Account("456", 200); //permitted
        Account a4 = a3; //IllegalArgumentException: duplicate element: Account{number='456', balance=200.0} reference heap

        //immutable
        //var accounts = Set.of(a1, a2, a3/*, a4*/);
        var accounts = new HashSet<Account>();
        accounts.add(a1);
        accounts.add(a2);
        /*
            After override the hashCode and equals methods in the Account class, it is not possible to add a new
            account with the same elements even using "new"
        */
        accounts.add(a3);
        for(Account account: accounts){
            System.out.println(account);
        }
    }
}
