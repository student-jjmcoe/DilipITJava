public class PMyDetailsAssignment3_2
{
      static String surname ="Chindage";
      static String village ="Ispurli";
      int age = 21;
      int weight = 57;
      public static void main(String[] args)
      {
             staticInfo("Shweta", 21);
             PMyDetailsAssignment3_2 obj = new PMyDetailsAssignment3_2();
             obj.nonStaticInfo();     
 
      }
      public static void staticInfo(String name, int age)
      {
          System.out.println(name);
          System.out.println(age);
          System.out.println(surname);
          System.out.println(village);
      }
      public void nonStaticInfo()
      {
          System.out.println(weight);
          System.out.println(age);
      }
}
      