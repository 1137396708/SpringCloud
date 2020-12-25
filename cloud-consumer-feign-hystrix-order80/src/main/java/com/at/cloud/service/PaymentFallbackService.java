package com.at.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----paymentInfo_OK   fallback";
    }

    @Override
    public String payment_TimeOut(Integer id) {
        return "------payment_TimeOut   falllback";
    }
}
