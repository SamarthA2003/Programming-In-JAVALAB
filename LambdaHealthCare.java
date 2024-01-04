import java.util.ArrayList;

interface HealthCareTask {
    void performTask();
}

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}

class Doctor extends Employee {
    public Doctor(String name) {
        super(name);
    }

    public void prescribeMedicine() {
        System.out.println(name + " is prescribing medicine.");
    }
}

class Nurse extends Employee {
    public Nurse(String name) {
        super(name);
    }

    public void administerMedicine() {
        System.out.println(name + " is administering medicine.");
    }
}

public class LambdaHealthCare {
    public static void main(String[] args) {
        ArrayList<Employee> healthCareProfessionals = new ArrayList<>();
        healthCareProfessionals.add(new Doctor("Dr. Akshay"));
        healthCareProfessionals.add(new Nurse("Nurse Varun"));
        healthCareProfessionals.forEach(employee -> {
            employee.introduce();
            HealthCareTask healthCareTask = () -> {
                System.out.println(employee.name + " is performing a healthcare task.");
                if (employee instanceof Doctor) {
                    ((Doctor) employee).prescribeMedicine();
                } else if (employee instanceof Nurse) {
                    ((Nurse) employee).administerMedicine();
                }
            };
            healthCareTask.performTask();
            System.out.println(); 
        });
    }
}
