public class Calculator2
{
   public static void main(String[] args)
   {
       Calculator2 obj = new Calculator2();
       int result = obj.addition(45, 45);
       System.out.println(result);

       result = mul(10, 40);
       System.out.println(result);
   }
   public int addition(int a, int b)
   {
       System.out.println("This is addition from Calculator class");
       return a+b;
   }
   public static int mul(int a, int b)
   {
       System.out.println("This is multiplication from Calculator class");
       return a*b;
   }
}