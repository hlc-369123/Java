Java规范的三种注释方式：

- 单行注释
- 多行注释
- 文档注释（java特有）

单行注释和多行注释的作用：

- 对所写的程序进行解释说明，增强可读性，方便自己，方便别人
- 调试所写的代码

特点：

- 单行注释和多行注释的内容不参与编译

  换句话说，编译以后生成的 .class结尾的字节码文件中不包含注释的信息

- 多行注释不允许嵌套多行注释

文档注释的作用：

注释的内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档。

如：

/**

文档注释：

@author hlc

@version v1.0

这是我的第一个java程序！非常的开森！

 */

```bash
javadoc -d myHello -author -version HelloJava.java
# myHello 为生成解析后文档所在目录；
# HelloJava.java为带有文档注释的java程序文件；
# 运行之后会在当前的目录下生成myHello的目录，通过打开该目录下的“index.html”即可查看文档注释内容。
```

```java
class HellloJava{
  /*
  多行注释：
  如下的main方法是程序的入口！
  main的格式是固定的！
  */
  /**
  如下的main()方法是程序的入口.
  */
  public static void main(String[] args){
    //单行注释：如下的语句表示输出到控制台
    //System.out.println("Hello World!")
    System.out.println("Hello World!");
  }
}
```

