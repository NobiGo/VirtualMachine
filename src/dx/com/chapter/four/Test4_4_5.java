package dx.com.chapter.four;

import java.lang.ref.WeakReference;

/**
 * Created by dx on 2017/7/16.
 */
public class Test4_4_5 {


    public static class User{

        public int id;
        public String name;

        public User(int id,String name){
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return "[id="+String.valueOf(id)+",name="+name+"]";
        }
    }

    public static void main(String[] args) {
        //user 为强引用
        User user = new User(1,"geym");
        //通过强引用，建立弱引用
        WeakReference<User> weakReference = new WeakReference<User>(user);
        user = null;

        System.out.println(weakReference.get());
        System.gc();
        //不管内存足够与否都会进行回收
        System.out.println("After GC：");
        System.out.println(weakReference.get());
    }
}
