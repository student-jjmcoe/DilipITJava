class KMethodDemoTwo
{
    public static void main(String[]args)
    {
          printCourseInfo();
    }
    public static long myMobileNo()
    {
          System.out.println("Returning my mobile no.");
          return 1234567890;
     }
     public static String courseName()
     {
          long myMobileNo = myMobileNo();
          System.out.println(myMobileNo);

          System.out.println("Returning Course name");
          return "Java Full Stack";
     }
     public static void printCourseInfo()
     {
           String courseName = courseName();
           System.out.println(courseName);

           System.out.println("This is named DilipIT");
           System.out.println("Dilip singh is trainer");
     }
}