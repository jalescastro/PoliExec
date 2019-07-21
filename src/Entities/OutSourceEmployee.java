package Entities;

public class OutSourceEmployee extends Employee{
	
	private Double addtionalCharge;
	
	public OutSourceEmployee () {
		super();
	}
	
	public OutSourceEmployee (String name, Integer hours,Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
		
	}

	public Double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (getAddtionalCharge()* 1.1);
	}
	   
	

}
