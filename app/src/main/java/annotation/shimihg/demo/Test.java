package annotation.shimihg.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author： Created by shiming on 2018/4/27 11:41
 * mailbox：lamshiming@sina.com
 * 　　@Target(ElementType.TYPE)   //接口、类、枚举、注解
 * 　　@Target(ElementType.FIELD) //字段、枚举的常量
 * 　　@Target(ElementType.METHOD) //方法
 * 　　@Target(ElementType.PARAMETER) //方法参数。参数声明
 * 　　@Target(ElementType.CONSTRUCTOR)  //构造函数，构造器的声明
 * 　　@Target(ElementType.LOCAL_VARIABLE)//局部变量
 * 　　@Target(ElementType.ANNOTATION_TYPE)//注解
 * 　　@Target(ElementType.PACKAGE) ///包
 */
@Target(ElementType.METHOD)//定义你的注解将应用在什么地方（一个方法，一个域）
@Retention(RetentionPolicy.RUNTIME)//定义注解在哪个级别可以使用，在源码中（SOURCE）、类文件中（CALSS），或者运行时（RUNTIME）
//没有元素的注解，称为标记注解（marker annotation），如果某个方法或者实现某个用例的需求，加上次方法，项目经理可以很好地观察到进度
//如果需要修改系统的业务逻辑，则维护改项目的开发人员也可以很容易的找到相对于的实例
public @interface Test {
}
