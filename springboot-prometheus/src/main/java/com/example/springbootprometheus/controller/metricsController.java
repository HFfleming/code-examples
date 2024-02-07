package com.example.springbootprometheus.controller;

import com.example.springbootprometheus.metrics.PrometheusCustomMonitor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class metricsController {
    @Resource
    private PrometheusCustomMonitor monitor;
    @RequestMapping("/order")
    public String order() throws Exception {
        // 统计下单次数
        Random random = new Random();
        int amount = random.nextInt(1000);
        String orderInfo = "下单成功，下单金额：" + amount;
        return  "下单成功,下单金额: " + amount;
    }

}
