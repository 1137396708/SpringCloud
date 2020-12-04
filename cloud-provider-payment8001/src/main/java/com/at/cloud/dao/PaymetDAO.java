package com.at.cloud.dao;

import com.at.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymetDAO {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
