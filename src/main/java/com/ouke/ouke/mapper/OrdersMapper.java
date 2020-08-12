package com.ouke.ouke.mapper;

import com.ouke.ouke.po.Orders;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface OrdersMapper {
    @Insert("insert into orders(userId,businessId,orderDate,orderTotal,daId,orderState) values(#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
    @Options(useGeneratedKeys=true, keyProperty="orderId", keyColumn="orderId")
    public int saveOrders(Orders orders);


    List<Orders> listOrdersByUserId(String userId);
}
