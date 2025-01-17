public class Without_Static_use
{
      String clgName = "Dr. JJMCOE";
      String principalName = "ABC";
      int estYear = 1990;

      int studentId;
      String name;
      long mobile;
      char gender;
      int yearOfDOB;
      int marks;
      double avgOfMarks;

      public static void main(String[]args)
      {
           Without_Static_use x = new Without_Static_use();
           Without_Static_use x2 = new Without_Static_use();
           Without_Static_use x3 = new Without_Static_use();

           System.out.println(x.clgName);
           System.out.println(x.principalName);
           System.out.println(x.estYear);         
           System.out.println(x.studentId);//0
           System.out.println(x.name);
           System.out.println(x.mobile);
           System.out.println(x.gender);
           System.out.println(x.yearOfDOB);
           System.out.println(x.marks);
           System.out.println(x.avgOfMarks);
           
           // changing value of instance variable
           x.studentId = 102;
           System.out.println(x.studentId);//102
           System.out.println(x2.studentId);//0

           x.name = "Shweta";
           System.out.println(x.name);//Shweta
           System.out.println(x2.name);//null

           System.out.println("All Students college name");
           System.out.println(x.clgName);
           System.out.println(x2.clgName);
           System.out.println(x3.clgName);
           
 
           x.clgName = "XYZ";
           System.out.println(x.clgName);
           System.out.println(x2.clgName);
           System.out.println(x3.clgName);
      }
 }
