package com.restaurantsapp.demo.pojo;

public class Offer {
	public enum Day{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;}
	private Transaction transInformation;
	private int applyOffer;
	
	public Transaction getTransInformation() {
		return transInformation;
	}

	public void setTransInformation(Transaction transInformation) {
		this.transInformation = transInformation;
	}

	public int getAfterApplyOffer() {
		int total = this.transInformation.getTotal();
		applyOffer = total-applyOffer;
		
		return applyOffer;
	}

	public void setApplyOffer(Day day) {
        switch (day)
        {
        case Monday:
        case Tuesday:
        case Wednesday:
        case Thursday:
        case Friday:
        case Saturday:
            this.applyOffer = 5;
            break;
        case Sunday:
        		this.applyOffer = 2;
            break;
        }
	}
	
}
