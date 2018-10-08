class MoveLR
{
  public static void main(String[] args)
  {
    System.out.println(Integer.toBinaryString(60));

    int num = 60;  //  0011 1100
    
    // 获取60最低4位，通过&15;
    num & 15 =12;

    // 要获取下一组4位，将60右移4位
    int temp = 60 >> 4;

    // 对temp的值进行最低4位的获取
    temp & 15 = 3;
    // 得到的16进制结果3C 对应十进制 3*16 + 12 = 60
    // 同理，取8进制就是右移3位， &7
    // 同理，取二进制就是右移1位， &1
  }

}
