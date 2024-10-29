public class MethodsDemo
{
    public static void main(String[]args)
    {
         int a = 10;
         int b = 20;
         System.out.println(a+b);
         
         int resultingNum = addition();//calling a method addition
         System.out.println(resultingNum);

         String resultingName = MyName();//calling a method MyName()
         System.out.println(resultingName);

     }
     //this is a method declaration
     public static int addition()
     {
          int x = 30;
          int y = 40;
          int result = x+y;
          System.out.println(result);

          return 40;
      }
      public static String MyName()
      {
           return "1000Shweta";
      }
}