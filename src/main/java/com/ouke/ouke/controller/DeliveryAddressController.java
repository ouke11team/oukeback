package com.ouke.ouke.controller;

import com.ouke.ouke.po.DeliveryAddress;
import com.ouke.ouke.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @RequestMapping("/listdelivery")
    public List<DeliveryAddress> listDeliveryAddressByUserId(DeliveryAddress deliveryAddress)throws Exception{
        return deliveryAddressService.listDeliveryAddressByUserId(deliveryAddress.getUserId());
    }

    @RequestMapping("/savedelivery")
    public int savaDeliveryAddress(DeliveryAddress deliveryAddress)throws Exception{
        return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
    }

    @RequestMapping("/removedelivery")
    public int removeDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception{
        return deliveryAddressService.removeDeliveryAddress(deliveryAddress.getDaId());
    }

    @RequestMapping("/getdelivery")
    public DeliveryAddress getDeliveryAddressById(DeliveryAddress deliveryAddress) throws Exception{
        return deliveryAddressService.getDeliveryAddressById(deliveryAddress.getDaId());
    }

    @RequestMapping("/updatedelivery")
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception{
        return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
    }

}
