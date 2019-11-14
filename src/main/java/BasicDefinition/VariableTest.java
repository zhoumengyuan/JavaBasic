package BasicDefinition;

/**
 * 变量
 */
public class VariableTest {
    static int sta ;//静态变量从属于类
    int var ;//成员变量从属于对象，会给出默认的初始化值
    public static void main(String[] args) {
        int mem = 1;//局部变量从属于方法,必须初始化，必须赋值。
        System.out.println(mem);
    }
}