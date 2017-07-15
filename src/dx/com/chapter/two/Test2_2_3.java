package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
public class Test2_2_3 {
    private static int count = 0;
    public static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try{recursion();}catch (Error e)
        {
            System.out.println("deep of calling"+count);
            e.printStackTrace();
        }
    }
}
