package com.zensar.Service;

import java.util.List;

import com.zensar.dto.CouponDto;
import com.zensar.entity.Coupon;

public interface CouponService {
	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupon();

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int couponId, CouponDto couponDto);

	public void deleteCoupon(int couponId);
}