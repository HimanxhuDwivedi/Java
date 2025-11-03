import java.util.*;

class Patient {
    int id;
    String name;
    int age;
    String gender;
    String ailment;

    Patient(int id, String name, int age, String gender, String ailment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ailment = ailment;
    }

    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Age: " + age
                + ", Gender: " + gender + ", Ailment: " + ailment;
    }
}

class Doctor {
    int id;
    String name;
    String specialization;

    Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}

class Appointment {
    int appointmentId;
    Patient patient;
    Doctor doctor;
    String date;

    Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public String toString() {
        return "Appointment ID: " + appointmentId + ", Patient: " + patient.name
                + ", Doctor: " + doctor.name + ", Date: " + date;
    }
}

class Bill {
    int id;
    Appointment appointment;
    double amount;

    Bill(int id, Appointment appointment, double amount) {
        this.id = id;
        this.appointment = appointment;
        this.amount = amount;
    }

    public String toString() {
        return "Bill ID: " + id + ", Appointment ID: " + appointment.appointmentId +
                ", Patient: " + appointment.patient.name +
                ", Doctor: " + appointment.doctor.name +
                ", Amount: ₹" + amount;
    }
}

public class HospitalManagementSystem {
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();
    static ArrayList<Bill> bills = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Generate Bill");
            System.out.println("5. View Patients");
            System.out.println("6. View Doctors");
            System.out.println("7. View Appointments");
            System.out.println("8. View Bills");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> addDoctor();
                case 3 -> scheduleAppointment();
                case 4 -> generateBill();
                case 5 -> viewPatients();
                case 6 -> viewDoctors();
                case 7 -> viewAppointments();
                case 8 -> viewBills();
                case 9 -> {
                    exit = true;
                    System.out.println("Exiting System...");
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Ailment: ");
        String ailment = scanner.nextLine();

        patients.add(new Patient(id, name, age, gender, ailment));
        System.out.println(" Patient added successfully.");
    }

    static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();

        doctors.add(new Doctor(id, name, specialization));
        System.out.println("Doctor added successfully.");
    }

    static void scheduleAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println(" Please add patients and doctors first.");
            return;
        }

        System.out.print("Enter Appointment ID: ");
        int appointmentId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select Patient by ID:");
        for (Patient p : patients) {
            System.out.println(p);
        }
        int patientId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select Doctor by ID:");
        for (Doctor d : doctors) {
            System.out.println(d);
        }
        int doctorId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Appointment Date (dd-mm-yyyy): ");
        String date = scanner.nextLine();

        Patient patient = null;
        Doctor doctor = null;

        for (Patient p : patients) {
            if (p.id == patientId) {
                patient = p;
                break;
            }
        }

        for (Doctor d : doctors) {
            if (d.id == doctorId) {
                doctor = d;
                break;
            }
        }

        if (patient != null && doctor != null) {
            appointments.add(new Appointment(appointmentId, patient, doctor, date));
            System.out.println(" Appointment scheduled successfully.");
        } else {
            System.out.println(" Invalid patient or doctor ID.");
        }
    }

    static void generateBill() {
        if (appointments.isEmpty()) {
            System.out.println(" No appointments found. Schedule one first.");
            return;
        }

        System.out.println("Select Appointment by ID:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }

        int appointmentId = scanner.nextInt();
        scanner.nextLine();

        Appointment selectedAppointment = null;
        for (Appointment a : appointments) {
            if (a.appointmentId == appointmentId) {
                selectedAppointment = a;
                break;
            }
        }

        if (selectedAppointment == null) {
            System.out.println(" Invalid appointment ID.");
            return;
        }

        System.out.print("Enter Bill ID: ");
        int billId = scanner.nextInt();

        System.out.print("Enter Bill Amount: ");
        double amount = scanner.nextDouble();

        bills.add(new Bill(billId, selectedAppointment, amount));
        System.out.println(" Bill generated successfully.");
    }

    static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("\n--- Patient List ---");
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            System.out.println("\n--- Doctor List ---");
            for (Doctor d : doctors) {
                System.out.println(d);
            }
        }
    }

    static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("\n--- Appointment List ---");
            for (Appointment a : appointments) {
                System.out.println(a);
            }
        }
    }

    static void viewBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills generated.");
        } else {
            System.out.println("\n--- Bill List ---");
            for (Bill b : bills) {
                System.out.println(b);
            }
        }
    }
}
