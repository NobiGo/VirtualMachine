package dx.com.chapter.three;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import com.sun.xml.internal.ws.org.objectweb.asm.MethodVisitor;
import com.sun.xml.internal.ws.org.objectweb.asm.Opcodes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dx on 2017/7/15.
 */
public class Test3_3_1 implements Opcodes{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_6,ACC_PUBLIC,"Example",null,"java/lang/Object",null);
        MethodVisitor mw = cw.visitMethod(ACC_PUBLIC,"<init>","()V",null,null);
        mw.visitVarInsn(ALOAD,0);
        mw.visitMethodInsn(INVOKESPECIAL,"java/lang/Object","<init>","()V");
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();
        mw = cw.visitMethod(ACC_PUBLIC+ACC_STATIC,"main","([Ljava/lang/String;)V",null,null);
        mw.visitFieldInsn(GETSTATIC,"java/lang/System","out","Ljava/io/PrintStream;");
        mw.visitLdcInsn("Hello World");
        mw.visitMethodInsn(INVOKEVIRTUAL,"java/io/PrintStream","println","(Ljava/lang/String;)V");
        mw.visitInsn(RETURN);
        mw.visitMaxs(0,0);
        mw.visitEnd();
        byte [] code = cw.toByteArray();


        for(int i = 0;i<10;i++){
            Test3_3_1 loader = new Test3_3_1();
            Method m = ClassLoader.class.getDeclaredMethod("defineClass",String.class,byte[].class,int.class,int.class);
            m.setAccessible(true);
            m.invoke(loader,"Example",code,0,code.length);
            m.setAccessible(false);
            System.gc();
        }
    }
}
