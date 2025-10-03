/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: Gets patient info from the user.Creates a Patient object.
 * Creates 3 Procedure objects.Displays patient details.
 * Displays procedure details.Calculates total charges.Shows student name and due date.
 * Due: 10/03/2025
 * Platform/compiler:  tested with java command line and Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: sakina rezaee
 */

package project2;

import java.util.Scanner;

//import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[]args) 
	{
		try(Scanner keybord = new Scanner (System.in))
		{
		//input name info  
		System.out.println("Enter your first name: ");
		String firstName=keybord.nextLine();
		
		System.out.println("Enter your middle name: ");
		String midName = keybord.nextLine();
		
		System.out.println("Enter your last name : ");
		String lastName = keybord.nextLine();
		
		//input address info
		System.out.println("Enter your address: ");
		String address = keybord.nextLine();
		
		System.out.println("Enter your city: ");
		String city = keybord.nextLine();
		
		System.out.println("ENter your state: ");
		String state = keybord.nextLine();
		
		System.out.println("Enter your zip code: ");
		String zip = keybord.nextLine();
		
		//input emergancy info
		System.out.println("Enter a name for emergancy contact: ");
		String name = keybord.nextLine();
		System.out.println("Enter a phone number for emergancy contact: ");
		String number = keybord.nextLine();
		
		//create pation objects
		Patient patient = new Patient(firstName, midName, lastName, address, city, state, zip, name, number);
		displayPatient(patient);
		
		// create procedure objects
		Procedure proc1 = new Procedure();
		
		proc1.setProcedureName("Physical Exam");
		proc1.setProcedureDate ("09/30/2025");
		proc1.setProcedureDr ("Irvine");
		proc1.setProcedureCharge(3250.0);
		displayProcedure(proc1);
		
		Procedure proc2 = new Procedure();
		proc2.setProcedureName("X-Ray");
		proc2.setProcedureDate ("09/30/2025");
		proc2.setProcedureDr ("Dr. Jamison");
		proc2.setProcedureCharge(5500.43);
		displayProcedure(proc2);
		
		Procedure proc3 = new Procedure();
		proc3.setProcedureName("Blood Test");
		proc3.setProcedureDate ("09/30/2025");
		proc3.setProcedureDr ("Dr. Smith");
		proc3.setProcedureCharge(1400.75);
		displayProcedure(proc3);
		
		System.out.println("\n");
		double total = calculateTotalCharges(proc1, proc2, proc3);
        System.out.printf("\nTotal Charges: $%,.2f\n", total);
		
        System.out.println("\n");
        System.out.println("Student Name: Sakina Rezaee");
        System.out.println("MC#: MC7777");
        System.out.println("Due Date: 10/03/2025");
		}
	}
	public static void displayPatient(Patient p) {
        System.out.println("\nPatient Info: ");
        System.out.println("  Name: " + p.buildFullName());                                                                                                                                          
        System.out.println("  Address: " + p.buildAddress());
        System.out.println("  Emergency Contact: " + p.buildEmergencyContact());
       
    }
	public static void displayProcedure(Procedure p) 
	{
		System.out.println("\n");
		System.out.println("\tProcedure: "+ p.getProcedureName());
		System.out.println("\tProcedure Date: "+ p.getProcedureDate());
		System.out.println("\tPractitioner: "+ p.getProcedureDr());
		System.out.println("\tCharge: "+ p.getProcedureCharge());
		
	}
	// metod to calculate total cahrges
	public static double calculateTotalCharges(Procedure proc1,Procedure proc2,Procedure proc3) {
		return proc1.getProcedureCharge()+proc2.getProcedureCharge()+proc3.getProcedureCharge();
	}
}
