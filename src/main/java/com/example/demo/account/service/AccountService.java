package com.example.demo.account.service;

import com.example.demo.account.service.request.NormalAccountRegisterRequest;
import com.example.demo.account.controller.form.normal.AccountLoginRequestForm;

public interface AccountService {
    Boolean normalAccountRegister(NormalAccountRegisterRequest request);
    String login(AccountLoginRequestForm accountLoginRequestForm);
}