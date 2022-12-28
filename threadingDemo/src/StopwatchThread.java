public class StopwatchThread implements Runnable {

    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName){
        this.threadName = threadName;
        System.out.println("being created : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("running : " + threadName);

        try {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException exception){
            System.out.println("broken : " + threadName);
        }
        System.out.println("Thread finished : " + threadName);

    }
    public void start(){
        System.out.println("Creating thread object");
        if (thread == null){
            thread= new Thread(this,threadName);
            thread.start();
        }
    }
}
