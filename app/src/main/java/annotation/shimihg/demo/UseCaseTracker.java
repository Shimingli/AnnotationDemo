package annotation.shimihg.demo;

import android.annotation.SuppressLint;
import android.util.FloatProperty;

import java.lang.reflect.Method;
import java.util.List;

/**
 * author： Created by shiming on 2018/4/27 15:16
 * mailbox：lamshiming@sina.com
 *
 * 如果没有用来读取注解的工具，那么注解也不会比注释更加有用
 */
public class UseCaseTracker {
    @SuppressLint("UseValueOf")
    public static void trackUseCases(List<Integer> useCases, Class<?> cl){
        /**
         * getDeclaredMethods返回 Method 对象的一个数组，
         * 这些对象反映此 Class 对象表示的类或接口声明的所有方法，
         * 包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法
         */
        for (Method m:cl.getDeclaredMethods()){
            UseCase annotation = m.getAnnotation(UseCase.class);
            System.out.println("执行了第几次 "+annotation+"----->m.getName"+m.getName());
            if (annotation!=null){
                System.out.println("shiming  "+annotation.id()+"---->"+annotation.description());
                //注意这是元素还有角标的问题
                useCases.remove(new Integer(annotation.id()));
            }
            for (int i:useCases){
                System.out.println("shiming warning Missing usecase"+i);
            }
        }
    }
}
