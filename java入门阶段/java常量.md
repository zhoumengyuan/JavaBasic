## java常量  
#### 1.常量（constant）
常量通常指的是一个固定的值，例如1、2、3、"a"、"b"、true、false、"helloworld"等。
在java语言中，主要是利用关键字final来定义一个常量，常量一旦被初始化后不能在更改其值。
 ``` 
 public class ConstantTest {
    public static void main(String[] args) {
        final double PAI = 3.14;//3.14是常量，pai也是常量不可更改
        double r = 4;//4是常量，r是变量可更改 
        r =5;
    }
}
 ``` 
 注意:变量和常量命名规范  
 1、所有变量、方法、类名，见名知意  
 2、类成员变量和局部变量：首字母小写和驼峰原则：monthSalary  
 3、常量：大写字母和下划线：MAX_VALUE  
 4、类名：首字母大写和驼峰原则：Man，GoodMan  
 5、方法名：首字母小写和驼峰命名：run(),runRun()  
 ## [相关代码]()
