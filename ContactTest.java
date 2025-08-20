//============================================================================
// Name        : ContactTest.java
// Author      : Kasra Pratt
// Version     : 1.0
// Copyright   : Copyright � 2023 SNHU COCE
// Description : 6-1 Milestone
//============================================================================
package grandStrandSystems;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ContactTest {
	


	@Test
	void testAdd() {
		String id = "123";
        String fn = "Olaf";
		String ln = "heinken";
		String ad = "123 Broken Ln";
		String nm = "1234567891";
		Contact contact = new Contact(id,fn,ln,ad,nm);
		
		assertEquals(contact.getName(), fn+" "+ln);
		assertEquals(contact.getAddress(),ad);
		assertEquals(contact.getNumber(), nm);
		assertEquals(contact.getID(),id);
	}
	@Test
	void testNull() {
		String id = "123";
		String fn = null;
		String ln = null;
		String ad = null;
		String nm = null;
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,() -> new Contact(id,fn,ln,ad,nm));
		System.out.println(thrown);
		assertTrue(thrown.getMessage().contains("Invalid"));
	}
	
	@Test
	void testInvalid() {
		String id = "123";
		String fn="asdfasdfasdfasdfasdfasdfa";
		String ln ="asdfasdfasdfasdfasdfasdfa";
		String ad ="asdfasdfasdfasdfasdfasdfaadsfasdfasdfasdfasdfadsfasdfasdfasdfasdfadsfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfa";
		String nm = "1234567891";
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,() -> new Contact(id,fn,ln,ad,nm));
		assertTrue(thrown.getMessage().contains("Invalid"));
		
	}

}
