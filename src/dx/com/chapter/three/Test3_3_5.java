package dx.com.chapter.three;

import java.nio.ByteBuffer;

/**
 * Created by dx on 2017/7/16.
 */
public class Test3_3_5 {
    public void diretAccess(){
        long starttime = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(500);
        for(int i = 0;i<100000;i++){
            for(int j = 0;j<99;j++){
                byteBuffer.putInt(j);
            }
            byteBuffer.flip();
            for(int j = 0;j<99;j++){
                byteBuffer.getInt();
            }
            byteBuffer.clear();
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }

    public void bufferAccess(){
        long starttime = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocate(500);
        for(int i = 0;i<100000;i++){
            for(int j = 0;j<99;j++){
                byteBuffer.putInt(j);
            }
            byteBuffer.flip();
            for(int j = 0;j<99;j++){
                byteBuffer.getInt();
            }
            byteBuffer.clear();
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }


    public static void main(String[] args) {
        Test3_3_5 test3_3_5 = new Test3_3_5();
        test3_3_5.bufferAccess();
        test3_3_5.diretAccess();

        test3_3_5.bufferAccess();
        test3_3_5.diretAccess();

    }
}
