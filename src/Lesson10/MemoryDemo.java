package Lesson10;

public class MemoryDemo {

    static void staticMethod(int a){
        System.out.println("Main number:"+a);
        int staticNumber=20;
        System.out.println("Static number:"+staticNumber );

    }
    void instanceMethod(String name){
        System.out.println("Recieved String:"+name);
        StringBuilder duzelden=new StringBuilder("Example");
        System.out.println("String Builder Value:"+duzelden);
    }

    public static void main(String[] args) {
        int mainNumber =10;
        MemoryDemo demo=new MemoryDemo();
        staticMethod(mainNumber);
        demo.instanceMethod("Hello");

    }
}
