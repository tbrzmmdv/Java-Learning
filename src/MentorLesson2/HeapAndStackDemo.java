package MentorLesson2;

public class HeapAndStackDemo {


    public static int faktorial(int n) {

        System.out.println("Hesablanan Faktorial="+n);

        if (n==0) {
            return 1;
        }
        else {
            return n*faktorial(n - 1);
        }
    }

    public void createObjects() {
        Person[] people = new Person[2];


        people[0] = new Person("Tural", 30);
        people[1] = new Person("Messi", 25);


        System.out.println("Əvvəl:");
        for (Person p : people) {
            System.out.println(p);
        }

        people[1].setName("Pedri");


        System.out.println("\nSonra:");
        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        int netice=faktorial(4);

        System.out.println("\nFaktorial: " + netice);

        HeapAndStackDemo heapandstack = new HeapAndStackDemo();
        heapandstack.createObjects();
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}


