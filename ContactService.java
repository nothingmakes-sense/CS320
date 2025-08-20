//============================================================================
// Name        : ContactService.java
// Author      : Kasra Pratt
// Version     : 1.0
// Copyright   : Copyright � 2023 SNHU COCE
// Description : 6-1 Milestone
//============================================================================
package grandStrandSystems;

import java.util.ArrayList;


public class ContactService{
	private ArrayList<Contact> instance;
	
	
	/**
	 * public constructor for ContactService
	 */
	public ContactService() {
		if (instance == null) {
			instance = new ArrayList<Contact>();
		}
	}
	
	
	public int find(String... args ) {
		int i = 1;
		for(Contact contact : instance) {
			for (String arg : args) {
				if (contact.toString().contains(arg)) {
					return i;
				}
			}
		 i = i + 1;
		}
		throw new Error("Not Found");
	}
	
	public boolean pop(String shortID) {
		int i = 0;
		for (Contact contact : instance) {
			if (contact.getID().equals(shortID)) {
				instance.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void append(Contact contact) {
		this.instance.add(contact);
	}
	
	public void update(String shortID, Contact newContact) {
		int i = 0;
//		System.out.println(instance.toString());
		for (Contact contact : this.instance){
			if (contact.getID().equals(shortID)) {
				instance.set(i, newContact);
			}
			i = i + 1;
		}
	}
	
	public Contact get(int i) {
		return instance.get(i);
	}
	
	public int size() {
		return instance.size();
	}


}
