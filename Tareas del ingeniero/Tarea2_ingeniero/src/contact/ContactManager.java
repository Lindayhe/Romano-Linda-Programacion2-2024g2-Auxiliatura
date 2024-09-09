package contact;

import java.io.*;
import java.util.HashMap;

public class ContactManager implements Serializable{
	private static final long serialVersionUID = 1L;
    private HashMap<String, Contact> contacts;
    public ContactManager() {
        this.contacts = new HashMap<>();
    }
    public void addContact(Contact contact) {
        this.contacts.put(contact.getEmail(), contact);
        saveContacts(); 
    }
    public Contact searchContact(String email) {
        if (this.contacts.containsKey(email)) {
            return this.contacts.get(email);
        }
        return null;
    }
    public Boolean removeContact(String email) {
        if (this.contacts.containsKey(email)) {
            this.contacts.remove(email);
            saveContacts();
            return true;
        }
        return false;
    }
    public void showAllContacts() {
        for (Contact contact : this.contacts.values()) {
            contact.print();
        }
    }
    private void saveContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacts.ser"))) {
            oos.writeObject(contacts);
            System.out.println("Contacts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
    public void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contacts.ser"))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contacts loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
