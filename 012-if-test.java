class IfTest
{
  public static void main(String[] args)
  {
    //需求：根据用户定义的数值不同，打印对应的英文日期
    int num = 2;
    if (num == 1)
    {
      System.out.println("Monday");
    }
    else if (num == 2)
    {
      System.out.println("Tuesday");
    }
    else
    {
      System.out.println("Error");
    }
    // 需求根据用户指定月份，打印该月份所属的季节
    // 345春  678夏季   91011秋季  1212冬季
    int x = 4;
    
    if (x == 3 || x == 4 | x == 5)
    {
      System.out.println(x + "月份是春季");
    }
    else if (x==6 | x==7| x==8)
    {
      System.out.println(x + "月份是夏季");
    }
  }

}
