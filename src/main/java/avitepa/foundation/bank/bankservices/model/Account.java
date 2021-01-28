package avitepa.foundation.bank.bankservices.model;

public class Account {

    private long accNum;

    private AccountType accountType;

    private float balance;

    private String branch;

    private Customer primaryAccHolder;

    private Customer secondaryAccHolder;

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Customer getPrimaryAccHolder() {
        return primaryAccHolder;
    }

    public void setPrimaryAccHolder(Customer primaryAccHolder) {
        this.primaryAccHolder = primaryAccHolder;
    }

    public Customer getSecondaryAccHolder() {
        return secondaryAccHolder;
    }

    public void setSecondaryAccHolder(Customer secondaryAccHolder) {
        this.secondaryAccHolder = secondaryAccHolder;
    }
}
