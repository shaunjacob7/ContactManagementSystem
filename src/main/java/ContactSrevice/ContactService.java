package ContactSrevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ContactEntity.Contact;
import ContactRepository.ContactRepo;

public class ContactService {
	
	@Autowired
	public ContactRepo contactRepository;
	
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public List<Contact> saveContacts(List<Contact> contacts){
		return contactRepository.saveAll(contacts);
	}
	
	public Contact getContact(int id) {
		return contactRepository.findById(id).orElse(null);
	}
	
	public List<Contact> getContacts(List<Contact> contacts){
		return contactRepository.findAll();
	}
	
	public String deleteContact(int id) {
		contactRepository.deleteById(id);
		return "contact deleted"+id;
	}
	
	

}
