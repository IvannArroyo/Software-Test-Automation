package contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            return false;
        }
        contacts.put(contact.getContactID(), contact);
        return true;
    }

    public boolean deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            return false;
        }
        contacts.remove(contactID);
        return true;
    }

    public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            return false;
        }
        if (firstName != null && firstName.length() <= 10) {
            contact.setFirstName(firstName);
        }
        if (lastName != null && lastName.length() <= 10) {
            contact.setLastName(lastName);
        }
        if (phone != null && phone.length() == 10) {
            contact.setPhone(phone);
        }
        if (address != null && address.length() <= 30) {
            contact.setAddress(address);
        }
        return true;
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
