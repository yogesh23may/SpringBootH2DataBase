package com.example.demo.model;

public class Product {
	
	private int variantId;
	private int productId;
	private String size;	
	private String brand;
	private String color;
	private String seller;
	private double price;
	private int sku;
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	@Override
	public String toString() {
		return "Product [variantId=" + variantId + ", productId=" + productId + ", size=" + size + ", brand=" + brand
				+ ", color=" + color + ", seller=" + seller + ", price=" + price + ", sku=" + sku + "]";
	}	
}
