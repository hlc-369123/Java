/*
while 循环的使用

一、循环结构的4个要素
1⃣️初始化条件
2⃣️循环条件  ---》是boolean类型
3⃣️循环体
4⃣️迭代条件

二、while循环结构

1⃣️
while（2⃣️）{
  3⃣️；
  4⃣️；
}
执行过程：1⃣️ - 2⃣️ - 3⃣️ - 4⃣️ -  2⃣️ - 3⃣️ - 4⃣️ 。。。- 2⃣️

说明：
1⃣️、写while循环千万不要丢了迭代条件，一旦丢了，就可能导致无限循环；
2⃣️、写程序，要避免出现无限循环的情况。（算法有限性）
3⃣️、for循环和while循环是可以相互转换的！

区别：
  for循环和while循环的初始化条件部分的作用范围不同。
*/
class WhileTest {
  public static void main(String[] args) {
    int num = 1;
    while (num < 100) {
      if (num % 2 == 0) {
        System.out.println(num);
      }
      num++;
    }
  }
}
