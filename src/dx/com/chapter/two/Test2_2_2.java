package dx.com.chapter.two;

/**
 * Created by dx on 2017/7/15.
 */
public class Test2_2_2 {
    private int id;

    public Test2_2_2(int id){
        this.id  = id;
    }

    public void show(){
        System.out.println("my Id is:"+id);
    }
    public static void main(String[] args) {
    Test2_2_2 test2_2_2 = new Test2_2_2(1);
    Test2_2_2 test2_2_21 = new Test2_2_2(2);
    test2_2_2.show();
    test2_2_21.show();
    }
}
