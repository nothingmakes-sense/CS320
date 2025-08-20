//============================================================================
// Name        : Contact.java
// Author      : Kasra Pratt
// Version     : 1.0
// Copyright   : Copyright � 2023 SNHU COCE
// Description : 6-1 Milestone
//============================================================================
package grandStrandSystems;


public class Contact {
	//basic Contact class variables.
	private final String contactID;
	private String firstName;
	private String lastName;
	private String address;
	private String number;

	//set allowable variable functions
	public void setFirstName(String FirstName) {
		firstName = FirstName;
	}
	
	
	public void setLastName(String LastName) {
		lastName = LastName;
	}

	public void setAddress(String Address) {
		address = Address;
	}
	
	public void setNumber(String Number) {
		number = Number;
	}
	
	//get all variable functions
	//Returns Short ID
	public String getID() {
		return this.contactID;
	}
	
	//Returns first & last name
	public String getName() {
		return firstName+" "+lastName;
	}
	
	//returns address
	public String getAddress() {
		return this.address;
	}
	
	//returns number
	public String getNumber() {
		return this.number;
	}
	
	//to string method for searching
	public String toString() {
		return this.contactID + " " + this.getName() + " " + this.getAddress() + " " + this.getNumber(); 
	}
	
	//Checks for null values. returns false if null value found
	private boolean checkString(String... Values) {
		for (String value : Values) {
			if (value == null || value.length() > 10) {
				throw new IllegalArgumentException("Invalid Value");
			}
		}
		return true;
	}
	
	//checks firstName length
	private boolean checkAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		return true;
	}
	
	//checks phone number
	
	private boolean checkNumber(String number) {
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		return true;
	}
	
	/**
	 * Contact Constructor.
	 * @param firstName 10 char max & not null
	 * @param lastName 10 char max & not null
	 * @param address 30 char max & not null
	 * @param number 10 digits & L behind.
	 */
	
	public Contact(String contactID, String firstName, String lastName, String address, String number) {
		
		checkString(contactID,firstName,lastName);
		checkAddress(address);
		checkNumber(number);
		
		this.contactID = contactID;
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setNumber(number);
		
	}
}
