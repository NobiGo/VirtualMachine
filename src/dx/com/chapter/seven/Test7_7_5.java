package dx.com.chapter.seven;

/**
 * Created by dx on 2017/7/18.
 */
public class Test7_7_5 {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("abc");
        System.out.println(string1==string2);
        System.out.println(string1==string2.intern());
        System.out.println("abc"==string2.intern());
        System.out.println(string1.intern()==string2.intern());
    }
}
