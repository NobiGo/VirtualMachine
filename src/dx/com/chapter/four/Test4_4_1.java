package dx.com.chapter.four;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by dx on 2017/7/16.
 */
public class Test4_4_1 {

    public static Test4_4_1 test4_4_1;

    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize called");
        test4_4_1 = this;
    }

    public String toString(){
        return "I am CanReliveObj";
    }

    public static void main(String []  args) throws InterruptedException {
        test4_4_1 = new Test4_4_1();
        test4_4_1 = null;
        System.gc();
        Thread.sleep(1000);
        if(test4_4_1==null)
        {
            System.out.println("test4_4_1 是空");
        }else{
            System.out.println("test4_4_1 可用");
        }

        System.out.println("第二次 GC");
        test4_4_1 = null;
        System.gc();
        Thread.sleep(1000);

        if(test4_4_1==null)
        {
            System.out.println("test4_4_1 是空");
        }else{
            System.out.println("test4_4_1 可用");
        }
    }
}
