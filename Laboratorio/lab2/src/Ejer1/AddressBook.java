package Ejer1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AddressBook implements Serializable {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : this.contacts.values()) {
            System.out.println(contact.print());
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }
    
    public void storeContacts(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contacts);
            System.out.println("Contacts stored successfully.");
        } catch (IOException e) {
            System.out.println("Error storing contacts: " + e.getMessage());
        }
    }
    
    public void loadContacts(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contacts loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }



}

