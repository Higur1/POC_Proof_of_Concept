package TreeSetUse;

import java.util.Comparator;

public class AccountComparator implements Comparator<AccountOrdering> {

    @Override
    public int compare(AccountOrdering o1, AccountOrdering o2) {
        return -Double.compare(o1.getBalance(), o2.getBalance());
    }
}
