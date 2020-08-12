package com.ouke.ouke.service;

import com.ouke.ouke.po.Business;
import org.springframework.stereotype.Service;

import  java.util.List;

@Service
public interface BusinessService {
    List<Business> selectBusinessList(Business business);

}
