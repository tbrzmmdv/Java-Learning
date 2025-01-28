package MentorLesson5Task2;

import java.util.Objects;

public class Doctor extends Person{
   private String cardiologist;
   private String neurologist;

    public Doctor(String name, String id, int age, String cardiologist, String neurologist) {
        super(name, id, age);
        this.cardiologist = cardiologist;
        this.neurologist = neurologist;
    }

    public String getCardiologist() {
        return cardiologist;
    }

    public void setCardiologist(String cardiologist) {
        this.cardiologist = cardiologist;
    }

    public String getNeurologist() {
        return neurologist;
    }

    public void setNeurologist(String neurologist) {
        this.neurologist = neurologist;
    }

    @Override
    public String displayInfo() {
        return "Doctor{" +
                "cardiologist='" + cardiologist + '\'' +
                ", neurologist='" + neurologist + '\'' +
                '}';
    }

    public void calculateFee(int hours){
        int consultationFee=hours*100;
    }
}
