package com.ouke.ouke.mapper;

import com.ouke.ouke.po.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessMapper {
    List<Business> selectBusinessList(@Param("orderTypeId") int orderTypeId);
    @Select("select * from business where businessId=#{businessId} order by businessId")
    Business getBusinessById(Integer businessId);
}
