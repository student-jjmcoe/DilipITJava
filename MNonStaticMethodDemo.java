class MNonStaticMethodDemo
{
    public static void main(String[] args)
    {
        MNonStaticMethodDemo x = new MNonStaticMethodDemo();
        int result = x.addition( 30, 40);//non static
        System.out.println(result);

        result = sub(50, 6);//static method
        System.out.println(result);
         
    }
    public int addition(int x, int y)
    {
       int result = mul(10,20);//static method
       System.out.println(result);

       result = sub1(30, 6);//static method
       System.out.println(result);

       System.out.println("Addition.....");
       return x+y;
    }
    public static int sub(int x, int y)
    {
       MNonStaticMethodDemo a = new MNonStaticMethodDemo();
       int result = a.mul(11,20);//static method
       System.out.println(result);

       System.out.println("substraction.....");
       return x-y;
    }
    public static int sub1(int x, int y)
    {
       System.out.println("substraction1.....");
       return x-y;
    }
    public int mul(int x, int y)
    {
        System.out.println("multiplication.....");
        return x*y;
    }

}