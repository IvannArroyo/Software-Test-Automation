package contactservice;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID must be non-null and up to 10 characters");
        }
    
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be non-null and up to 10 characters");
        }
        
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be non-null and up to 10 characters");
        }
       
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be non-null and exactly 10 characters");
        }
       
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must be non-null and up to 30 characters");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be non-null and up to 10 characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be non-null and up to 10 characters");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be non-null and exactly 10 characters");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must be non-null and up to 30 characters");
        }
        this.address = address;
    }
}
