package MentorLesson5Task2;

public class Patient extends Person{

    private String regular;
    private String emergency;
    private String surgery;

    public Patient(String name, String id, int age, String regular, String emergency, String surgery) {
        super(name, id, age);
        this.regular = regular;
        this.emergency = emergency;
        this.surgery = surgery;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    @Override
    public String displayInfo() {
        return "Patient{" +
                "regular='" + regular + '\'' +
                ", emergency='" + emergency + '\'' +
                ", surgery='" + surgery + '\'' +
                '}';
    }


    public void calculateFee(int fee){
        String type;
        if (fee==500){
            type=regular;
        }
        if (fee==1000){
            type=emergency;
        }
        if (fee==5000){
            type=surgery;
        }

    }

}
