package dx.com.chapter.four;

import java.lang.ref.SoftReference;

/**
 * Created by dx on 2017/7/16.
 */
public class Test4_4_3 {
    public static void main(String[] args) {
        //user 为强引用
        User user = new User(1, "geym");
        //softReference 为软引用
        //通过强引用，建立弱引用
        SoftReference<User> softReference = new SoftReference<User>(user);
        //去除对象的强引用
        user = null;

        System.out.println(softReference.get());
        System.gc();
        System.out.println("After GC:");
        System.out.println(softReference.get());

        byte[] b = new byte[1024 * 925 * 7];
        System.gc();
        System.out.println(softReference.get());
    }

    public static class User {

        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "[id=" + String.valueOf(id) + ",name=" + name + "]";
        }
    }
}
