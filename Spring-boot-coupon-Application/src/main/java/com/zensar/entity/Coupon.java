package com.zensar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	private String couponCode;
	private String expDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String expDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.expDate = expDate;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getexpDate() {
		return expDate;
	}

	public void setexpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", expDate=" + expDate + "]";
	}

}