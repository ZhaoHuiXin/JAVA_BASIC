class ForNest
{
  public static void main(String[] args)
  {
    for(int x=0; x<3; x++)
    {
      for(int y=0; y<4; y++)
      {
        System.out.print("ok");
      }
      System.out.println();
    }

    int c = 5;
    for (int a=0; a<5; a++)
    {
      for (int b=0; b<a; b++)
      {
        System.out.print("x");
      }
      System.out.println();
      c --;
    }
  }
}
