package MentorLesson14;

import Lesson14.Library;
public class LibrarySysyem {
    public static void main(String[] args) throws InterruptedException {
    Library library=new Library();

        Thread student1=new Thread(()-> library.borrow(4));
        Thread student2=new Thread(()-> library.borrow(7));
        Thread student3=new Thread(()-> library.borrow(6));
        Thread student4=new Thread(()-> library.borrow(2));
        Thread student5=new Thread(()-> library.borrow(1));


        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();

        student1.join();
        student2.join();
        student3.join();
        student4.join();
        student5.join();

        System.out.println("Final books "+library.books);


    }


static class Library {

    public int books=10;

    public synchronized void borrow(int count){

        if (books>=count){
            books-=count;
            System.out.println(Thread.currentThread().getName() + " borrow "+count+ " remaining books "+ books);
        }
        else
            System.out.println(Thread.currentThread().getName() +" tried to borrow books "+ count+" but insufficient books");

    }

}
}
