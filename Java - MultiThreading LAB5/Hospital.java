public class Hospital {
    public static void main(String[] args) {
        Patient1 patient1 = new Patient1("John");
        Patient1 patient2 = new Patient1("Varun");

        Doctor1 doctor1 = new Doctor1("Dr. Madhu");
        Doctor1 doctor2 = new Doctor1("Dr. Akshay");

        patient1.start();
        patient2.start();
        doctor1.start();
        doctor2.start();

        try {
            patient1.join();
            patient2.join();
            doctor1.join();
            doctor2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All patients have consulted with doctors.");
    }
}
