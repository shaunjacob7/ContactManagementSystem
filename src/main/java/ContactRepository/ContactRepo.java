package ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import ContactEntity.Contact;

public interface ContactRepo extends JpaRepository<Contact,Integer> {

}
