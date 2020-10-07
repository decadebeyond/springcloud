package com.decademo.springcloud.dao;

import com.decademo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author  DECADEMO
 * @date  2020/10/4 19:19
 **/
@Mapper
public interface PaymentDao {

    @Insert("insert into payment(id,serial)" +
            " values(#{payment.id},#{payment.serial})")
    public  int create(@Param("payment") Payment payment);

    @Select("select id,serial from payment" +
            " where id = #{id}")
    public Payment getPaymentById(@Param("id") Long id);
}
