/*
运算符之二：赋值运算符
= += -= *= /= %=

*/
class SetvaluTest{
  public static void main(String[] args) {
    //赋值符号： =
    int i1 = 10;
    int i2 = 10;

    int i3,i4;
    i3 = i4 =10;

    int i5 =10,i6 = 20;
    System.out.println(i1 + " " + " " + i2 + " " + " " + i3 + " " + " " + i4 + " " + " " + i5 + " " + " " + i6);

    // +=;
    int num1 = 10;
    int num2 = 2;
    num1 += num2;
    System.out.println(num1);

    num1 /= num2;
    System.out.println(num1);

    num1 %= num2;
    System.out.println(num1);

    short s1 = 10;
    //s1 = s1 + 2; 编译报错
    s1 += 2; //不会改变变量本身的数据类型；
    System.out.println(s1);

    int n1 = 10;
    n1 += (n1++) + (++n1);
    System.out.println(n1); // 32
  }
}
