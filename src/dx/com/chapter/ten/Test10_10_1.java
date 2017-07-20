package dx.com.chapter.ten;

/**
 * Created by dx on 2017/7/18.
 */

/**
 * 初始化子类时，必须先初始化父类
 */
public class Test10_10_1 {
    public static void main(String[] args) {

        Child child = new Child();
    }
}

class Parent{
    static{
        System.out.println("Pareant Init");
    }

    //类不会被初始化
    public static final String constString = "Hello Init";
    //只有父类会被初始化
    public  static  int i =100;
}

class Child extends Parent{
    static{
        System.out.println("Child Init");
    }
}