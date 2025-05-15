package Lecture6_OOP2.HomeWork_1;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("код 21");

        patient.appointDoctor(patient.getTreatmentPlan());
    }
}
