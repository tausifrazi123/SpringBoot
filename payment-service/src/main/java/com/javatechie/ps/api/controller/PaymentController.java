package com.javatechie.ps.api.controller;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.repository.PaymentRepository;
import com.javatechie.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }
    @PostMapping
    public String paymentProcessing(){
        //api should be third party payment gateway i.e. paypal
        return new Random().nextBoolean() ? "success":"false";
    }
}
