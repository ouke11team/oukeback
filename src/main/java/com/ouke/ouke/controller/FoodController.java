package com.ouke.ouke.controller;

import com.ouke.ouke.po.Food;
import com.ouke.ouke.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<Food> getFoodListByBusinessId(Food food){
        return foodService.selectFoodList(food);
    }
}
