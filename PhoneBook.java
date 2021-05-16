import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<Contact>();
    
    //getters and setters
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook = phoneBook;
    }
    
    public List<Contact> getPhoneBook(){
        return this.phoneBook;
    }
    
    //This method should add the contact object to the phoneBook list.
    public void addContact(Contact contactObj){
        this.phoneBook.add(contactObj);
        setPhoneBook(this.phoneBook);
    }

    //This method should return the list of all contacts available.
    public List<Contact> viewAllContacts(){
        return this.phoneBook;
    }
    
    // This method should return the contact details which has the phoneNumber given as parameter.
    public Contact viewContactGivenPhone(long phoneNumber){
        Iterator itr = phoneBook.listIterator();
        while(itr.hasNext())
        {
            //itr.next() -> gives customer object
            Object obj = itr.next();
            Contact c = (Contact)obj;
            long phone = c.getPhoneNumber();
            if(phone==phoneNumber)
            {
                return c;
            }
        }
        return null;
    }
    
    //This method should remove the contact details which has the phoneNumber given as parameter. 
    //If removed return true.  Else if the phone number is not available return false.
    public boolean removeContact(long phoneNumber){
        Iterator itr = phoneBook.listIterator();
        while(itr.hasNext())
        {
            //itr.next() -> gives customer object
            Object obj = itr.next();
            Contact c = (Contact)obj;
            long phone = c.getPhoneNumber();
            if(phone==phoneNumber)
            {
                itr.remove();
                return true;
            }
        }
        return false;
    }
    
}