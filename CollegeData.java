public class CollegeData
{
    static String clgName ="DR.JJMCOE";
    int clgStudentCount = 666;
    public static void main(String[] args)
     {
        System.out.println(CollegeData.clgName);
        CollegeData d = new CollegeData();
        System.out.println(d.clgStudentCount);
 
        d.clgInfo();
     }
     public void clgInfo()
   {
       System.out.println(clgName);
       System.out.println(clgStudentCount);
   }

    
}

