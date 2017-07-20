package dx.com.chapter.ten;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by dx on 2017/7/18.
 */
public class Test10_10_4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clzStr = Class.forName("java.lang.String");
        Method [] methods = clzStr.getDeclaredMethods();
        for(Method method:methods){
            String mod = Modifier.toString(method.getModifiers());
            System.out.print(mod+" "+method.getName()+" (");
            Class<?>[] parameters = method.getParameterTypes();
            if(parameters.length==0)
                System.out.print(") ");
            for(int i = 0;i<parameters.length;i++){
                char end = (i == parameters.length-1)?')':',';
                System.out.print(parameters[i].getSimpleName()+end);
            }
            System.out.println();
        }
    }
}
