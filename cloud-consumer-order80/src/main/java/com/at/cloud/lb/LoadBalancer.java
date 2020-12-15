package com.at.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance instaces (List<ServiceInstance> serviceInstances);

}
