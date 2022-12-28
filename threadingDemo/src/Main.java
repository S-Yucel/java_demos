public class Main {
    public static void main(String[] args) {
        StopwatchThread stopwatchThread1 = new StopwatchThread("thread1");
        StopwatchThread stopwatchThread2 = new StopwatchThread("thread2");
        StopwatchThread stopwatchThread3 = new StopwatchThread("thread3");

        stopwatchThread1.start();
        stopwatchThread2.start();
        stopwatchThread3.start();


    }
}
