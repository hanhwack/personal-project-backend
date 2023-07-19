package com.example.demo.account.controller;

import com.example.demo.account.controller.form.normal.NormalAccountRegisterForm;
import com.example.demo.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/account-page")
public class AccountController {

    final private AccountService accountService;

    // 일반 회원
    @PostMapping("/register")
    public Boolean normalAccountRegister (@RequestBody NormalAccountRegisterForm registerForm) {
        return accountService.normalAccountRegister(registerForm.toAccountRegisterRequest());
    }
}