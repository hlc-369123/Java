/*
使用Java输出9*9乘法表；
*/
class NineNineTest {
  public static void main(String[] args) {
    for (int i = 1;i <= 9;i++) {
      for (int y = 1;y <= i;y++) {
        System.out.print(i + " * " + y + " = " + (i * y) + " ");
      }
      System.out.print(";");
      System.out.println("\n");
    }
  }
}
