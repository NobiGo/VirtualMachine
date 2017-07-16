package dx.com.chapter.three;

import java.util.Vector;

/**
 * Created by dx on 2017/7/16.
 */
public class Test3_3_4 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for(int i = 0;i<25;i++){
            vector.add(new byte[1*1024*1024]);
        }
    }
}
