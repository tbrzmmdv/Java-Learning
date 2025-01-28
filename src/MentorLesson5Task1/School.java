    package MentorLesson5Task1;

    import java.util.Arrays;

    public class School {
        Teacher[] teachers;
        Student[] students;

        public void addTeachers(){
            for (Teacher teachers:teachers){
                String name = teachers.getName();
                System.out.println("Teacher "+name+" is adding");
            }
        }
        public void addStudents(){
            for (Student students:students){
                String name = students.getName();
                System.out.println("Student "+name+" is adding");
            }
        }


        public void displayAllPeople(){
           for (Student students:students){
               students.displayInfo();
           }
           for (Teacher teachers:teachers){
               teachers.displayInfo();
           }
        }


        @Override
        public String toString() {
            return "School{" +
                    "teachers=" + Arrays.toString(teachers) +
                    ", students=" + Arrays.toString(students) +
                    '}';
        }
    }
