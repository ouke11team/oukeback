package com.ouke.ouke.controller;

import com.ouke.ouke.po.Business;
import com.ouke.ouke.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @RequestMapping("/list")
    public List<Business> getBusinessList(Business business){
        return businessService.selectBusinessList(business.getOrderTypeId());
    }
}
