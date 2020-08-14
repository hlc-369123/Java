/*
do while 循环的使用

一、循环结构的4个要素
1⃣️初始化条件
2⃣️循环条件  ---》是boolean类型
3⃣️循环体
4⃣️迭代条件

二、do-while循环结构

1⃣️
do{
  3⃣️；
  4⃣️；
}while（2⃣️）
执行过程：1⃣️ - 3⃣️ - 4⃣️ -  2⃣️ - 3⃣️ - 4⃣️ 。。。- 2⃣️

说明：
1、do-while循环至少会执行一次循环体
2、开发中使用for和while循环比较多，较少使用do-while循环；
*/
class DoWhileTest {
  public static void main(String[] args) {
    int num = 1;
    int sum = 0;
    int count = 0;
    do {
      if (num % 2 == 0) {
        System.out.println(num);
        sum += num;
        count++;
      }
      num++;
    } while (num <= 100);
    System.out.println("总和为：" + sum);
    System.out.println("总个数为：" + count);
  }
}
