package dx.com.chapter.ten;

/**
 * Created by dx on 2017/7/19.
 */
public class Test10_10_11 extends  Thread{

    private char flag;

    public Test10_10_11(char flag){
        this.flag = flag;
        this.setName("Thread"+flag);
    }

    @Override
    public void run(){
        try{
            Class.forName("dx.com.chapter.ten.Static"+flag);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(getName()+"Over");
    }


    public static void main(String[] args) {
        Test10_10_11 loadA = new Test10_10_11('A');
        Test10_10_11 loadB = new Test10_10_11('B');
        loadA.start();
        loadB.start();

    }
}

class StaticA{

    static {
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){

        }
        try{
            Class.forName("dx.com.chapter.ten.StaticA");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("StaticA init ok");
    }
}

class StaticB{

    static {
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){

        }
        try{
            Class.forName("dx.com.chapter.ten.StaticA");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("StaticB init ok");
    }
}