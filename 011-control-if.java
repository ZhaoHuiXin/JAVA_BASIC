class DemoIf
{
  public static void main(String[] args)
  {
    int x = 3;
    if (x > 1)
    {
      System.out.println("x > 1, x="+x);
    }
    // 如果if控制的语句只有一条可以省略{}；if只控制离他最近的那条语句
    if (x > 1)
            System.out.println("a");
    // System.out.println("adfasd");
    else if (x > 2)
            System.out.println("b");
    else
            System.out.println("c");
    // if else简写格式是: 变量=(条件表达式)?表达式1: 表达式2;
    // 三元运算符好处是可以简化 if else 代码，弊端：因为是一个运算符!!，所以运算完必须要有一个结果；if else语句不必非要有结果。
  }
}

