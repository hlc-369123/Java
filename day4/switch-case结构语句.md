/*
分支结构中的switch-case
1、格式
switch(表达式){
case 常量1:
  执行语句1;
  //break;

case 常量2:
  执行语句2;
  //break;

  case 常量3:
    执行语句3;
    //break;

...
default:
  执行语句n
  //break

}
2、说明：
1⃣️根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功则进入相应的case结构中，调用其执行语句。
  当调用完执行语句以后，则仍然继续向下执行其他case结构中的语句，直到遇到break关键字或者此switch-case结构末尾结束为止。
2⃣️break，可以使用在switch-case语句中，表示一旦执行到此关键字，就跳出switch-case结构
3⃣️switch结构中的表达式，只能是如下的6种数据类型之一：
  byte、 short、 char、 int、 枚举类型（JDK5.0新增）、 String类型（JDK7.0新增）
4⃣️case之后只能声明常量，不能声明范围。
5⃣️default相当于if-else中的esle，default结构是可选，且位置灵活。
*/

```java
class SwitchTest{
  public static void main(String[] args) {
    int number = 3;
    switch (number) {
      case 0:
        System.out.println("zero");
        break;
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      default:
        System.out.println("other");
        break;
    }
  }
}
```


