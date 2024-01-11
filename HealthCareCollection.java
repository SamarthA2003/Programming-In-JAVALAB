import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class HealthcareSystem {
    private ArrayList<String> patients;
    private HashMap<String, String> medicalRecords;
    private LinkedList<String> appointments;

    public HealthcareSystem() {
        patients = new ArrayList<>();
        medicalRecords = new HashMap<>();
        appointments = new LinkedList<>();
    }
    public void addPatient(String patientName) {
        patients.add(patientName);
    }
    public void addMedicalRecord(String patientName, String medicalInfo) {
        medicalRecords.put(patientName, medicalInfo);
    }
    public void scheduleAppointment(String patientName, String appointmentDetails) {
        appointments.add(patientName + ": " + appointmentDetails);
    }
    public void displayPatients() {
        System.out.println("Patients:");
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
    public void displayMedicalRecords() {
        System.out.println("Medical Records:");
        for (Map.Entry<String, String> entry : medicalRecords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void displayAppointments() {
        System.out.println("Appointments:");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }
    }
}

public class HealthCareCollection {
    public static void main(String[] args) {
        HealthcareSystem healthcareSystem = new HealthcareSystem();
        healthcareSystem.addPatient("Akshay");
        healthcareSystem.addPatient("Varun");

        healthcareSystem.addMedicalRecord("Akshay", "Blood pressure: 120/80, Cholesterol: Normal");
        healthcareSystem.addMedicalRecord("Varun", "Blood pressure: 130/85, Cholesterol: High");

        healthcareSystem.scheduleAppointment("Akshay", "Checkup");
        healthcareSystem.scheduleAppointment("Varun", "Lab test");

        healthcareSystem.displayPatients();
        healthcareSystem.displayMedicalRecords();
        healthcareSystem.displayAppointments();
    }
}
