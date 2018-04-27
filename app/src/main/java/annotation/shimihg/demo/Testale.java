package annotation.shimihg.demo;

/**
 * author： Created by shiming on 2018/4/27 11:42
 * mailbox：lamshiming@sina.com
 */
public class Testale {
    public void execute(){
        System.out.println("shiming execute");
    }
    @Test
    void testExecute(){
        execute();
    }
}
