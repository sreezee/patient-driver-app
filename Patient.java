/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: It used constructor to create patient objects on different way. It has methods to build and return full name 
 * address , emergency contacts.
 * Due: 10/03/2025
 * Platform/compiler:  tested with java command line and Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: sakina rezaee
 */
package project2;

public class Patient {
	
	String firstName ;
	String middleName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String nameE;
	String numberE;
	
	//no argument constructure
	public Patient()
	{
    }
	/* patient method store a value
	@param  fn,mn,ln store a value in each of name info	*/
	public Patient(String fn ,String mn, String ln,String add,
	String cit,String stat,String zi,String nE,String nuE)
		{
			firstName = fn;
			middleName = mn;
			lastName = ln;
			address = add;
			city = cit;
			state = stat ;
			zip = zi;
			nameE = nE;
			numberE = nuE;
		} 
	//this methods returns patient objects that stored (name information )
	public String buildFullName() { return firstName+ middleName+lastName; }
	//return patient address
    public String buildAddress() { return address +", \n  "+city+", " +state+", "+zip; }
    //return patient emergency contact
    public String buildEmergencyContact() {return nameE+"  "+numberE;}
    

}
