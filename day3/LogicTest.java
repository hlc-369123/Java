/*
运算符之四：逻辑运算符

& && | || ! ^
说明：
1、逻辑运算符操作的都是boolean类型的变量；
*/
class LogicTest{
  public static void main(String[] args) {
    //区分 &(逻辑与) 和 &&（短路与）
    //相同点1: & 和 && 运算的结果相同；
    //相同点2: 当符号左边是true时，二者都会执行符号左边的运算
    //不同点：当符号左边是False时，& 会继续执行右边的运算，&&不再执行符号右边的运算。
    //开发中推荐使用&&
    boolean b1 = true;
    int num1 = 10;
    if (b1 & (num1++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num1 " + num1); // num2 11

    boolean b2 = true;
    int num2 = 10;
    if (b2 && (num2++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num2 " + num2); // num2 11


    boolean b3 = false;
    int num3 = 10;
    if (b3 & (num3++ > 0)) {
      System.out.println("北京");
    }else {
      System.out.println("南京"); //南京
    }
    System.out.println("num3 " + num3); //num3 11

    boolean b4 = false;
    int num4 = 10;
    if (b4 && (num4++ > 0)) {
      System.out.println("北京");
    }else {
      System.out.println("南京"); //南京
    }
    System.out.println("num4 " + num4); //num4 10

    //区分 |(逻辑或) 和 （短路或）
    //相同点1: | 和 || 运算的结果相同；
    //相同点2: 当符号左边是false时，二者都会执行符号左边的运算
    //不同点：当符号左边是true时，| 会继续执行右边的运算，||不再执行符号右边的运算。
    //开发中推荐使用||
    boolean b5 = false;
    int num5 = 10;
    if (b5 | (num5++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num5 " + num5); // num5 11

    boolean b6 = false;
    int num6 = 10;
    if (b6 || (num6++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num6 " + num6); // num6 11


    boolean b7 = true;
    int num7 = 10;
    if (b7 | (num7++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num7 " + num7); // num5 11

    boolean b8 = true;
    int num8 = 10;
    if (b8 || (num8++ > 0)) {
      System.out.println("北京"); //北京
    }else {
      System.out.println("南京");
    }
    System.out.println("num8 " + num8); // num8 10
  }
}
