package MentorLesson4;

public class Dog extends Animal{
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayInfo(){
        System.out.println("dog breed");
    }
    @Override
    public void makeSound(){
        System.out.println("Dog Barking");
    }
}
