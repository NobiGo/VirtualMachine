package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
/**
 * 传递参数实例
 *
 * **/
public class Test2_2_1 {
    public static void main(String[] args) {
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
    }
}
