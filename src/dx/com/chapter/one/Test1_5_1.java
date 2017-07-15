package dx.com.chapter.one;

/**
 * Created by dx on 2017/7/15.
 */
/**
 * 查看2进制位的每一位
 *0x80000000是首位为1，其余位为0的整数
 * **/
public class Test1_5_1 {
    public static void main(String[] args) {
        int value = -10;
        for(int i = 0;i<32;i++){
            int t = (value & 0x80000000>>>i)>>>(31-i);
            System.out.print(t);
        }
    }
}
