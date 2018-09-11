class NineMutiply
{
  public static void main(String[] args)
  {
    for (int a=0; a<5; a++)
    {
      for (int b=1; b<=a+1; b++)
      {
        System.out.print(b);
      }
      System.out.println();
    }

    for (int x = 1; x<=9; x++)
    {
      for (int y=1; y<=x; y++)
      {
        System.out.print(y+"*"+x+"="+(x*y)+"\t");
      }
      System.out.println();
    }
  }
}
