public class NStaticNonstaticVariables
{
      static String name = "Shweta";
      int count = 300;
      public static void main(String[] args)
      {
        System.out.println(name);
        NStaticNonstaticVariables obj = new NStaticNonstaticVariables();
        System.out.println(obj.count);
        obj.printData();
      }
      public void printData()
      {
        System.out.println(name);
        System.out.println(count);
      }
      public static String getName()
      {
        return name;
      }


}