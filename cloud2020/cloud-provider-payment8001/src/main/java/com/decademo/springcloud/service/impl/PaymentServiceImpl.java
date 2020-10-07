package com.decademo.springcloud.service.impl;

import com.decademo.springcloud.dao.PaymentDao;
import com.decademo.springcloud.entities.Payment;
import com.decademo.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author  DECADEMO
 * @date  2020/10/4 19:31
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
