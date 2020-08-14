/*
从键盘获取用户输入，并统计用户输入的正数和负数的个数，当输入为0时结束统计；

说明：
1、不在循环部分限制执行次数的结构：for(;;)或者while (true)；
2、结束循环有几种方式？
  方式一：循环条件部分返回false
  方式二：在循环体中，执行break
*/
import java.util.Scanner;
class ForWhileTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int positivenumber = 0;
    int minusnumber = 0;
    while (true) { //或者使用for(;;)
      System.out.println("请输入数字🔢：");
      int num = scan.nextInt();
      if (num > 0) {
        positivenumber++;
      }else if (num < 0) {
        minusnumber++;
      }else {
        break;
      }
    }
    System.out.println("正数的个数为：" + positivenumber);
    System.out.println("负数的个数为：" + minusnumber);
  }
}
