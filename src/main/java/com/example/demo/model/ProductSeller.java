package com.example.demo.model;

public class ProductSeller {
	private String sellerName;
	private int count;
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "ProductSeller [sellerName=" + sellerName + ", count=" + count + "]";
	}	
}
