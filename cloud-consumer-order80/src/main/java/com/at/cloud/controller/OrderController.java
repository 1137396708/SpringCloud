package com.at.cloud.controller;

import com.at.cloud.entities.CommonResult;
import com.at.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    //public static final String PRYMENT_URL = "http://localhost:8001";
    public static final String PRYMENT_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
        public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PRYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PRYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
