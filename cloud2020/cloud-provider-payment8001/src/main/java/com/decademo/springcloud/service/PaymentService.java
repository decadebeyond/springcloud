package com.decademo.springcloud.service;

import com.decademo.springcloud.entities.Payment;
/**
 * @author  DECADEMO
 * @date  2020/10/4 19:31
 **/
public interface PaymentService {

    public  int create(Payment payment);

    public Payment getPaymentById(Long id);
}
