package healthcare;
public class Patient implements MedicalProfessional {
    private String name;

    public Patient(String name) {
        this.name = name;
    }
    public void diagnose() {
        System.out.println(name + " is diagnosed.");
    }
    public void prescribeMedication() {
        System.out.println(name + " is prescribed medication.");
    }
    public void bookAppointment() {
        System.out.println(name + " has booked an appointment.");
    }
}
