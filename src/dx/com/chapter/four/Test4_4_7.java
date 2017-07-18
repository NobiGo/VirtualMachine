package dx.com.chapter.four;

import java.util.HashMap;

/**
 * Created by dx on 2017/7/18.
 */
public class Test4_4_7 {
    /**
     * 消耗资源，引发GC
     */
    public static class MyThread extends Thread{
        HashMap map = new HashMap();
        @Override
        public void run(){
            try{
                while (true)
                {
                    if(map.size()*512/1024/1024>=900){
                        map.clear();
                        System.out.println("clean map");
                    }

                    byte [] b1;
                    for(int i = 0;i<100;i++){
                        b1 = new byte[512];
                        map.put(System.nanoTime(),b1);
                    }
                    Thread.sleep(1);
                }
            }catch (Exception e){

            }
        }
    }

    /**
     * 每0.1秒在控制台上进行一次时间戳输出
     */
    public static class PrintThread extends Thread{
        public static final long systemTime = System.currentTimeMillis();
        @Override
        public void run(){
            try{
                while (true){
                    long time = System.currentTimeMillis() - systemTime;
                    System.out.println(time/1000+"."+time%1000);
                    Thread.sleep(100);
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        PrintThread printThread = new PrintThread();
        thread.start();
        printThread.start();
    }

}
