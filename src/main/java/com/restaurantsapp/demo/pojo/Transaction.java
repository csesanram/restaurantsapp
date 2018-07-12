package com.restaurantsapp.demo.pojo;

public class Transaction {
	private int id;
	private int amount, quantity, totalAmount;
	private CustomerInformation ci;


	public CustomerInformation getCi() {
		return ci;
	}

	public void setCi(CustomerInformation ci) {
		this.ci = ci;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getTotal() {
		return amount * quantity;
	}

	public void setTotal(int amount, int quantity) {
		this.amount = amount;
		this.quantity = quantity;
	}
	
	public void setTotalAfterCoupon(int totalAmount) {
			this.totalAmount = totalAmount;
	}
	
	public int getTotalAfterCoupon() {
		if(this.totalAmount == 0) {
			return getTotal();
		}
		return totalAmount;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", quantity=" + quantity + ", totalAmount="
				+ totalAmount + ", ci=" + ci + "]";
	}
	
}
