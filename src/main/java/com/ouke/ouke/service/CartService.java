package com.ouke.ouke.service;

import com.ouke.ouke.po.Cart;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface CartService {
    List<Cart> getCartList(Cart cart);
    public Integer mutiDelete(Integer[] ids);
    //修改数量
    public Integer updateQuantity(Cart cart);

    public Integer insert(Cart cart);

    //删除购物车数据
    public Integer delete(Cart cart);
}
