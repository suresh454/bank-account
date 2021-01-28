package avitepa.foundation.bank.bankservices.controller;

import avitepa.foundation.bank.bankservices.model.Transfer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class TransferController {


    @PostMapping
    public boolean transferFunds(@RequestBody Transfer transfer){

        return false;
    }
}
