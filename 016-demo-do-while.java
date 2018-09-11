class DoWhileDemo
{
  public static void main(String[] args)
  {
    int x=0;
    do
    {
      System.out.println("do,while,x= "+x);
      x ++;
    }
    while (x<0);
    
    int y = 0;
    while (y<0)
    {
      System.out.println("while, y="+y);
    }
    /* while与do while 的区别：
     *    1.while先判断条件，只有条件满足才执行循环体
     *    2.do while先执行循环体，再判断条件，条件满足再继续执行循环体
     */

  }
  
}
