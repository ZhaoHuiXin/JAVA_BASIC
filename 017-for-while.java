class ForWhile
{
  public static void main(String[] args)
  {
    /*
     * for (初始化语句；循环条件表达式；循环后的操作表达式)
     * {
     *    执行语句：
     * }
     */
     for(int x = 0; x < 3; x++)
     {
        System.out.println("x="+x);
     }
      // 作用域问题，x在for循环中创建，只在for的大括号内有效，
     // 离开大括号，x就在内存中消失了
     // System.out.println("x ======="+x);
     // //17-for-while.java:17: 错误: 找不到符号

     int y = 0;
     while (y < 3)
     {
        System.out.println("y="+y);
        y++;
     }
     System.out.println("y====="+y);
  }
}
// 如果变量只为循环增量存在，那么用for更好，省内存
