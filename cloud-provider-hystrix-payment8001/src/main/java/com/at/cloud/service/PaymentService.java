package com.at.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"   payment_OK,id:"+id+"\t"+"haha";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public String payment_TimeOut(Integer id){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+"   payment_TimeOut,id:"+id+"\t"+"haha"+"   耗时3秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"   paymentInfo_TimeOutHandler,id:"+id+"\t"+"haha"+" 兜底方法";
    }
}
