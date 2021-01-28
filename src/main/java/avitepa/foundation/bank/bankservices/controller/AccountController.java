package avitepa.foundation.bank.bankservices.controller;

import avitepa.foundation.bank.bankservices.model.Account;
import avitepa.foundation.bank.bankservices.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/")
    public List<Account> getAccounts(){

        return accountService.getAccounts();
    }

    @GetMapping ("/{id}")
    public Account getAccount(@PathVariable int id){

        return accountService.getAccount(id);
    }

    @PostMapping("/")
    public Account createAccount(@RequestBody Account account){


        return accountService.createAccount(account);
    }

    @PutMapping("/")
    public Account updateAccount(@RequestBody Account account){

        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAccount(@PathVariable int id){

        return accountService.deleteAccount(id);
    }


}
