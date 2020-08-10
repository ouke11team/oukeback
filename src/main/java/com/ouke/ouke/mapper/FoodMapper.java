package com.ouke.ouke.mapper;

import com.ouke.ouke.po.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface FoodMapper {
    List<Food> selectFoodList(Food food);
    @Select("select * from food where foodId=#{foodId} order by foodId")
    Food getFoodById(Integer foodId);
}
