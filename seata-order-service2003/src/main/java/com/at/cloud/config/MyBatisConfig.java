package com.at.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.george.springcloud.alibaba.dao")
public class MyBatisConfig {
}
