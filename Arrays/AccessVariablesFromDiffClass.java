public class AccessVariablesFromDiffClass
{
     public static void main(String[] args)
     {
        System.out.println(CollegeData.clgName);
        CollegeData d = new CollegeData();
        System.out.println(d.clgStudentCount);

        
     }
}