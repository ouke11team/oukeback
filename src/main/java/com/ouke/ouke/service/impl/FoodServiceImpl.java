package com.ouke.ouke.service.impl;

import com.ouke.ouke.mapper.FoodMapper;
import com.ouke.ouke.po.Food;
import com.ouke.ouke.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> selectFoodList(Food food){
        return foodMapper.selectFoodList(food);
    }
}
