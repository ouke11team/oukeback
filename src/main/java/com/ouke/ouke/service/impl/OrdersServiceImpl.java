package com.ouke.ouke.service.impl;

import com.ouke.ouke.po.Orders;
import com.ouke.ouke.po.Cart;
import com.ouke.ouke.po.Business;
import com.ouke.ouke.po.OrderDetail;
import com.ouke.ouke.mapper.CartMapper;
import com.ouke.ouke.mapper.BusinessMapper;
import com.ouke.ouke.mapper.OrdersMapper;
import com.ouke.ouke.mapper.OrderDetailMapper;
import com.ouke.ouke.service.OrdersService;
import com.ouke.ouke.util.CommonUtil;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private BusinessMapper businessMapper;
    @Resource
    private OrderDetailMapper orderDetailMapper;

    //Controller需要传递过来三个参数：userId,businessId,daId,和需要下单的购物车记录id数组
    @Override
    @Transactional
    public int createOrders(Orders orders,Integer[] cartIds) {
        int orderId = 0;
        //1、查询当前用户购物车中下订单的列表
        List<Cart> cartList = cartMapper.getCartListByIds(cartIds);
        //2、查询商家信息（需要使用商家的配送费信息）
        Business business = businessMapper.getBusinessById(orders.getBusinessId());
        //3、获取订单总额
        Double ordersTotal = 0.0;  //订单总额
        for(Cart c : cartList) {
            //累计所有食品总价格
            ordersTotal += c.getFood().getFoodPrice()*c.getQuantity();
        }
        //加上配送费
        ordersTotal += business.getDeliveryPrice();
        //4、创建订单，并获取订单编号（已有userId,businessId,daId，再需要添加ordersTotal、orderDate数据）
        orders.setOrderTotal(ordersTotal);
        orders.setOrderDate(CommonUtil.getCurrentDate());
        //这里就不获取insert返回值了，因为没有什么用
        orderId = ordersMapper.saveOrders(orders);
        //这里获取insert后，自增列返回的orderId
        orderId = orders.getOrderId();
        //5、处理相关数据：获取订单明细集合
        List<OrderDetail> orderDetailList = new ArrayList<>();  //订单明细集合
        for(Cart c : cartList) {
            OrderDetail od = new OrderDetail();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            orderDetailList.add(od);
        }
        //6、批量添加订单明细
        orderDetailMapper.saveOrderDetailetBatch(orderDetailList);
        //7、清空当前用户购物车中需下订单的食品
        cartMapper.mutiDelete(cartIds);
        return orderId;
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }
}
