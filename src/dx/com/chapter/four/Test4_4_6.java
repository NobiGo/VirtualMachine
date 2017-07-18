package dx.com.chapter.four;

/**
 * Created by dx on 2017/7/16.
 */

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 *使用虚引用跟踪一个客复活对象的回收
 *
 **/
public class Test4_4_6 {
    public static Test4_4_6 test4_4_6;
    static ReferenceQueue<Test4_4_6> phantomQueue = null;

    public static class CheckRefQueue extends Thread{
        @Override
        public  void  run(){
            while (true)
            {
                if(phantomQueue!=null)
                {
                    PhantomReference<Test4_4_6> obj = null;
                    try{
                        obj = (PhantomReference<Test4_4_6>) phantomQueue.remove();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    if(obj!=null)
                        System.out.println("Test4_4_6 is delete by GC");
                }
            }
        }
    }

    @Override
    protected  void finalize() throws Throwable{
        super.finalize();
        System.out.println("Test4_4_6  finalize called");
        test4_4_6 = this;
    }

    @Override
    /***
     * 重写函数
     * 1。 存在继承
     * 2。 函数名／函数参数／返回类型必须一致
     * 3。 异常必须为子异常
     * 4。 权限必须比原函数权限大
     * */
    public String toString(){
        return "I am CanReliveObj";
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CheckRefQueue();
        thread.setDaemon(true);
        thread.start();

        phantomQueue = new ReferenceQueue<Test4_4_6>();
        test4_4_6 = new Test4_4_6();
        PhantomReference<Test4_4_6> phantomReference = new PhantomReference<Test4_4_6>(test4_4_6,phantomQueue);

        test4_4_6 = null;
        System.gc();
        Thread.sleep(1000);


        if(test4_4_6==null)
        {
            System.out.println("test4_4_6 是空");
        }else{
            System.out.println("test4_4_6 可用");
        }

        System.out.println("第二次 GC");
        test4_4_6 = null;
        System.gc();
        Thread.sleep(1000);

        if(test4_4_6==null)
        {
            System.out.println("test4_4_6 是空");
        }else{
            System.out.println("test4_4_6 可用");
        }


    }



}
