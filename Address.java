package com;

public class Address {
	private int aId;
	private String city;
	private String state;
	/**
	 * @param aId
	 * @param city
	 * @param state
	 */
	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
