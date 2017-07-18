package dx.com.chapter.seven;

/**
 * Created by dx on 2017/7/18.
 */

import java.util.ArrayList;

/**
 * 堆溢出
 */
public class Test7_1_1 {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        for(int i = 0;i<1024;i++){
            list.add(new byte[1024*1024]);
        }
    }
}
