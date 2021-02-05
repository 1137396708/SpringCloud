package com.at.cloud.dao;

import com.at.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}

