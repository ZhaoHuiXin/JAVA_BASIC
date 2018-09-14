/*
 * 函数：定义在类中的具有特定功能的一段独立小程序
 * java中函数也称为方法
 * 函数的格式：
 *    修饰符  返回值类型  函数名(参数类型  形式参数1,参数类型 形式参数2..)
 *    {
 *      执行语句；
 *      return 返回值；
 *    }
 * 特点：
 *    函数只有被调用才会被执行；
 *    对于函数没有具体返回值的情况，返回值类型用关键字void表示，
 *    那么该函数中的return;语句如果在最后一行可以省略不写。写也没毛病
 *    
 *    注意：
 *      函数中只能调用函数，不可以在函数内部定义函数。(主函数也是函数)
 *      定义函数时，函数的结果应该返回该调用者，交由调用者处理。
 *
 * 
 */
class FunctionDemo
{
  public static void main(String[] args)
  {
   int res = getResult(4);
   System.out.println(res);
   /* hw()
      25-function.java:27: 错误: 找不到符号
       hw();
       ^
      符号:   方法 hw()
      位置: 类 FunctionDemo
      1 个错误
   */
   TestF.hw();
  }
  /* 
    可以么有public，static（有是静态函数可以直接被类名调用，没有static想调用该函数必须先实例化一个类的对象）
    主函数是静态的，只会调用被静态修饰的内容
    不是必须放在主函数里面，只要在类里面就行了；主函数才是程序入口；
  JVM启动时会去找public static main函数，并且参数类型是字符串类型的数组

    public：如果你不写的话默认是friendly的，在本包中可以调用，如果在其他包中是不能调用构造方法的，
  也就是说你的这个类在别的包中不能实例化，如果你写了public就在哪里都能实例化，如果你写了 privice 就是本类中才能实例化，

    不用public就是private，default，protected三种之一。
    private，私有的访问权限，也是最严格的访问权限，仅只能在设置了该权限的类中访问，
  利用这个访问权限，表现出封装思想。
    default，默认的访问权限，也是可以省略的访问权限，它不仅能在设置了该权限的类中访问，
  也可以在同一包中的同一个类或子类中访问。
    protected，受保护的访问权限，它除了具有default的访问权限外，还可以在不同包中所继承的子类访问。
    public，公有的访问权限，也是最宽松的访问权限，不仅可以是同一个类或子类，
  还是同一个包中的同一个类或子类，又还是不同包中的同一个类或子类，都可以访问。
  */
  public static int getResult(int x)
   {
    return x * 3 + 5;
   }
}

class TestF{
  public static void hw(){
    System.out.println("hellow world");
  }
}
