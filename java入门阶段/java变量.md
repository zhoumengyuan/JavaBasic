## java变量  
#### 1、变量  

变量本质就是代表“可操作的存储空间”，空间的位置是确定的，但是里面放置什么值不确定，我们可以通过变量名访问“对应的存储空间”，从而操纵这个“存储空间”存储的值。 

java是一种强类型的语言，每个变量都必须声明数据类型，变量的数据类型决定了变量占据存储空间的大小，比如，int a = 3;表示a变量的空间大小为4个字节。

变量作为程序中最基本的存储单元，其要素包括变量名，变量类型和作用域，变量在使用前必须对其生活吗，只有在声明以后，才能为其分配相应产固定发存储空间。

变量声明的格式：  
``` 
   数据类型 变量名 = 初始值；
   int a = 3;
   double b = 3.0;
```   
<font color="FF0000">注意：变量需要声明，并且初始化后才可以使用</font>  

#### 2、变量类型  
 局部变量：local variable方法或语句块内部定义的变量。生命周期从声明位置开始到方法或语句块执行完毕为止。
 ``` 
 public class VariableTest {
    public static void main(String[] args) {
        int loc = 1;//局部变量从属于方法，必须初始化，必须赋值，
        System.out.println(a);
    }
}
```   
 成员变量：member variable又叫全局变量，方法外部，类的内部定义的变量。从属于对象，生命周期帮随对象始终。  
 ``` 
 public class VariableTest {
    int mem ;//成员变量从属于对象，自动初始化给默认值。
    public static void main(String[] args) {
        System.out.println(mem);
    }
}
``` 
 静态变量：static variable又叫类变量，使用static定义，从属于类，声明周期伴随类始终，从类加载到卸载。 
  ``` 
  public class VariableTest {
    static int sta ;//静态变量从属于类
    public static void main(String[] args) {
        System.out.println(sta);
    }
    System.out.println(sta);
}
  ``` 
 
### [相关代码](https://github.com/zhoumengyuan/JavaBasic/blob/master/src/main/java/VariableTest.java)
