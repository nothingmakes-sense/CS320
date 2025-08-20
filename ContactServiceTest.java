//============================================================================
// Name        : contactServiceTest.java
// Author      : Kasra Pratt
// Version     : 1.0
// Copyright   : Copyright � 2023 SNHU COCE
// Description : 6-1 Milestone
//============================================================================
package grandStrandSystems;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAdd() {
		String id = "123";
		String fn = "Olaf";
		String ln = "heinken";
		String ad = "123 Broken Ln";
		String nm = "1234567891";
		
		ContactService cs = new ContactService();
		Contact contact = new Contact(id,fn,ln,ad,nm);
		cs.append(contact);
		assertEquals(cs.get(0).toString(),contact.toString());
	}
	
	@Test
	void testPop() {
		
		String fn = "Olaf";
		String ln = "heinken";
		String ad = "123 Broken Ln";
		String nm = "1234567891";
		
		ContactService cs = new ContactService();
		for (int i = 0; i < 10; i++) {
			cs.append(new Contact(String.valueOf(i),fn,ln,ad,nm));
		}
//		System.out.println(cs.get(5));
		System.out.println(cs.size());
		assertTrue(cs.pop(cs.get(5).getID()));
		System.out.println(cs.size());
		
		
	}
	
	@Test
	void testUpdate() {
		String id = "123";
		String fn = "Olaf";
		String ln = "heinken";
		String ad = "123 Broken Ln";
		String nm = "1234567891";
		
		Contact firstContact = new Contact(id,fn,ln,ad,nm);
		
		ContactService cs = new ContactService();
		cs.append(firstContact);
//		System.out.println(cs.get(0));
		
		String newFN = "johnc";
		Contact nc = new Contact(id,newFN,ln,ad,nm);
		cs.get(0).setFirstName(newFN);
		
		cs.update(cs.get(0).getID(),nc);
//		System.out.println(cs.get(0));
		assertEquals(cs.get(0),nc);
		assertTrue(cs.get(0) != firstContact);
	}

}
