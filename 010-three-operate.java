class TernaryOperate
{
  public static void main(String[] args)
  {
    int x=3,y; // 一次声明多个，x为int类型3，y为int类型，放在堆中，没有初始化，没有值
    // System.out.println(y);
    y = (x>1)?100:200;
    System.out.println("y= "+y);
  }
}
