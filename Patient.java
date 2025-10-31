public class Patient {
    static String HospitalName = "City Care Hospital";
    String patientName;
    int patientAge;
    public void printDetails() {
        System.out.println("Hospital Name : " + HospitalName);
        System.out.println("Patient Name : " + patientName);
        System.out.println("PatientAge : " + patientAge);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Patient obj1 = new Patient();
        Patient obj2 = new Patient();

        obj1.patientName = "John Doe";
        obj1.patientAge = 45;

        obj2.patientName = "Emma Watson";
        obj2.patientAge = 30;

        obj1.printDetails();
        obj2.printDetails();
    }

}
