package com.zensar.dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String expDate;

	public CouponDto() {
		super();
	}

	public CouponDto(int couponId, String couponCode, String expDate) {
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

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", expDate=" + expDate + "]";
	}

}