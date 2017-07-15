package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
public class Test2_2_6 {
    public void localvargcl(){
        byte [] a = new byte[6*1024*1024];
        System.gc();
    }
    public void localvargcl2(){
        byte [] a = new byte[6*1024*1024];
        a = null;
        System.gc();
    }

    public void localvargcl3(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvargcl4(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    public void localvargcl5()
    {
        localvargcl();
        System.gc();
    }

    public static void main(String[] args) {
        Test2_2_6 test2_2_6 = new Test2_2_6();
        test2_2_6.localvargcl5();
    }
}
