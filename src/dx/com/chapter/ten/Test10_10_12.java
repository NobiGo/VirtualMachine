package dx.com.chapter.ten;

/**
 * Created by dx on 2017/7/19.
 */
public class Test10_10_12 {
    public static void main(String[] args) {
        ClassLoader classLoader = Test10_10_12.class.getClassLoader();
        while(classLoader!=null){
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
        System.out.println(String.class.getClassLoader());
    }
}
