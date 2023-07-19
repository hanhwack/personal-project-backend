package com.example.demo.account.service.request;

import com.example.demo.account.entity.Account;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class NormalAccountRegisterRequest {

    final private String email;
    final private String password;
    final private String name;
    final private int phoneNumber;


    public Account toAccount () {
        return new Account(email, password, name, phoneNumber);
    }
}