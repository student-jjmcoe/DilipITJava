public class CalculatorAccessingFromAnotherClassNonStaticMethod
{
   public static void main(String[] args)
   {
         CalculatorAccessingFromAnotherClassNonStaticMethod w = new CalculatorAccessingFromAnotherClassNonStaticMethod();
         w.printAddition(10,59);
   }
   public void printAddition(int a, int b)
   {
     //call calculator addition method
       Calculator2 obj = new Calculator2();
       int result = obj.addition(a, b);
       System.out.println(result);

       result = Calculator2.mul(a, b);
       System.out.println(result);
   }
}