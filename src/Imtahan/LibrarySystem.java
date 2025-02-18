package Imtahan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

    private static final List<User> users=new ArrayList<>();
    private static final List<Book> books=new ArrayList<>();
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("📚 Kitabxana Sistemi");
            System.out.println("1. Kitab Elave et+");
            System.out.println("2. Kitablar+");
            System.out.println("3. Istifade registeri+");
            System.out.println("4. Istifadeciler+");
            System.out.println("5. Kitab borca goturmek");
            System.out.println("6. Kitab geri qaytarmaq");
            System.out.println("7. Kitab axtar (Başlığa Göre)");
            System.out.println("8. Istifadeci sil");
            System.out.println("9. Cixis");
            System.out.print("Seçiminizi girin: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> listBooks();
                case 3 -> registerUser();
                case 4 -> listUsers();
                case 5 -> borrowBook();
                case 6 -> returnBook();
                case 7 -> searchBook();
                case 8 -> deleteUser();
                case 9 -> {
                    System.out.println("Sistemden cixilir...");
                    return;
                }
                default -> System.out.println("Tekrar yoxlayin!");
            }
        }
    }

    private static void deleteUser() {
        System.out.println("Silmek istediyiniz userin emailini yazin:");
        String email= scanner.nextLine();
        for (User user:users){
            if (user.getEmail().equalsIgnoreCase(email)){
                users.remove(user);
                System.out.println("User silindi.");
                return;
            }
            else {
                System.out.println("User tapilmadi");
            }
        }
    }

    private static void searchBook() {
        System.out.println("Axtarmaq istediyiniz kitabin basligini yazin");
        String title= scanner.nextLine();
        for (Book book:books){
            if (book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Axtardiginiz kitab:"+book);
                return;
            }else {
                System.out.println("Kitab tapilmadi");
            }
        }

    }

    private static void returnBook() {
        System.out.println("Qaytarmaq istediyiniz kitabi secin:");
        int id=scanner.nextInt();
        for (Book book:books){
            if (id == book.getId()){
                book.returnBooks();
                System.out.println("Kitab qaytarildi.");
                return;
            }
            else {
                System.out.println("Kitab yoxdur");
            }
        }

    }

    private static void borrowBook() {
        System.out.println("Borca goturmek istediyiniz kitabi secin:");
        int id=scanner.nextInt();
        for (Book book:books){
            if (id == book.getId()){
                book.borrowBook();
                System.out.println("Kitab borca goturuldu.");
                return;
            }
            else {
                System.out.println("Kitab yoxdur");
            }
        }
    }

    private static void listUsers() {
        users.forEach(System.out::println);
    }

    private static void registerUser() {
        System.out.println("Istifadeci adi:");
        String userName=scanner.nextLine();
        System.out.println("Istifadeci emaili:");
        String email=scanner.nextLine();
        users.add(new User(userName,email));
        System.out.println("Istifadeci elave olundu");
    }

    private static void listBooks() {
        if (!books.isEmpty()){
            books.forEach(System.out::println);
            return;
        }
        System.out.println("nnot found");
    }

    private static void addBook() {
        System.out.println("Kitab basligi:");
        String title= scanner.nextLine();
        System.out.println("Kitabin yazari:");
        String author= scanner.nextLine();
        System.out.print("Il: ");
        int year = scanner.nextInt();
        System.out.print("Kopyalarin sayi:");
        int copies = scanner.nextInt();
        books.add(new Book(title,author,year,copies));
        System.out.println("Kitab elave olundu.");
    }


}

