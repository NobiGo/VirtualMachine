package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
public class Test2_2_8 {
    public static void main(String[] args) {
        int i = 0;
        try{
            for(i = 0;i<100000;i++){

            }
        }catch (Exception e){
            System.out.println("total create count"+i);
        }
    }
}
