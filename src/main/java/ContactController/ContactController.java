package ContactController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ContactEntity.Contact;
import ContactSrevice.ContactService;

@RestController
@RequestMapping("/contactApi")
public class ContactController {
@Autowired
public ContactService contactService;
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);
	}
	
	@PostMapping("/addContacts")
	public List<Contact> addAllContacts(@RequestBody List<Contact> contacts) {
		return contactService.saveContacts(contacts);
	}
	
	@GetMapping("/getContact/{id}")
	public Contact getContactById(@PathVariable int id) {
		return contactService.getContact(id);
	}
	
	@GetMapping("/getContacts")
	public List<Contact> getAllContacts() {
		return contactService.getContacts(null);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteContactById(@PathVariable int id) {
		contactService.deleteContact(id);
		return "contact deleted with id:"+id;
	}
	



}
