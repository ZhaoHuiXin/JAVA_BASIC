class SwitchDemo
{
  public static void main(String[] args)
  {
    int x = 4;
    switch(x) // 只接受4种类型byte，short，int，char
    {          // case 和default定义位置是随意的，都会先读case
      default:
            System.out.println("not 4 not 6,it is "+x);
            // break;  // switch两种结束方式：1.break， 2.大括号结束,如果default在case上面，
            // 当执行了所有的case没有结果，执行default，然后没有break(没有break就刹不住车了)，
            // switch会接着执行往下的所有语句不判断case，直到遇到break或大括号结束。这里讲打印第一句和第二句！
      case 4:
            System.out.println("case 4");
            // break;
      case 6:
            System.out.println("i'm six");
            break;
    }

    int a = 4, b = 2;
    char ch = '+';

    switch(ch)
    {
            case '-':
                    System.out.println(a-b);
                    break;
            case '+':
                    System.out.println(a+b);
                    break;
            default:
                    System.out.println("unknown operate");
                    break;
    }
  }
}
