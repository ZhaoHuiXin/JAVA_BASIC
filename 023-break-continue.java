/*
 * break: 作用于 switch和循环结构(跳出所在循环;给循环起名字就能指定跳了)
 * 标号只能用在循环上
 * continue: 只能作用域循环结构 
 * break和continue单独存在时，下面不能有语句
 */

class BreakContinue
{
  public static void main(String[] args)
  {
w:for (int x=0; x<5; x++)
  {
    System.out.println("我是外循环");
    n:for (int y=0; y<5;y++)
      {
        System.out.println("我是内循环");
        break w;
      }
  }

  for(int x=1; x<=10; x++)
  {
    if (x%2==1)
    {
       continue;
    }
    System.out.println(x);
  }
  }
}
