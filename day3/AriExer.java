/*
随机给出一个三位整数，分别打印百位，十位，个位；
*/
class AriExer{
  public static void main(String[] args) {
    int num = 167;
    int bai = num / 100;
    int shi = num % 100 / 10;
    int ge = num % 10;
    System.out.println("百：" + bai);
    System.out.println("十：" + shi);
    System.out.println("个：" + ge);
  }
}
