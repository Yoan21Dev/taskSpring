package com.example.demoTest.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getHelloMessage() {
        return "¡Hola Mundo desde el servicio!";
    }
}