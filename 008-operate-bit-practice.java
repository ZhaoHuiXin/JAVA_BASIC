class OperatePractice
{
  public static void main(String[] args)
  {
    //最有效率的方式算出2乘以8等于几？   利用位运算，位运算就是对 2^n 的乘除操作
    System.out.println(2 << 3);
    int n=3, m=8;
    // 使用位运算实现变量互换 1^1=0    1^0=1
    n = n^m;
    m = n^m;
    n = n^m;
    System.out.println("n="+n+",m="+m);
  }
}
