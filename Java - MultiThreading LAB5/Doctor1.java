public class Doctor1 extends Thread{
    private String doctorName;

    public Doctor1(String name) {
        this.doctorName = name;
    }

    public void run() {
        System.out.println("Doctor " + doctorName + " is ready to see patients.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Doctor " + doctorName + " has completed all patient consultations.");
    }
}

