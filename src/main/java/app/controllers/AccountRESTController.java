package app.controllers;

import app.model.Account;
import app.model.AccountDTO;
import app.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountRESTController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> getAccount(@RequestBody AccountDTO accnt) {
        System.out.println("Requested Account Number :" + accnt.getAccountNo());
        Account account = accountService.getAccount(accnt.getAccountNo());
        if (account == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(account);
    }

}