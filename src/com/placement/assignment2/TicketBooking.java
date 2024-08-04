package com.placement.assignment2;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking() {
		super();
		this.stageEvent = "N/A";
		this.customer = "N/A";
		this.noOfSeats = 0;
	}
	
	//for cash payment 
	public  void makePayment(Double amount) {
		System.out.println("Stage event:"+this.getStageEvent());
		System.out.println("Customer:"+this.getCustomer());
		System.out.println("Number of seats:"+this.getNoOfSeats());
		System.out.println("Amount "+amount+" paid in cash");
	}
	//for wallet payment
	public void makePayment(String walletNumber,Double amount) {
		System.out.println("Stage event:"+this.getStageEvent());
		System.out.println("Customer:"+this.getCustomer());
		System.out.println("Number of seats:"+this.getNoOfSeats());
		System.out.println("Amount"+amount+"paid using wallet number "+walletNumber);
		
	}
	//for credit card 
	public void makePayment(String creditCard,String ccv,String name,Double amount) {
		System.out.println("Stage event:"+this.getStageEvent());
		System.out.println("Customer:"+this.getCustomer());
		System.out.println("Number of seats:"+this.getNoOfSeats());
		System.out.println("Amount "+amount+" paid using "+creditCard+" card");
		System.out.println("CCV:"+ccv);
	}
	
	

}
