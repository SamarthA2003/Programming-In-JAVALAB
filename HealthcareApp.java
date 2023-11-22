class HealthcareProfessional {
    String name;
    int age;

    HealthcareProfessional(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void performDuties() {
        System.out.println("Performing general healthcare duties");
    }
}
class Doctor extends HealthcareProfessional {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    void performDuties() {
        System.out.println("Diagnosing patients and providing medical treatment");
    }
    void prescribeMedication() {
        System.out.println("Prescribing medication to patients");
    }
}
abstract class MedicalStaff extends HealthcareProfessional {
    MedicalStaff(String name, int age) {
        super(name, age);
    }
    abstract void assistPatient();
}
class Nurse extends MedicalStaff {
    Nurse(String name, int age) {
        super(name, age);
    }
    void assistPatient() {
        System.out.println("Assisting patients with basic health needs");
    }
}
final class PediatricNurse extends Nurse {
    PediatricNurse(String name, int age) {
        super(name, age);
    }
}
public class HealthcareApp {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr.Akshay", 35, "Cardiology");
        System.out.println("Doctor Info: " +doc.name + " " + doc.age + " " + doc.specialization);
        doc.performDuties();
        doc.prescribeMedication();

        Nurse n = new Nurse("Nurse Info: " + "Johnson", 28);
        System.out.println(n.name + " " + n.age);
        n.performDuties();
        n.assistPatient();

        PediatricNurse pediatricNurse = new PediatricNurse("Varun", 30);
        pediatricNurse.performDuties();
        pediatricNurse.assistPatient();
    }
}
