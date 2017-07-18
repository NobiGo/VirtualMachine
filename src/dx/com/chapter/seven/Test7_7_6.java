package dx.com.chapter.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dx on 2017/7/18.
 */
public class Test7_7_6 {
    /**
    public static void main(String[] args) {
        List<String> list  = new ArrayList<String>();
        int i = 0;
        while(true){
           list.add(String.valueOf(i++).intern());
        }
    }

     **/
    public static void main(String[] args) {
        if(args.length==0)
            return;
        System.out.println(System.identityHashCode((args[0]+Integer.toString(0))));
        System.out.println(System.identityHashCode((args[0]+Integer.toString(0)).intern()));
       // System.gc();
        System.out.println(System.identityHashCode((args[0]+Integer.toString(0)).intern()));
    }
}
