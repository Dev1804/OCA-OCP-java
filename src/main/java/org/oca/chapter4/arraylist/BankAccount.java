package org.oca.chapter4.arraylist;

public class BankAccount {
    String acctNumber;
    int acctType;

    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            return (acctNumber.equals(b.acctNumber)) && (acctType == b.acctType);
        }
        else
            return false;
    }
}
