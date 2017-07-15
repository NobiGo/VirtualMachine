package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */

/**
 * 非逃逸对象的栈上分配
 *
 * **/
public class Test2_2_7 {

    public static class User{
        public int id = 0;
        public String name = "";
    }

    public static void alloc(){
        User user = new User();
        user.id = 5;
        user.name = "geym";
    }

    public static void main(String[] args) throws  InterruptedException{
        long b = System.currentTimeMillis();
        for(int i = 0;i<1000000000;i++){
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
