package reader;
import java.io.FileInputStream;
import java.util.Scanner;

import contact.Contact;
import contact.ContactManager;
import reader.Reader;

public class App {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.loadContacts(); 

        Scanner input = new Scanner(System.in);
        String readKeyBoard;

        do {
            createMenu();
            readKeyBoard = input.nextLine();
            Integer options = Integer.parseInt(readKeyBoard);

            switch (options) {
                case 1: {
                    System.out.println("Please add a new contact");
                    System.out.println("Write the name");
                    String name = input.nextLine();
                    System.out.println("Write the email");
                    String email = input.nextLine();
                    System.out.println("Write the age");
                    String age = input.nextLine();
                    Contact contact = new Contact(name, Integer.parseInt(age), email);
                    contactManager.addContact(contact);
                    break;
                }
                case 2: {
                    System.out.println("To search a contact you need to put the email:");
                    String email = input.nextLine();
                    Contact result = contactManager.searchContact(email);
                    if (result != null) {
                        result.print();
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("To remove a contact you need to put the email:");
                    String email = input.nextLine();
                    if (contactManager.removeContact(email)) {
                        System.out.println("Contact removed successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                }
                case 4: {
                    contactManager.showAllContacts();
                    break;
                }
                case 5: {
                    System.out.println("Exiting...");
                    input.close();
                    return;
                }
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    
    }
    public static void createMenu()  {
        System.out.println("1. Add Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Show Contact");
        System.out.println("5. Quit");
    }
}