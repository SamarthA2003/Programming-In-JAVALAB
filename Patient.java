/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gowda
 */
public class Patient {
    private String patientname;
    private int age;
    private String gender;
    private String diagnosis;
    
    public Patient(){
        this.patientname = "Dhyan";
        this.age = 22;
        this.gender = "Female";
        this.diagnosis = "MRI";
    }
    
    public Patient(String name, int age){
        this.patientname = name;
        this.age = age;
        this.gender = "Female";
        this.diagnosis = "MRI";
    }
    
    public Patient(String name, int age, String gender, String scan){
        this.patientname = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = scan;
    }
    
    public void setDiagnosis(String diagnosis, int severitylevel){
        this.diagnosis = diagnosis + " " + "Severity: " + severitylevel + " ";
    }
    
    public void setDiagnosis(String diagnosis, String additionalNotes) {
        this.diagnosis = diagnosis + " " + additionalNotes + " ";
    }
    
    public void setDiagnosis(String diagnosis, String additionalNotes, int daystoRecover) {
        this.diagnosis = diagnosis + " " + additionalNotes + " " + daystoRecover;
    }
    
    public String getPatientname(){
        return patientname;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getDiagnosis(){
        return diagnosis;
    }
    
    public void displayPatientInfo(){
        System.out.println("Patient Name: "+patientname);
        System.out.println("Patient Age: "+age);
        System.out.println("Patient Gender: "+gender);
        System.out.println("Diagnosis Record: "+diagnosis);
    }
    
    public static void main(String args[]){
        Patient p = new Patient();
        Patient p1 = new Patient("Tanushree", 21);
        Patient p2 = new Patient("Varun", 21, "Male", "Fever");
        
        System.out.println("Patient 1 Information: ");
        p.displayPatientInfo();
        System.out.println();
        
        System.out.println("Patient 2 Information: ");
        p1.displayPatientInfo();
        System.out.println();
        
        System.out.println("Patient 3 Information: ");
        p2.displayPatientInfo();
        
        p.setDiagnosis("Fever", 2);
        p1.setDiagnosis("Fractured Arm", "Comaplicated Fracture");
        p2.setDiagnosis("Headache", "Comaplicated", 5);
        
        System.out.println();
        System.out.println("Updated Patient Information:"); 
        System.out.println("Patient 1 Diagnosis: " + p.getDiagnosis()); 
        System.out.println("Patient 2 Diagnosis: " + p1.getDiagnosis());
        System.out.println("Patient 3 Diagnosis: " + p2.getDiagnosis());
    }
}
