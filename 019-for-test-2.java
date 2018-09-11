/*
 * 1.获取1~10的和并打印
 * 2.1~100之间的7的倍数的个数并打印
 */
class ForTest2
{
  public static void main(String[] args)
  {
    int count = 0;
    for(int i=0;i<11;i++)
    {
      count += i;
      //System.out.println("Count is "+count);
    }
    System.out.println(count);
    int sum = 0;
    for(int n = 1;n<=100;n++)
    {
      if(n%7==0)
      {
        sum ++;
        //System.out.println(n);
      }
    }
    System.out.println(sum);
  }
}
