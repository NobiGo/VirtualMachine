package dx.com.chapter.seven;

import java.nio.ByteBuffer;

/**
 * Created by dx on 2017/7/18.
 */

/**
 * 直接内存溢出
 */

public class Test7_7_2 {
    public static void main(String[] args) {
         for(int  i = 0 ;i<1024;i++){
            ByteBuffer.allocateDirect(1024*1024);
            System.out.println(i);
        }
    }
}
