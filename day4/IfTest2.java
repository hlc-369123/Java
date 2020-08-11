/*
从键盘中获取三个整数，使用if else进行排序
*/

import java.util.Scanner;

class IfTest2{
  public static void main(String[] args) {
    Scanner i1 = new Scanner(System.in);
    System.out.println("请输入num1:");
    int num1 = i1.nextInt();
    System.out.println("请输入num2:");
    int num2 = i1.nextInt();
    System.out.println("请输入num3:");
    int num3 = i1.nextInt();
    if (num1 < num2) {
      if (num2 < num3) {
        System.out.println(num3 + " > " + num2 + " > " + num1);
      }else if (num1 < num3){
        System.out.println(num2 + " > " + num3 + " > " + num1);
      }else {
        System.out.println(num2 + " > " + num1 + " > " + num3);
      }
    }else{
      if (num1 < num3) {
        System.out.println(num3 + " > " + num1 + " > " + num2);
      }else if (num2 < num3){
        System.out.println(num1 + " > " + num3 + " > " + num2);
      }else {
        System.out.println(num1 + " > " + num2 + " > " + num3);
      }
    }
  }
}
