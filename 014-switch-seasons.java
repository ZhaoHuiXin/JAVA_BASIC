class SwitchSeason
{
  public static void main(String[] args)
  {
    int x = 12;
    switch (x)
    {
      case 3:
      case 4:
      case 5:
              System.out.println("春季");
              break;
      case 6:
      case 7:
      case 8:
              System.out.println("夏季");
              break;
    //  case 9||10||11:  不能用啊；错误: 二元运算符 '||' 的操作数类型错误
      case 9:
      case 10:
      case 11:
              System.out.println("秋季");
              break;
      case 12:
      case 1:
      case 2:
              System.out.println("冬季");
              break;
    }
    // 值不多的话用switch完成，加载时把答案都带入内存了，值多的话、含有区间（只能用if完成）
  }
}
