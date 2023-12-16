public class Patient1 extends Thread {
    private String patientName;

    public Patient1(String name) {
        this.patientName = name;
    }
    public void run() {
        System.out.println("Patient " + patientName + " is waiting for a doctor.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Patient " + patientName + " is consulting with the doctor.");
    }
}

