package com.example.demo.account.controller.form.normal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccountLoginRequestForm {
    final private String email;
    final private String password;
}