package Lecture5_OOP2.HomeWork_1;

public class Patient extends Therapist {

    public String treatmentPlan;
    public String doctor;

    public Patient(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
