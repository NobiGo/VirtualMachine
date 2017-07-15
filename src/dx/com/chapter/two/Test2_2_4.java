package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
public class Test2_2_4 {

    private static int count = 0;
    public static void recursion(long a,long b,long c){
        count++;
        long e = 1,f = 2,g = 3,h = 4,i = 5,j = 6,k = 7,l = 8,m = 9,n = 10;
        recursion(a,b,c);
    }
    public static void recursion(){
        count ++;
        recursion();
    }
    public static void main(String[] args) {
        try{
            recursion();
        }catch (Throwable e)
        {
            System.out.println(count);
            e.printStackTrace();
        }
    }
}
