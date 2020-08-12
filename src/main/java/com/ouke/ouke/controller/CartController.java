package com.ouke.ouke.controller;

import com.ouke.ouke.po.Cart;
import com.ouke.ouke.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @RequestMapping("/listbyuser")
    public List<Cart> getCartList(Cart cart){
        return cartService.getCartList(cart);
    }
    //批量删除
    @RequestMapping("/mutidelete")
    public Integer mutiDelete(@RequestBody Integer[] ids){//ids:[]
//        System.out.println("+++++++++++++++"+ids);
        return cartService.mutiDelete(ids);
    }

    //map类型参数，适用于参数多样化（参数不能匹配实体类的属性）
    //根据id修改数量
    @RequestMapping("/updatequantity")
    public Integer updateQuantity(Cart cart){
//        System.out.println("++++++++++++++++++++++++"+map);
        return cartService.updateQuantity(cart);
    }

    //添加商品到购物车
    @RequestMapping("/insert")
    public Integer insert(Cart cart){
        return cartService.insert(cart);
    }
    @RequestMapping("/delete")
    public Integer delete(Cart cart){
        return cartService.delete(cart);
    }
}
