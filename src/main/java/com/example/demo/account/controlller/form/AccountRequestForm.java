package com.example.demo.account.controlller.form;

import com.example.demo.account.entity.Account;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccountRequestForm {

    final private String email;
    final private String password;

    public Account toTestAccount() {
        return new Account(email, password);
    }
}