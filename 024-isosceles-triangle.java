/*
 打印等腰三角形：思路打印反三角+正三角
 */
class IsoscelesTriangle
{
  public static void main(String[] args)
  {
    for (int x = 0; x < 5; x++)
    {
      for (int y = x+1; y<5;y++)
      {
        System.out.print("-");
      }
      for (int z=0; z<=x; z++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
