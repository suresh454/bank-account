package avitepa.foundation.bank.bankservices.service;

import avitepa.foundation.bank.bankservices.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();

    Account getAccount(int id);

    Account createAccount(Account account);

    Account updateAccount(Account account);

    boolean deleteAccount(int id);
}
