
public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread(1000, "First");
        Thread t2 = new MyThread(1000, "Second");

        t1.start();
        t2.start();

        /*new ThisThread(900, "First");
        new ThisThread(900, "Second");*/

        /*Thread[] t = new Thread[20];
        for (int i = 0; i < t.length; i++) {
            t[i] = new MyThread((i + 1) * 10, "Thread #" + i);
            t[i].start();
        }*/
    }
}
