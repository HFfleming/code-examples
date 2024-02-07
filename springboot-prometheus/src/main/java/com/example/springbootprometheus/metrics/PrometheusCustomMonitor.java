package com.example.springbootprometheus.metrics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class PrometheusCustomMonitor {
    // 定义一个计数器类型的指标
    /**
     * private Counter orderTotal;
     *     private  DistributionSummary  amountSum;
     *
     *     private final MeterRegistry registry;
     *
     *     @Autowired
     *     public PrometheusCustomMonitor(MeterRegistry registry){
     *         this.registry = registry;
     *     }
     *     @PostConstruct
     *     private void  init () {
     *         //  通过注册器定义一个名为order_request_count的计数器指标，打上标签，然后赋值
     *         orderTotal = registry.counter("order_request_total","order","java_metrics_test");
     *         amountSum = registry.summary("order_amount","orderAmount","java_metrics_test");
     *     }
     *     public Counter getOrderTotal(){
     *         return orderTotal;
     *     }
     *     public DistributionSummary getAmountSum(){
     *         return amountSum;
     *     }
     */





}
