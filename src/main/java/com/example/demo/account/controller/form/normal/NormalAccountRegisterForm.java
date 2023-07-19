package com.example.demo.account.controller.form.normal;

import com.example.demo.account.service.request.NormalAccountRegisterRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public class NormalAccountRegisterForm {

    final private String email;
    final private String password;
    final private String name;
    final private int phoneNumber;


    public NormalAccountRegisterRequest toAccountRegisterRequest () {

        return new NormalAccountRegisterRequest(
                email, password, name, phoneNumber);
    }
}