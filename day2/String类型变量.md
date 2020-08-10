/*
String类型变量的使用
1、String属于引用数据类型，翻译为：字符串
2、声明String类型变量时，使用一对“”
3、String可以和8种基本的数据类型变量做运算，且运算只能是连接运算：+
4、运算的结果仍然是String类型

*/

```java
class StringTest {
  public static void main(String[] args) {
    String s1 = "hello world!";
    System.out.println(s1);

    String s2 = "a";
    String s3 = "";
    
    //char c = ''; //编译不通过
    
    int num1 = 1001;
    String numStr = "学号: ";
    String info = numStr + num1; // + 连接运算
    System.out.println(info);

  }
}
```


