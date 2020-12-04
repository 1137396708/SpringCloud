package com.at.cloud.service.impl;

import com.at.cloud.dao.PaymetDAO;
import com.at.cloud.entities.Payment;
import com.at.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymenrServiceImpl implements PaymentService {
    @Resource
    private PaymetDAO paymetDAO;

    @Override
    public int create(Payment payment) {
        return paymetDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymetDAO.getPaymentById(id);
    }
}
