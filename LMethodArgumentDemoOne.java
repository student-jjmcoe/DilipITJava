class LMethodArgumentDemoOne
{
     public static void main(String[] args)
     {
         int result = addition(10,30);
         System.out.println(result);
         
         result = addition(104,340);
         System.out.println(result);
         
         result = addition(105,303454);
         System.out.println(result);
         
         //result = addition(10);//cannot be applied to given types
         //System.out.println(result);
         
         //result = addition(10,30.4564);
         //incompatible types: possible lossy conversion from double to int
         //System.out.println(result);

         printMyName("Shweta");
         printMyName("10000");

         printMyInfo("chindagesh@gmail.com",21);
         printMyInfo("chsh@gmail.com",22);

    }
    public static int addition(int x, int y)
    {
         return x+y;
    }
    public static void printMyName(String name)
    {
         System.out.println(name);
    }
    public static void printMyInfo(String email, int age)
    {
         System.out.println(email);
         System.out.println(age);
    }


}
    
         