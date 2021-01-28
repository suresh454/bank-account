package avitepa.foundation.bank.bankservices.Repository.entities;

import avitepa.foundation.bank.bankservices.model.AccountType;

import javax.persistence.*;

import avitepa.foundation.bank.bankservices.Repository.entities.Customer;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String accountType;

    private float balance;

    private String branch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "primary_acc_holder_id", referencedColumnName = "id")
    private Customer primaryAccHolder;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "secondary_acc_holder_id", referencedColumnName = "id")
    private Customer secondaryAccHolder;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
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
