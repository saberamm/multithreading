package starving;

public class Main {

    public static void main(String[] args) {

        Starvation thread0 = new Starvation();
        thread0.setPriority(10);
        Starvation thread1 = new Starvation();
        thread1.setPriority(7);
        Starvation thread2 = new Starvation();
        thread2.setPriority(5);
        Starvation thread3 = new Starvation();
        thread3.setPriority(3);
        Starvation thread4 = new Starvation();
        thread4.setPriority(1);

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}