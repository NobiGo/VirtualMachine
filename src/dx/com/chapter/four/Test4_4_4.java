package dx.com.chapter.four;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * Created by dx on 2017/7/16.
 */
public class Test4_4_4 {
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

    //引用队列
    static ReferenceQueue<User> softQueue = null;

    public static class CheckRefQueue extends Thread{
       @Override
        public  void  run(){
           while (true)
           {
               if(softQueue!=null)
               {
                   UserSoftReference obj = null;
                   try{
                       obj = (UserSoftReference)softQueue.remove();
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }

                   if(obj!=null)
                       System.out.println("User id"+obj.uid+"is delete");
               }
           }
       }
    }

    public static class UserSoftReference extends SoftReference<User>{

        int uid;
        public UserSoftReference(User referent,ReferenceQueue<? super User> q) {
            super(referent,q);
            uid = referent.id;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CheckRefQueue();
        thread.setDaemon(true);
        thread.start();

        User user = new User(1,"geym");
        softQueue = new ReferenceQueue<User>();
        UserSoftReference userSoftReference = new UserSoftReference(user,softQueue);
        user = null;
        System.out.println(userSoftReference.get());
        System.gc();
        System.out.println("After GC:");
        System.out.println(userSoftReference.get());

        System.out.println("try to create byte array and GC");
        byte [] bytes = new byte[1024*924*7];
        System.gc();
        System.out.println(userSoftReference.get());
        Thread.sleep(1000);
    }
}
