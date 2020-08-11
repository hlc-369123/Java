/*
分支结构中的if-else（条件判断结构）
一、三种结构
第一种：单条件判断
if (条件表达式) {
    执行表达式
}

第二种：两个条件判断
if (条件表达式1) {
  执行表达式1
}else {
  执行表达式2
}

第三种：多条件判断
if (条件表达式1) {
  执行表达式1
}else if (条件表达式2) {
  执行表达式2
}else if (条件表达式3) {
  执行表达式3
}else if (...) {
  ...
}else {
  执行表达式n
}

*/

```java
class IfTest {
  public static void main(String[] args) {
    //单条件判断
    boolean b1 = true;
    if (b1) {
      System.out.println("b1为真");
    }

    //两个条件判断
    b1 = false;
    if (b1) {
      System.out.println("b1为真");
    }else {
      System.out.println("b1为假");
    }
    
    //多条件判断
    int b2 = 121;
    if (b2 >=90 && b2 <= 120 ) {
      System.out.println("优秀");
    }else if (b2 >= 80 && b2 < 90) {
      System.out.println("良好");
    }else if (b2 >= 70 && b2 < 80) {
      System.out.println("一般");
    }else if (b2 >= 60 && b2 < 70) {
      System.out.println("及格");
    }else if (b2 < 60 && b2 >= 0) {
      System.out.println("不及格");
    }else {
      System.out.println("不合法数字");
    }
    
      boolean x = true;
      boolean y = false;
      short z = 40;
      if ((z++ == 40) && (y = true)) { //这里面的y是赋值
        System.out.println("z1 :" + z);
        z++;
      }
      if ((x = false) || (++z == 43)) {
        System.out.println("z2 :" + z);
        z++;
      }
      System.out.println("z3 :" + z);

  }
}
```


