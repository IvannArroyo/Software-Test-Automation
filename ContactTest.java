package contactservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testContactCreation() {
        Contact contact = new Contact("12345", "Malik", "Nabors", "1234567890", "111 Giants St");
        assertEquals("12345", contact.getContactID());
        assertEquals("Malik", contact.getFirstName());
        assertEquals("Nabors", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("111 Giants St", contact.getAddress());
    }

    @Test
    public void testContactIDCannotBeNullOrTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Saquon", "Barkley", "1234567890", "26 Drive");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Saquon", "Barkley", "1234567890", "26 Drive");
        });
    }

    @Test
    public void testFirstNameCannotBeNullOrTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Barkley", "1234567890", "26 Drive");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "EliManningForever", "Barkley", "1234567890", "26 Drive");
        });
    }

    @Test
    public void testLastNameCannotBeNullOrTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Eli", null, "1234567890", "10 Manning Blvd");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Eli", "ManningTheGreatest", "1234567890", "10 Manning Blvd");
        });
    }

    @Test
    public void testPhoneCannotBeNullOrInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Michael", "Strahan", null, "92 Strahan Court");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Michael", "Strahan", "123456789", "92 Strahan Court");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Michael", "Strahan", "12345678901", "92 Strahan Court");
        });
    }

    @Test
    public void testAddressCannotBeNullOrTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Lawrence", "Taylor", "1234567890", null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Lawrence", "Taylor", "1234567890", "56 LT Memorial Parkway LT Memorial Parkway");
        });
    }
}

