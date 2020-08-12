package com.ouke.ouke.service.impl;

import com.ouke.ouke.mapper.BusinessMapper;
import com.ouke.ouke.po.Business;
import com.ouke.ouke.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;

    @Override
    public List<Business> selectBusinessList(Business business) {
        return businessMapper.selectBusinessList(business);
    }

}