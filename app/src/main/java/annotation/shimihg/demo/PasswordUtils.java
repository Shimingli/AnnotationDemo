package annotation.shimihg.demo;

/**
 * author： Created by shiming on 2018/4/27 14:35
 * mailbox：lamshiming@sina.com
 * 注解的元素在使用时候为名-值对的形式，并需要置于@USECase申明之后的括号内，在方法注解中可以给出description的值，也可以不给
 * 因此，在UseCase的注解处理器分析处理这个类时会使用该元素的默认值
 */
public class PasswordUtils {
    @UseCase(id = 1,description = "start need d  我是id==1")
    public boolean validatePassword(String s){
        return s.startsWith("d");
    }

    @UseCase(id = 2)
    public String validatePasswordReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    @UseCase(id = 3,description = "start need 我是id==3")
    public boolean validatePasswordStirng(String s){
        return s.startsWith("shiming");
    }

}
