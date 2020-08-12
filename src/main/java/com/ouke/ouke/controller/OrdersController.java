package com.ouke.ouke.controller;

import com.ouke.ouke.po.Orders;
import com.ouke.ouke.service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    //需要传递4部分参数给List<Integer> ids，前三个参数：userId,businessId,daId，后面是需要下订单的cartIds
//	@RequestMapping("/saveOrderAndPay")
//	public String createOrders(PayInfo payInfo) throws Exception{
////		保存订单
//		Orders orders=new Orders();
//		orders.setDaId(payInfo.getDaId());
//		orders.setUserId(payInfo.getUserId());
//		orders.setBusinessId(payInfo.getBusinessId());
//		//支付
//		return "redirect:/pay/topay";
//	}


    @RequestMapping("/listOrdersByUserId")
    public List<Orders> listOrdersByUserId(Orders orders) throws Exception {
        return ordersService.listOrdersByUserId(orders.getUserId());
    }
}
