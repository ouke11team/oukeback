package com.ouke.ouke.service.impl;

import com.ouke.ouke.mapper.CartMapper;
import com.ouke.ouke.po.Cart;
import com.ouke.ouke.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartMapper cartMapper;

    @Override
    public List<Cart> getCartList(Cart cart) {
        return cartMapper.getCartList(cart);
    }

    //批量删除
    @Override
    public Integer mutiDelete(Integer[] ids) {
        return cartMapper.mutiDelete(ids);
    }

    @Override
    public Integer updateQuantity(Cart cart) {
        return cartMapper.updateQuantity(cart);
    }

    @Override
    public Integer insert(Cart cart) {
        return cartMapper.insert(cart);
    }

    @Override
    public Integer delete(Cart cart) {
        return cartMapper.delete(cart);
    }
}
