package test;

public class Test {

    public static void main(String[] args) {

        MyThread[] tests = new MyThread[100];

        for (int i = 0; i < tests.length; i++) {
            tests[i] = new MyThread();
        }

        for (int i = 0; i < tests.length; i++) {
            tests[i].start();
        }

    }
}
