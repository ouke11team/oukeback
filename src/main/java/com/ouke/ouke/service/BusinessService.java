package com.ouke.ouke.service;

import com.ouke.ouke.po.Business;

import  java.util.List;

public interface BusinessService {
    List<Business> selectBusinessList(int orderTypeId);

}
