package contactservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("12345", "Malik", "Nabors", "1234567890", "111 Giants St");
        assertTrue(contactService.addContact(contact));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("12345", "Malik", "Nabors", "1234567890", "111 Giants St");
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact("12345"));
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("12345", "Malik", "Nabors", "1234567890", "111 Giants St");
        contactService.addContact(contact);

        assertTrue(contactService.updateContact("12345", "Dexter", "Lawrence", "0987654321", "977 Elite St"));
        Contact updatedContact = contactService.getContact("12345");
        assertEquals("Dexter", updatedContact.getFirstName());
        assertEquals("Lawrence", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("977 Elite St", updatedContact.getAddress());
    }
}
