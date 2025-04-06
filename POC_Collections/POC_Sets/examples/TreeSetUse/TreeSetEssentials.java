package TreeSetUse;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetEssentials {
    public static void main(String[] args) {

        /*automatic organize - Integer implements comparable
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(4);

        System.out.println(set);
        */


        /*
            if AccountOrdering not implements comparable - ClassCastException
        */

        //alphabetical order with number
        //var set = new TreeSet<AccountOrdering>(new AccountComparator()); //Comparator is priority Comparable

        var set = new TreeSet<>(Comparator.comparing(AccountOrdering::getBalance)).reversed(); // another way

        set.add(new AccountOrdering("0321", 100));
        set.add(new AccountOrdering("0123", 1400));
        set.add(new AccountOrdering("0032", 300));
        set.add(new AccountOrdering("3123", 200));

        for(AccountOrdering account: set){
            System.out.println(account);
        }
    }
}
