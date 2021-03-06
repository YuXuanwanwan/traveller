package com.example.hotel.bl.coupon;

import com.example.hotel.po.Coupon;

import com.example.hotel.vo.OrderVO;

import java.text.ParseException;

public interface CouponMatchStrategy {

    boolean isMatch(OrderVO orderVO, Coupon coupon) throws ParseException;

}
