package MentorLesson5Task2;

public class Hospital {
    Doctor[] doctors=new Doctor[10];
    Patient[] patients=new Patient[20];
    public int numberDoctor=0;
    public int numberPatient=0;
    public void addDoctor(Doctor doctor){

        doctors[numberDoctor]=doctor;
        numberDoctor++;

    }
    public void addDoctor(Patient patient){

        patients[numberPatient]=patient;
        numberPatient++;
    }





    public void assignPatientToDoctor(String patientID,String doctorID){
        for (int i=0;i<=numberDoctor;i++){
            if (doctorID.equals(patients[i]   .getId())){

            }
        }




    }

}
