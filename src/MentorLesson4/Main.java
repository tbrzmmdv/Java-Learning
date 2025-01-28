package MentorLesson4;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Messi");
        animal.makeSound();
        animal.displayInfo();
        System.out.println();

        Animal dog=new Dog("Ronaldo","Breed");
        dog.makeSound();
        dog.displayInfo();




    }

}
