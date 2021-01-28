package avitepa.foundation.bank.bankservices.service.impl;

import avitepa.foundation.bank.bankservices.Repository.AccountRepo;
import avitepa.foundation.bank.bankservices.model.Account;
import avitepa.foundation.bank.bankservices.model.AccountType;
import avitepa.foundation.bank.bankservices.model.Address;
import avitepa.foundation.bank.bankservices.model.Customer;
import avitepa.foundation.bank.bankservices.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public List<Account> getAccounts() {

        List<Account> accountList=new ArrayList<>();
        accountRepo.findAll().forEach(account -> {accountList.add(populateAccount(account));});
        return accountList;
    }



    @Override
    public Account getAccount(int id) {

        return populateAccount(accountRepo.findById(Long.valueOf(id)).get());
    }

    @Override
    public Account createAccount(Account account) {
        return populateAccount(accountRepo.save(populateAccentity(account)));
    }



    @Override
    public Account updateAccount(Account account) {
        return populateAccount(accountRepo.save(populateAccentity(account)));
    }

    @Override
    public boolean deleteAccount(int id) {
        accountRepo.deleteById(Long.valueOf(id));
        return true;
    }


    private Account populateAccount(avitepa.foundation.bank.bankservices.Repository.entities.Account account) {
        Account acc = new Account();
        acc.setAccNum(account.getId());
        switch (account.getAccountType()){
            case "INDIVIDUAL": acc.setAccountType(AccountType.INDIVIDUAL);
            case "JOINT": acc.setAccountType(AccountType.JOINT);
            case "SAVINGS": acc.setAccountType(AccountType.SAVINGS);
            case "CHECKINGS": acc.setAccountType(AccountType.CHECKINGS);
                break;
        }

        acc.setBalance(account.getBalance());
        acc.setBranch(account.getBranch());
        acc.setPrimaryAccHolder(populateCustomer(account.getPrimaryAccHolder()));
        acc.setSecondaryAccHolder(populateCustomer(account.getSecondaryAccHolder()));
        return acc;
    }

    private Customer populateCustomer(avitepa.foundation.bank.bankservices.Repository.entities.Customer primaryAccHolder) {
        Customer customer = new Customer();

        customer.setId(primaryAccHolder.getId());
        customer.setFirstName(primaryAccHolder.getFirstName());
        customer.setLastName(primaryAccHolder.getLastName());
        customer.setPhoneNumber(primaryAccHolder.getPhoneNumber());
        if(primaryAccHolder.getAddress()!=null)
        customer.setAddress(populateAddress(primaryAccHolder.getAddress()));

        return customer;
    }

    private Address populateAddress(avitepa.foundation.bank.bankservices.Repository.entities.Address address) {
        Address addressModel = new Address();
        addressModel.setAddressId(address.getId());
        addressModel.setHouuseNo(address.getHouuseNo());
        addressModel.setStreetName(address.getStreetName());
        addressModel.setCity(address.getCity());
        addressModel.setState(address.getState());
        addressModel.setCountry(address.getCountry());
        return addressModel;
    }

    private avitepa.foundation.bank.bankservices.Repository.entities.Account populateAccentity(Account account) {
        avitepa.foundation.bank.bankservices.Repository.entities.Account accEntity =
                new avitepa.foundation.bank.bankservices.Repository.entities.Account();
        accEntity.setId(account.getAccNum());
        accEntity.setAccountType(account.getAccountType().name());


        accEntity.setBalance(account.getBalance());
        accEntity.setBranch(account.getBranch());
        accEntity.setPrimaryAccHolder(populateCustomerEntity(account.getPrimaryAccHolder()));
        accEntity.setSecondaryAccHolder(populateCustomerEntity(account.getSecondaryAccHolder()));

        return accEntity;
    }

    private avitepa.foundation.bank.bankservices.Repository.entities.Customer populateCustomerEntity(Customer customer) {
        avitepa.foundation.bank.bankservices.Repository.entities.Customer customerEntity =
                new avitepa.foundation.bank.bankservices.Repository.entities.Customer();
        customerEntity.setId(customer.getId());
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setPhoneNumber(customer.getPhoneNumber());
        if(customer.getAddress()!=null)
        customerEntity.setAddress(populateAddressEntity(customer.getAddress()));

        return customerEntity;
    }

    private avitepa.foundation.bank.bankservices.Repository.entities.Address populateAddressEntity(Address address) {
        avitepa.foundation.bank.bankservices.Repository.entities.Address addressEntity =
                new avitepa.foundation.bank.bankservices.Repository.entities.Address();
        addressEntity.setId(address.getAddressId());
        addressEntity.setHouuseNo(address.getHouuseNo());
        addressEntity.setStreetName(address.getStreetName());
        addressEntity.setCity(address.getCity());
        addressEntity.setState(address.getState());
        addressEntity.setCountry(address.getCountry());

        return addressEntity;
    }
}
