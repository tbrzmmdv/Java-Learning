package MentorLesson20;

import java.util.HashSet;
import java.util.Objects;

public class Task3 {

    static class Person{

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {

        HashSet<Person> personHashSet=new HashSet<>();
        personHashSet.add(new Person("Messi",10));
        personHashSet.add(new Person("Ronaldo",10));
        personHashSet.add(new Person("Tebriz",10));
        personHashSet.add(new Person("Messi",10));
        personHashSet.add(new Person("Akula",10));
        System.out.println(personHashSet.size());

    }
}
