/*
家庭收支项目
*/
class FamilyAccount {
  public static void main(String[] args) {
    boolean ifFlag = true;
    String details = "收支\t账户金额\t收支金额\t说    明\n\n";
    int balance = 10000;
    while (ifFlag) {
      System.out.println("\n-----------------家庭收支记账软件-----------------\n");
      System.out.println("                   1 收支明细");
      System.out.println("                   2 登记收入");
      System.out.println("                   3 登记支出");
      System.out.println("                   4 退    出\n");
      System.out.print("                   请选择(1-4)：");
      char key = Utility.readMenuSelection();
      switch (key) {
        case '1' :
          System.out.println("\n-----------------当前收支明细记录-----------------");
          System.out.println(details);
          System.out.println("--------------------------------------------------");
          break;
        case '2' :
          System.out.print("本次收入金额：");
          int add_money = Utility.readNumber();
          System.out.print("本次收入说明：");
          String add_info = Utility.readString();

          balance += add_money;
          details += "收入\t" + balance + "\t\t" + add_money + "\t\t" + add_info + "\n";
          System.out.println("---------------------登记完成---------------------\n");
          break;
        case '3' :
          //System.out.println("3 登记支出");
          System.out.print("本次支出金额：");
          int pay_money = Utility.readNumber();
          System.out.print("本次支出说明：");
          String pay_info = Utility.readString();

          balance -= pay_money;
          details += "收入\t" + balance + "\t\t" + pay_money + "\t\t" + pay_info + "\n";
          System.out.println("---------------------登记完成---------------------\n");
          break;
        case '4' :
          System.out.print("确认是否退出（Y/N）: ");
          char yn = Utility.readConfirmSelection();
          if (yn == 'Y') {
            ifFlag = false;
          }
      }
    }
  }
}
