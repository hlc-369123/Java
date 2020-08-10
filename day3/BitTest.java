 /*
运算符之五：位运算符 （了解）
<< >> & | ^

结论：
1、位运算符操作的都是整型的数据
2、<< ：在一定范围内，每向左移动一位，相当与 * 2；
  >> ：在一定范围内，每向右移动一位，相当与 / 2；
最高效的方式计算 2 * 8 ？
8 << 1 \ 2 << 3
*/
class BitTest{
  public static void main(String[] args) {
    int i = 22;
    //左移动 <<
    System.out.println("i << 1 :" + (i << 1)); //i << 1 :44
    System.out.println("i << 2 :" + (i << 2)); //i << 2 :88
    System.out.println("i << 3 :" + (i << 3)); //i << 3 :176
    System.out.println("i << 4 :" + (i << 4)); //i << 4 :352

    //右移动 >>
    System.out.println("i >> 1 :" + (i >> 1)); //i >> 1 :11
    System.out.println("i >> 2 :" + (i >> 2)); //i >> 2 :5
    System.out.println("i >> 3 :" + (i >> 3)); //i >> 3 :2
    System.out.println("i >> 4 :" + (i >> 4)); //i >> 4 :1

    // & | ^,按照二进制进行计算与或非
    int m = 12;
    int n = 5;
    System.out.println("m & n :" + (m & n)); //m & n :4
    System.out.println("m | n :" + (m | n)); //m | n :13
    System.out.println("m ^ n :" + (m ^ n)); //m ^ n :9

    //交换两个变量的值
    //方式一：定义临时变量的方式
    //推荐的方式
    int num1 = 10;
    int num2 = 20;
    System.out.println("num1 :" + num1 + ",num2 :" + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("num1 :" + num1 + ",num2 :" + num2);

    //方式二：好处不用定义临时变量
    //弊端：相加操作可能会超出存储的范围，
    //     有局限性：只能适用于数值类型
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.println("num1 :" + num1 + ",num2 :" + num2);

    //方式三：使用位运算符
    //有局限性：只能适用于数值类型
    num1 = num1 ^ num2;
    num2 = num1 ^ num2;
    num1 = num1 ^ num2;
    System.out.println("num1 :" + num1 + ",num2 :" + num2);
  }
}
