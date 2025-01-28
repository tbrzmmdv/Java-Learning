package MentorLesson19;


import java.util.ArrayList;
import java.util.List;

class Unknown<T> {

    private List<T> values = new ArrayList<>();

    public List<T> getValues() {
        return values;
    }

    public void setValues(T value) {
        values.add(value);

    }
}


public class Main {
    public static void main(String[] args) {
        Unknown<String> names = new Unknown<>();
        Unknown<Integer> ages = new Unknown<>();


        names.setValues("Messi");
        names.setValues("Leo");

        for (String name : names.getValues()) {
            System.out.println(name);
        }


        ages.setValues(20);
        ages.setValues(30);
        ages.setValues(40);

        for (Integer age : ages.getValues()) {
            System.out.println(age);
        }


    }


}
