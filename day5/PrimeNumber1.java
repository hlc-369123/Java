/*
输出100000以内的质数
*/

class PrimeNumber1 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    int count = 0;
    label:for (int i = 2;i <= 100000 ;i++) {
      for (int y = 2;y < Math.sqrt(i);y++) {
        if (i % y == 0) {
          continue label;
        }
      }
      count++;
    }
    long end = System.currentTimeMillis();
    System.out.println(count);
    System.out.println(end - start);
  }
}
