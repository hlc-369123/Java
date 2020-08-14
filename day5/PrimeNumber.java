/*
输出100000以内的质数
*/

class PrimeNumber {
  public static void main(String[] args) {
    boolean ifFlag = true;
    long start = System.currentTimeMillis();
    int count = 0;

    for (int i = 2;i <= 100000 ;i++) {
      for (int y = 2;y < Math.sqrt(i);y++) {
        if (i % y == 0) {
          ifFlag = false;
          break;
        }
      }
      if(ifFlag){
        //System.out.println(i);
        count++;
      }
      ifFlag = true;
    }
    long end = System.currentTimeMillis();
    System.out.println(count);
    System.out.println(end - start);
  }
}
