class ForTest
{
  public static void main(String[] args)
  {
    int x=1;
    for (System.out.println("x-test-初始化表达式");x<3;System.out.println("x-test-循环表达式"))
    {
      System.out.println("x-test-我应该出现在初始化表达式之后循环表达式之前");
      x ++;
    }
    // for (只要是合法的表达式就行；判断语句；只要是合法的表达式就行)
    // for 循环机制就是先进行一次初始化表达式，接着进入循环体--循环表达式--循环体--循环表达式--循环体。。。。。。

    int y=1;
    for (System.out.println("y-test初始化表达式");y<3;System.out.println("y-test-循环表达式"),y++)
    {
      System.out.println("y-test-我应该出现在初始化表达式之后循环表达式之前");
      //x ++
    }

    int z = 0;
    for(;z<3;) 
    {
      System.out.println("z-test");
      z++; // 没毛病，初始化表达式和循环后表达式都可以不写
    }
    
    /*
     * 无限循环的最简单表达式 for(;;){}
     * while(true){}
     */
  }
}
