/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description:  It has methods to set and get each information.
 * It return to patientDriveApp.
 * Due: 10/03/2025
 * Platform/compiler:  tested with java command line and Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: sakina rezaee
 */
package project2;

public class Procedure {
	//field to store procedure
    private String proName;
    private String proDate;
    private String proDoctor;
    private double proCharge;
    // setter fpr procedure info
    public void setProcedureName(String name) {
        proName = name;
    }
    public void setProcedureDate(String date) {
    	proDate=date;
    }
    public void setProcedureDr(String drName) {
    	proDoctor =drName;
    }
    public void setProcedureCharge(double charge) {
    	proCharge = charge;
    }
    //get methods to return procedure 
    public String getProcedureName() {
        return proName;
    }
    public String getProcedureDate() {
        return proDate;
    }
    public String getProcedureDr() {
        return proDoctor;
    }
    public double getProcedureCharge() {
        return proCharge;
    }
    
}


