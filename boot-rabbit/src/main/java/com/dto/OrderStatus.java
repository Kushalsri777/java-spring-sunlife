package com.dto;

public class OrderStatus {
	private Orders orders;
	private String status;
	private String message;
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public OrderStatus(Orders orders, String status, String message) {
		super();
		this.orders = orders;
		this.status = status;
		this.message = message;
	}
	public OrderStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderStatus [orders=" + orders + ", status=" + status + ", message=" + message + "]";
	}
	
}
