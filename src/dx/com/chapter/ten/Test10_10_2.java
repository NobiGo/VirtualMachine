package dx.com.chapter.ten;

/**
 * Created by dx on 2017/7/18.
 */

/**
 * 在引用一个字段时，只有直接定义该字段的类，才会被初始化
 */
public class Test10_10_2 {
    public static void main(String[] args) {
        System.out.println(Child.i);
    }
}


