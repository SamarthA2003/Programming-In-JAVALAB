package healthcare;
public class Doctor implements MedicalProfessional {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public void diagnose() {
        System.out.println(name + " has diagnosed the patient.");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(name + " has prescribed medication to the patient.");
    }
    public void conductCheckup() {
        System.out.println(name + " is conducting a checkup.");
    }
}
