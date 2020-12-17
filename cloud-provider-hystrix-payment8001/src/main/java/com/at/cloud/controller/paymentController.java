package com.at.cloud.controller;

import com.at.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("****result:"+result);
        return result;
    }


    @GetMapping("/payment/hystrix/timeOut/{id}")
    public String payment_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.payment_TimeOut(id);
        log.info("****result:"+result);
        return result;
    }
}
