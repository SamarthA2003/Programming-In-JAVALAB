import java.util.ArrayList;
import java.util.List;

class PatientRecord<T> {
    private T patientId;
    private String patientName;
    private int age;

    public PatientRecord(T patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    public T getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PatientRecord" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", age=" + age ;
    }
}

// Generic interface for managing patient records
interface PatientRecordManager<T> {
    void addPatientRecord(PatientRecord<T> patientRecord);

    PatientRecord<T> getPatientRecord(T patientId);

    void displayAllPatientRecords();
}

// Generic implementation of the PatientRecordManager interface
class GenericPatientRecordManager<T> implements PatientRecordManager<T> {
    private List<PatientRecord<T>> patientRecords = new ArrayList<>();

    @Override
    public void addPatientRecord(PatientRecord<T> patientRecord) {
        patientRecords.add(patientRecord);
    }

    @Override
    public PatientRecord<T> getPatientRecord(T patientId) {
        for (PatientRecord<T> record : patientRecords) {
            if (record.getPatientId().equals(patientId)) {
                return record;
            }
        }
        return null;
    }

    @Override
    public void displayAllPatientRecords() {
        for (PatientRecord<T> record : patientRecords) {
            System.out.println(record);
        }
    }
}


public class HealthcareApp1 {
    public static void main(String[] args) {
        
        PatientRecordManager<Integer> patientRecordManager = new GenericPatientRecordManager<>();

        patientRecordManager.addPatientRecord(new PatientRecord<>(1, "Akshay", 30));
        patientRecordManager.addPatientRecord(new PatientRecord<>(2, "Varun", 25));
        patientRecordManager.addPatientRecord(new PatientRecord<>(3, "Madhu", 28));
        patientRecordManager.addPatientRecord(new PatientRecord<>(4, "Divya", 27));
        patientRecordManager.addPatientRecord(new PatientRecord<>(5, "Tanushree", 24));
        patientRecordManager.displayAllPatientRecords();
        PatientRecord<Integer> patientRecord = patientRecordManager.getPatientRecord(1);
        if (patientRecord != null) {
            System.out.println("Found patient: " + patientRecord);
        } else {
            System.out.println("Patient not found.");
        }
    }
}
