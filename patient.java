import java.util.Scanner;

public class Patient {
    private int id;
    private int age;

    private class BloodData {
        private String bloodType;
        private char rhFactor;

        public BloodData(String bloodType, char rhFactor) {
            this.bloodType = bloodType;
            this.rhFactor = rhFactor;
        }

        public String getBloodType() {
            return bloodType;
        }

        public char getRhFactor() {
            return rhFactor;
        }
    }

    private BloodData bloodData;

    public Patient(int id, int age, String bloodType, char rhFactor) {
        this.id = id;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodData.getBloodType();
    }

    public char getRhFactor() {
        return bloodData.getRhFactor();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();

        scanner.nextLine();  // Consume newline character

        System.out.print("Enter blood type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        char rhFactor = scanner.nextLine().charAt(0);

        Patient patient = new Patient(id, age, bloodType, rhFactor);

        // Display patient information
        System.out.println("\nPatient Information:");
        System.out.println("ID: " + patient.getId());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodType());
        System.out.println("Rh Factor: " + patient.getRhFactor());
    }
}
