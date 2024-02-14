package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ContactController.ContactController;
import ContactEntity.Contact;
import ContactSrevice.ContactService;

@SpringBootTest
class ContactMsApplicationTests {

@Mock
public ContactService contactService;

@Mock
public Contact contact;

@Mock
public List<Contact> contacts;

@Autowired
public ContactController contactController; 
	@Test
	void testPost() {
		contactController.addContact(contact);
		Mockito.verify(contact);
	}
	
	@Test
	void testGet() {
		contactController.getAllContacts();
		Mockito.verify(contact);
	}
	
	@Test
	void testDelete() {
		contactController.deleteContactById(0);
		Mockito.verify(contact);
		Mockito.assertArg(null);
	}


}
