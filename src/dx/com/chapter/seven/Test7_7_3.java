package dx.com.chapter.seven;

/**
 * Created by dx on 2017/7/18.
 */
public class Test7_7_3 {
    public static class SleepThread implements Runnable{
        @Override
        public void run(){
            try{
                Thread.sleep(10000000);
            }catch (InterruptedException e){

            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<15000000;i++){
            new Thread(new SleepThread(),"Thread"+i).start();
            System.out.println("Thread"+i+"created");
        }
    }
}
/**
 *
 *
 *没有参数
 Thread2689created
 Thread2690created
 Thread2691created
 Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread


设置-Xmx参数，使操作系统把更多参数
 Thread3125created
 Thread3126created
 Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
 */
