import java.util.Scanner;
class IfTest1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入岳小鹏期末成绩：");
    int score = scan.nextInt();
    if (score == 100) {
      System.out.println("BWM");
    }else if (score <= 99 && score > 80) {
      System.out.println("iphone XS");
    }else if (score <= 80 && score >= 60) {
      System.out.println("iPad");
    }else {
      System.out.println("什么也没有");
    }
  }

}
