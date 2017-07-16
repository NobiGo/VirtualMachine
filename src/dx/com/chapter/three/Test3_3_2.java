package dx.com.chapter.three;

/**
 * Created by dx on 2017/7/15.
 */
public class Test3_3_2 {
    public static void main(String[] args) {
        System.out.print("max Memory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("tatal mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");

        byte [] b = new byte[1*1024*1024];
        System.out.println("分配了1M空间给数组");

        System.out.print("max Memory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("tatal mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");

        b = new byte[4*1024*1024];
        System.out.println("分配了4M空间给数组");

        System.out.print("max Memory=");
        System.out.println(Runtime.getRuntime().maxMemory()+"bytes");
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory()+"bytes");
        System.out.print("tatal mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+"bytes");

    }
}
