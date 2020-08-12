package com.ouke.ouke.mapper;

import com.ouke.ouke.po.Cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface CartMapper {
    List<Cart> getCartList(Cart cart);
    //批量删除
    public Integer mutiDelete(Integer[] ids);
    //修改数量
    public Integer updateQuantity(Cart cart);
    //删除购物车数据
    public Integer delete(Cart cart);
    @Insert("insert into `cart`(`foodId`,`businessId`,`userId`,`quantity`) values (#{foodId}, #{businessId}, #{userId},#{quantity})")
    public Integer insert(Cart cart);
    //根据多个cardId查询多个购物车记录
    List<Cart> getCartListByIds(Integer[] cartIds);
}
