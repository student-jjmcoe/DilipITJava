public class Calculator
{
     static int a = 40;
     static int b = 20;

     public static void main(String[]args)
     {
         Calculator c1 = new Calculator();

         double result = 0;
         result = a/b;
         System.out.println("div="+result);

         int addResult = a+b;
         System.out.println("Add="+addResult);

         int subResult = a-b;
         System.out.println("sub="+subResult);
     }
}