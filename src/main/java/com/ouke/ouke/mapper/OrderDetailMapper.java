package com.ouke.ouke.mapper;

import com.ouke.ouke.po.OrderDetail;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    //查询订单明细的同时，需要查询所属食品信息（多对一）
    List<OrderDetail> selectOrderDetailByOrderId(Integer orderId);

    public int saveOrderDetailetBatch(List<OrderDetail> list);}
