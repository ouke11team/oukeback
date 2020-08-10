package com.ouke.ouke.service;

import com.ouke.ouke.po.Food;

import java.util.List;

public interface FoodService {
    List<Food> selectFoodList(Food food);
}
