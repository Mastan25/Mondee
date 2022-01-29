import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBookEntry {
	
	String personName;
	long phoneNumber;
	
	PhoneBookEntry(String n,long p){
		personName = n;
		phoneNumber = p;
	}
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String args[]) {
		
		PhoneBookEntry obj = new PhoneBookEntry(" Mastan ",792189211);
		PhoneBookEntry obj2 = new PhoneBookEntry(" Sai Krishna ",792189762);
		PhoneBookEntry obj3 = new PhoneBookEntry(" Rambabu ",892189211);
		PhoneBookEntry obj4 = new PhoneBookEntry(" Rohit ",798189211);
		
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
		
		phoneBook.add(obj);
		phoneBook.add(obj2);
		phoneBook.add(obj3);
		phoneBook.add(obj4);
		
//		for(PhoneBookEntry b:phoneBook) {
//			System.out.println(b.personName +" "+b.phoneNumber);
//		}
		
		Iterator<PhoneBookEntry> iterator = phoneBook.iterator();
		
		while(iterator.hasNext()) {
			
			PhoneBookEntry b = (PhoneBookEntry)iterator.next();
			
			System.out.println(b.personName+" "+b.phoneNumber);
		}
		
	}
}