import java.util.*;
public class Main{
    public static void main(String args[])
    {
        // Menu start
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Display all contacts");
        System.out.println("3.Search contact by phone ");
        System.out.println("4.Remove contact");
        System.out.println("5.Exit");
        System.out.println("Enter your choice:");
        
        // Input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        PhoneBook p = new PhoneBook();
        
        switch(input)
        {
            case 1: //Add Contact
                {
                    System.out.println("Add a Contact:");
                    System.out.println("Enter the First Name:");
                    String firstName = sc.nextLine();
                    System.out.println("Enter the Last Name:");
                    String lastName = sc.nextLine();
                    System.out.println("Enter the Phone No.:");
                    Long phoneNumber = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter the Email:");
                    String emailId = sc.nextLine();
                    Contact c = new Contact(firstName,lastName,phoneNumber,emailId);
                    p.addContact(c);
                    break;
                }
            case 2: //Display all contacts
                {
                    System.out.println("The contacts in the List are:");
                    List<Contact> phoneBook = p.viewAllContacts();
                    for(Contact obj : phoneBook)
                    {
                        System.out.println("First Name: "+obj.getFirstName());
                        System.out.println("Last Name: "+obj.getLastName());
                        System.out.println("Phone No.: "+obj.getPhoneNumber());
                        System.out.println("Email: "+obj.getEmailId());
                    }
                    break;
                }
            case 3: //Search contact by phone
                {
                    System.out.println("Enter the Phone number to search contact:");
                    long searchContact = sc.nextLong();
                    sc.nextLine();
                    System.out.println("The contact is:");
                    Contact c = p.viewContactGivenPhone(searchContact);
                    System.out.println("First Name: "+c.getFirstName());
                    System.out.println("Last Name: "+c.getLastName());
                    System.out.println("Phone No.: "+c.getPhoneNumber());
                    System.out.println("Email: "+c.getEmailId());
                    break;
                }
            case 4: //Remove contact
                {
                    System.out.println("Enter the Phone number to remove :");
                    long removePhoneNumber = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Do you want to remove the contact (Y/N):");
                    String confirm = sc.nextLine();
                    confirm = confirm.toLowerCase();
                    if(confirm.equals("y"))
                    {
                        boolean deletedContact = p.removeContact(removePhoneNumber);
                        if(deletedContact){
                            System.out.println("The contact is successfully deleted.");
                        }
                    }
                    break;
                }
            default: {
                break;
            }
        }
    }
}