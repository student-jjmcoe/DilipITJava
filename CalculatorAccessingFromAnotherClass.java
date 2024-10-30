public class CalculatorAccessingFromAnotherClass
{
   public static void main(String[] args)
   {
       Calculator2 obj2 = new Calculator2();
       int result = obj2.addition(45, 45);
       System.out.println(result);

       result = Calculator2.mul(10, 40);
       System.out.println(result);

        result = obj2.mul(10, 40);
       System.out.println(result);

       CalculatorAccessingFromAnotherClass x = new CalculatorAccessingFromAnotherClass();
       result = x.sub(100, 40);
       System.out.println(result);

       result = mul(200, 40);
       System.out.println(result);


   }
   public int sub(int a, int b)
   {
       System.out.println("This is sub from CalculatorAccessingFromAnotherClass class");
       return a-b;
   }
   public static int mul(int a, int b)
   {
       System.out.println("This is multiplication from CalculatorAccessingFromAnotherClass class");
       return a*b;
   }


}