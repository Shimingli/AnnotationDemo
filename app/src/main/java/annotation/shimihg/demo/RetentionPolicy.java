package annotation.shimihg.demo;

/**
 * author： Created by shiming on 2018/4/27 15:09
 * mailbox：lamshiming@sina.com
 */
public enum  RetentionPolicy {
        /**
         * Annotations are to be discarded by the compiler.
         * 注解将被编译器丢弃
         */
        SOURCE,

        /**
         * Annotations are to be recorded in the class file by the compiler
         * but need not be retained by the VM at run time.  This is the default
         * behavior.
         * 注解在class文件中可用，但会被VM丢弃
         */
        CLASS,

        /**
         * Annotations are to be recorded in the class file by the compiler and
         * retained by the VM at run time, so they may be read reflectively.
         * VM将在运行期也保留注解，因此可以通过反射机制读取注解的信息
         * @see java.lang.reflect.AnnotatedElement
         */
        RUNTIME

}
