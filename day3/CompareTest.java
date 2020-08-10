/*
== != > < >= <= instanceof
1、比较运算符的结果是boolean类型；
2、区分 == 和 =
*/
class CompareTest{
  public static void main(String[] args) {
    int i = 10;
    int j = 20;
    System.out.println(i == j); //不想等 false；
    System.out.println(i = j); //将j赋值给i，然后打印i，结果为20；

    boolean b1 = true;
    boolean b2 = false;
    System.out.println(b1 == b2); //false
    System.out.println(b2 = b1); //true

  }
}
