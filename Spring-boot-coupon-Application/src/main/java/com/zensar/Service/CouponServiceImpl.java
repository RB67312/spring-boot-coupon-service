package com.zensar.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.Repository.CouponRepository;
import com.zensar.dto.CouponDto;
import com.zensar.entity.Coupon;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponrepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {
		Coupon coupon = couponrepository.findById(couponId).get();

		return modelMapper.map(coupon, CouponDto.class);
		
	}

	@Override
	public List<CouponDto> getAllCoupon() {
		List<Coupon> listOfCoupons = couponrepository.findAll();
		List<CouponDto> listOfDto = new ArrayList<CouponDto>();
		for (Coupon coupon : listOfCoupons) {
			//listOfDto.add(mapToDto(coupon));
			listOfDto.add(modelMapper.map(coupon, CouponDto.class));
		}

		return listOfDto;
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		//Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		Coupon insertedCoupon = couponrepository.save(coupon);
		return modelMapper.map(insertedCoupon,CouponDto.class);
		
	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		//Coupon coupon = mapToEntity(couponDto);
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		couponrepository.save(coupon);

	}

	@Override
	public void deleteCoupon(int couponId) {
		couponrepository.deleteById(couponId);
	}
	
}