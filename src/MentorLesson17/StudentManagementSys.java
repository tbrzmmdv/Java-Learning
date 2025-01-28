package MentorLesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSys {
    private static List<Student> students = new ArrayList<>();



    private static void allDeatils() {
        StringBuilder report = new StringBuilder();
        report.append("\nButun telebe melumatlari:\n");
        for (Student student : students) {
            report.append(student).append("\n");
        }
        System.out.println(report);
    }

    private static void concurrentUpdateDemo(String name, int newGrade) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                Thread thread1 = new Thread(() -> {
                    synchronized (student) {
                        student.setGrades(newGrade);
                        System.out.println("Thread 1 tezelendi: " + student.getGrades());
                    }
                });

                Thread thread2 = new Thread(() -> {
                    synchronized (student) {
                        student.setGrades(newGrade);
                        System.out.println("Thread 2 tezelendi: " + student.getGrades());
                    }
                });

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }
        }

    }

    public static void searchWithName(String name) {
        boolean found = false;

        for (Student studentList : students) {
            if (studentList.getName().equals(name)) {
                System.out.println("Telebe:" + studentList);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nTelebe yoxdur.");
        }
    }

    public static void updateStudent(String name, Scanner scanner) {

        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("\nTezelenen Telebe Melumatlari:");
                System.out.print("Yeni email yazin: ");
                student.setEmail(scanner.nextLine());
                System.out.print("Yeni telefon nomresi daxil edin: ");
                student.setPhone(scanner.nextLine());
                System.out.print("Yeni ballar: ");
                student.setGrades(scanner.nextInt());

                System.out.println("\nTezelenen Telebe Melumatlari:\n" + student);
                return;
            }
        }

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Telebenin adi:");
        String name = scanner.nextLine();
        System.out.println("Telebenin emaili:");
        String email = scanner.nextLine();
        System.out.println("Telebenin nomersi:");
        String phone = scanner.nextLine();
        System.out.println("Telebenin Ballari:");
        int grades = scanner.nextInt();

        Student newStudent = new Student(name, email, phone, grades);
        students.add(newStudent);
        System.out.println("\n" + newStudent);

        System.out.print("Axtarmaq istediyiniz telebe: ");
        scanner.nextLine();
        String searchName = scanner.nextLine().trim();
        searchWithName(searchName);
        System.out.print("Tezelemek istediyiniz telebe: ");
        String updateName = scanner.nextLine().trim();
        updateStudent(updateName, scanner);



        System.out.print("Thread ile tezelenecek telebe: ");
        scanner.nextLine();
        String concurrentName = scanner.nextLine().trim();
        concurrentUpdateDemo(concurrentName, 90);

        allDeatils();


    }


}
