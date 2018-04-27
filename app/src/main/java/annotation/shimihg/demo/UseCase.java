package annotation.shimihg.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author： Created by shiming on 2018/4/27 14:25
 * mailbox：lamshiming@sina.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    //由于编译器会对id进行类型检查，因此将用例文档的追踪数据库与源代码想关联是可靠的
    public int id();//默认值的限定，首先，元素不能有不确定的值，也就是说，元素必须要么具有默认值，要么具有使用元素提供的元素的值
    //如果注解某个方法没有给出值的话，则该注解的处理器就会使用此元素的默认值
    public String description() default "shiming no descriprition 我是默认的des";
}
