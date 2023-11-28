import healthcare.Doctor;
import healthcare.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Varun Kaundinya");
        Doctor doctor = new Doctor("Tanushree");

        // Example usage
        patient.bookAppointment();
        patient.diagnose();
        patient.prescribeMedication();

        doctor.conductCheckup();
        doctor.diagnose();
        doctor.prescribeMedication();
    }
}
