/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数为4，最小公倍数是60.

说明：break关键字的作用
*/

import java.util.Scanner;
class ForTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("请输入第一个正整数：");
    int m = scan.nextInt();

    System.out.println("请输入第二个正整数：");
    int n = scan.nextInt();

    //获取最大公约数；
    //1、获取两个数中较小的值；
    int min = (m <= n)? m : n;
    for (int i = min; i >= 1;i--) {
      if ((m % i) == 0 && (n % i) == 0) {
        System.out.println(m + " 和 " + n + " 的最大公约数为：" + i);
        break;
      }
    }
    //获取最小公倍数；
    //1.获取两个值中较大的值；
    int max = (m >= n)? m:n;
    for (int i = max;i <= (m * n);i++) {
      if ((i % m) == 0 && (i % n) == 0) {
        System.out.println(m + " 和 " + n + " 的最小公倍数为：" + i);
        break;
      }
    }
  }
}
