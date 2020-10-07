package com.decademo.springcloud.controller;

import com.decademo.springcloud.entities.CommonResult;
import com.decademo.springcloud.entities.Payment;
import com.decademo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author  DECADEMO
 * @date  2020/10/4 19:31
 **/
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
//        log.info("******插入结果：" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功,serverPort:" + serverPort,result);
        }else{
            return new CommonResult(444,"插入数据失败,serverPort:" + serverPort,null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******获取结果：" + payment);
        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort:" + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询失败,serverPort:" + serverPort,null);
        }
    }
}
