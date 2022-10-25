package org.oca.chapter4.arraylist;

class BankAccount1 {
    String acctNumber;
    int acctType;
    public boolean equals(Object obj) {
        if (obj != null) {
            BankAccount1 b = (BankAccount1) obj;
            return (acctNumber.equals(b.acctNumber) &&
                    acctType == b.acctType);
        }
        else
            return false;
    }
}
