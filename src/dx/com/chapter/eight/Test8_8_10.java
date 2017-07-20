package dx.com.chapter.eight;

/**
 * Created by dx on 2017/7/20.
 */
public class Test8_8_10 {
    public static class MyThread extends Thread{
        private volatile boolean stop = false;
        public void stopMe() {
            stop = true;
        }
        public void run(){
            int i = 0;
            while(!stop){
                i++;
            }
            System.out.println("Stop Thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000);
        myThread.stop();
        Thread.sleep(1000);
    }
}