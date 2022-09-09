package com.bridgelabz;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class AddressBook {
	
	Scanner scanner = new Scanner(System.in);
	Contacts contacts = new Contacts();
		
    List<Contacts> arraylist = new ArrayList<>();

    public void createContact()
    {
    	System.out.println("Enter Person Details:");
        System.out.println("Enter first Name");
        String firstName = scanner.next();

        System.out.println("Enter last Name");
        String lastName = scanner.next();

        System.out.println("Enter Email");
        String email = scanner.next();

        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();

        System.out.println("Enter address");
        String address = scanner.next();

        System.out.println("Enter state");
        String state = scanner.next();

        System.out.println("Enter city");
        String city = scanner.next();

        System.out.println("Enter zip");
        String zip = scanner.next();
        arraylist.add(contacts);

    }
    
    
    public void searchByName(String name) {
        List<Contacts> collect = arraylist.stream().filter(p -> p.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList());
        for (Contacts contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }
    
    public void searchByCity(String city) {
        List<Contacts> collect = arraylist.stream().filter(p -> p.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        for (Contacts cont : collect) {
            System.out.println("Result: " + cont);
        }
    }
    

    
    
    public void searchByState(String state) {
        List<Contacts> collect = arraylist.stream().filter(p -> p.getCity().equalsIgnoreCase(state)).collect(Collectors.toList());
        for (Contacts cont : collect) {
            System.out.println("Result: " + cont);
        }
    }
    public void addContact(Contacts contact) {

        createContact();
        System.out.println("Enter firstname and lastname");
        String name = scanner.next() + "" + scanner.next();

        Iterator<Contacts> iterator = arraylist.listIterator();

        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();
            if (name.equals(contacts.getFirstName() + "" + contacts.getLastName())) {
                System.out.println("Duplicate entry add new contact press  1");
            } else {
                System.out.println("Enter Person Details:");

                System.out.println("Enter first Name");
                String firstName = scanner.next();

                System.out.println("Enter last Name");
                String lastName = scanner.next();

                System.out.println("Enter Email");
                String email = scanner.next();

                System.out.println("Enter phone number");
                String phoneNumber = scanner.next();

                System.out.println("Enter address");
                String address = scanner.next();

                System.out.println("Enter state");
                String state = scanner.next();

                System.out.println("Enter city");
                String city = scanner.next();

                System.out.println("Enter zip");
                String zip = scanner.next();
                
    	        arraylist.add(contacts);
               
            }
        }
    } public void editContact() {
        System.out.println("Enter the person name for update");
        String firstName = scanner.next();


        Iterator<Contacts> iterator = arraylist.listIterator();


        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();
            if (firstName.equals(contacts.getFirstName())) {
                System.out.println("Edit the details of person");
                System.out.println("Enter first Name");
                String firstName1 = scanner.next();
                contacts.setFirstName(firstName1);

                System.out.println("Enter last Name");
                String lastName = scanner.next();
                contacts.setLastName(lastName);

                System.out.println("Enter Email");
                String email = scanner.next();
                contacts.setEmailId(email);

                System.out.println("Enter phone number");
                String phoneNumber = scanner.next();
                contacts.setMobileNumber(phoneNumber);

                System.out.println("Enter state");
                String state = scanner.next();
                contacts.setState(state);

                System.out.println("Enter city");
                String city = scanner.next();
                contacts.setCity(city);

                System.out.println("Enter zip");
                String zip = scanner.next();
                contacts.setZipCode(zip);

           //     printContacts();

            } else {
                System.out.println("Person not found");
            }
        }
    }
  
    public void deleteContactByName() {

        System.out.println("Enter first name for delete contact:");
        String firstName = scanner.next();

        Iterator<Contacts> iterator = arraylist.listIterator();

        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();
            if (firstName.equals(contacts.getFirstName())) {
            	arraylist.remove(contacts);
                System.out.println("Contact: " + contacts.getFirstName() + " " + "deleted successfully...");
            }
        }
}
}