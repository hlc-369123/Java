/*
For循环的结构的使用
一、循环结构的4个要素
1⃣️初始化条件
2⃣️循环条件 ---是boolean类型
3⃣️循环体
4⃣️迭代条件

二、for循环的结构

for（1⃣️；2⃣️；4⃣️）{
  3⃣️
}
*/

class ForTest {
  public static void main(String[] args) {
    char [] ca = {'a','b','c','d','e'};
    for (char x : ca){
      System.out.println(x);
    }
    for (int i = 0;i < 10;i++ ) {
      System.out.println(i);
    }
  }
}
